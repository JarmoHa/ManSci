package ovgu.pave.experiments.Output;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ovgu.pave.handler.Handler.Result;
import ovgu.pave.handler.modelHandler.InputHandler;
import ovgu.pave.handler.modelHandler.NetworkHandler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.input.RequestActivity;
import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.RouteElement;

public class StatisticsOutput {

	public static List<List<String>> createStatisticOutputs(List<Result> results) {
		List<List<String>> statisticOutputs = new ArrayList<List<String>>();

		for (int repetition = 0; repetition < results.size(); repetition++) {
			statisticOutputs.add(determineStatistics(results.get(repetition), repetition));
		}

		statisticOutputs.add(0,
				Arrays.asList("Repetition", "AcceptanceRate", "AcceptedRequests", "Requests", "Vehicles", "IdleTime",
						"TravelTime", "EmptyTravelTime", "AVGWaitingTime", "AVGDetour", "AVGStopOverTime"));
		return statisticOutputs;
	}

	private static ArrayList<String> determineStatistics(Result result, double repetitionId) {

		// Performance
		double idleTime = 0;
		double travelTime = 0;
		double emptyTravelTime = 0;

		// Quality of service
		long waitingTime = 0;
		long detour = 0;
		long stopOverTime = 0;

		long currentTravelTime = 0;
		int currentUtilization = 0;
		for (Route route : result.getSolution().getRoutes()) {
			currentUtilization = 0;
			for (int i = 1; i < route.getRouteElements().size() - 1; i++) {
				RouteElement prevElement = route.getRouteElement(i - 1);
				RouteElement element = route.getRouteElement(i);

				currentTravelTime = NetworkHandler.getTravelDuration(result.getNetwork(), result.getConfig(),
						prevElement, element);
				travelTime += currentTravelTime;

				if (currentUtilization == 0) {
					emptyTravelTime += currentTravelTime;
				}

				idleTime += (element.getServiceBegin() - (SolutionHandler.getServiceEnd(prevElement) + NetworkHandler
						.getTravelDuration(result.getNetwork(), result.getConfig(), prevElement, element)));

				if (SolutionHandler.isRequestActivityRouteElement(element)) {
					Request request = SolutionHandler.getRequest(element);
					RequestActivity requestActivity = SolutionHandler.getRequestActivity(element);

					if (InputHandler.isFirstRequestActivity(requestActivity)) {
						if (element.getServiceBegin() > request.getRequestTime())
							waitingTime += element.getServiceBegin() - request.getRequestTime();

						long currentStopoverTime = 0;
						for (int j = i + 1; j < route.getRouteElements().size() - 1; j++) {
							if (SolutionHandler.isRequestActivityRouteElement(route.getRouteElement(j))) {
								if (request != SolutionHandler.getRequest(route.getRouteElement(j))) {
									currentStopoverTime += route.getRouteElement(j).getServiceDuration();
								} else {
									detour += route.getRouteElement(j).getServiceBegin()
											- SolutionHandler.getServiceEnd(route, i)
											- NetworkHandler.getTravelDuration(result.getNetwork(), result.getConfig(),
													element, route.getRouteElement(j))
											- currentStopoverTime;
									stopOverTime += currentStopoverTime;
									break;
								}
							}
						}
					}
					currentUtilization += SolutionHandler.getChangeInQuantity(requestActivity);
				}
			}
		}

		ArrayList<String> statistics = new ArrayList<String>();

		statistics.add(String.valueOf(repetitionId));
		statistics.add(String.valueOf(result.getSolution().getScore()));

		statistics.add(String.valueOf(result.getSolution().getAcceptedRequests().size()));
		statistics.add(String.valueOf(
				result.getSolution().getAcceptedRequests().size() + result.getSolution().getRejectedRequests().size()));
		statistics.add(String.valueOf(result.getSolution().getRoutes().size()));

		statistics.add(String.valueOf(Math.round(idleTime / 60000.0)));
		statistics.add(String.valueOf(Math.round(travelTime / 60000.0)));
		statistics.add(String.valueOf(Math.round(emptyTravelTime / 60000.0)));

		// Quality of service
		statistics.add(String.valueOf(
				Math.round(((double) waitingTime / 60000.0 / result.getSolution().getAcceptedRequests().size()) * 100.0)
						/ 100.0));
		statistics.add(String.valueOf(
				Math.round(((double) detour / 60000.0 / result.getSolution().getAcceptedRequests().size()) * 100.0)
						/ 100.0));
		statistics.add(String.valueOf(Math
				.round(((double) stopOverTime / 60000.0 / result.getSolution().getAcceptedRequests().size()) * 100.0)
				/ 100.0));

		return statistics;
	}
}
