package ovgu.pave.core.algorithm;

import ovgu.pave.core.Core;
import ovgu.pave.core.algorithm.insertion.Insertion;
import ovgu.pave.core.algorithm.utilities.InitializeRoutes;
import ovgu.pave.core.algorithm.utilities.SolutionValidater;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.Solution;

public class Routing {

	public static Solution run(Core core) {

		InitializeRoutes.depotStartEnd(core);
		Solution finalSolution = SolutionHandler.copyEmptySolution(core.getSolution());
		finalSolution.setRunTime(System.nanoTime());

		while (!core.getInput().getRequests().isEmpty()) {

			Request request = core.getInput().getRequests().remove(0);
			VehicleLocationUpdater.updateAll(core, finalSolution, request.getRequestTime(), false);

			if (request.getRequestTime() < core.getConfig().getScenario().getPlanningPeriodBegin() + (3 * 600000)
					|| request.getRequestTime() > core.getConfig().getScenario().getPlanningPeriodBegin()
							+ core.getConfig().getScenario().getPlanningPeriodLength() - (3 * 600000)) {
				Insertion.minCostInsertion(core, request);
			} else {
				requestAcceptance(finalSolution, core, request);
			}
		}

		finishRouting(finalSolution, core);
		return finalSolution;
	}

	private static void requestAcceptance(Solution finalSolution, Core core, Request request) {

		if (Insertion.minCostInsertion(core, request)) {
			finalSolution.getAcceptedRequests().add(request);
		} else {
			finalSolution.getRejectedRequests().add(request);
		}
	}

	private static void finishRouting(Solution finalSolution, Core core) {

		for (int i = 0; i < core.getSolution().getRoutes().size(); i++) {
			Route route = core.getSolution().getRoutes().get(i);
			while (route.getRouteElements().size() > 0) {
				finalSolution.getRoutes().get(i).getRouteElements().add(route.getRouteElements().remove(0));
			}
		}

		finalSolution.setScore(Math.round(((double) finalSolution.getAcceptedRequests().size()
				/ (finalSolution.getAcceptedRequests().size() + finalSolution.getRejectedRequests().size())) * 1000.0)
				/ 1000.0);
		SolutionValidater.validateRoutes(core, finalSolution);
		finalSolution.setRunTime(System.nanoTime() - finalSolution.getRunTime());
	}
}
