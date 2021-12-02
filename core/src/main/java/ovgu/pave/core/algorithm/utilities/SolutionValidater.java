package ovgu.pave.core.algorithm.utilities;

import org.eclipse.emf.common.util.EList;

import ovgu.pave.core.Core;
import ovgu.pave.handler.modelHandler.NetworkHandler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.solution.RequestActivityRouteElement;
import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.RouteElement;
import ovgu.pave.model.solution.Solution;

public class SolutionValidater {

	public static void validateRoutes(Core core, Solution solution) {

		for (int i = 0; i < solution.getRoutes().size(); i++) {

			Route route = solution.getRoutes().get(i);
			EList<RouteElement> routeElements = route.getRouteElements();
			long capacity = route.getVehicle().getType().getCapacity();
			long utilisation = 0;

			if (routeElements.size() > 0 && !SolutionHandler.isSupportRouteElement(routeElements.get(0))) {
				System.out.println("Error in route: " + i + "-> The start element is missing");
			}

			for (int j = 1; j < routeElements.size() - 1; j++) {

				if (SolutionHandler.isRequestActivityRouteElement(routeElements.get(j))) {
					RequestActivityRouteElement element = (RequestActivityRouteElement) routeElements.get(j);

					if (SolutionHandler.isFirstRequestActivityRouteElement(routeElements.get(j))) {
						long drivingTime = 0;
						for (int k = j + 1; k < routeElements.size() - 1; k++) {
							drivingTime += NetworkHandler.getTravelDuration(core.getNetwork(), core.getConfig(),
									routeElements.get(k - 1), routeElements.get(k));
							if (SolutionHandler.isRequestActivityRouteElement(routeElements.get(k)) && SolutionHandler
									.getRequest(element) == SolutionHandler.getRequest(routeElements.get(k))) {
								if (drivingTime > SolutionHandler.getRequest(element).getMaxDrivingDuration())
									System.out.println("Error in route: " + i + " element: "
											+ element.getRequestActivity().getLocation().getId()
											+ " the max driving time is violated.");
								break;
							}
						}
					}

					if (Math.abs(element.getServiceBegin()
							- (SolutionHandler.getServiceEnd(route, j - 1) + NetworkHandler.getTravelDuration(
									core.getNetwork(), core.getConfig(), routeElements.get(j - 1), element))) > 10
							&& (!SolutionHandler.isFirstRequestActivityRouteElement(element)
									|| element.getServiceBegin() != SolutionHandler.getFirstRequestActivity(element)
											.getEarliestArrival())
							&& (Math.abs(element.getServiceBegin()
									- (element.getRequestActivity().getRequest().getRequestTime()
											+ NetworkHandler.getTravelDuration(core.getNetwork(), core.getConfig(),
													routeElements.get(j - 1), element))) > 10)

					) {
						System.out.println("Error in route: " + i + " element: "
								+ SolutionHandler.getRequest(element).getId()
								+ " in the calculation of the service begin by "
								+ Math.abs(element.getServiceBegin() - (SolutionHandler.getServiceEnd(route, j - 1)
										+ NetworkHandler.getTravelDuration(core.getNetwork(), core.getConfig(),
												routeElements.get(j - 1), element)))
										/ 60000
								+ " min.");
					}

					if (SolutionHandler.isRequestActivityRouteElement(element)) {
						if (element.getServiceBegin() > SolutionHandler.getRequestActivity(element)
								.getLatestArrival()) {
							if (SolutionHandler.isFirstRequestActivityRouteElement(element))
								System.out.println("Error in route: " + i + " first element: "
										+ SolutionHandler.getRequest(element).getId() + " is delayed by "
										+ Math.round((double) (element.getServiceBegin()
												- SolutionHandler.getRequestActivity(element).getLatestArrival())
												/ 1000)
										+ " sec.");
							else
								System.out.println("Error in route: " + i + " second element: "
										+ SolutionHandler.getRequest(element).getId() + " is delayed by "
										+ Math.round((double) (element.getServiceBegin()
												- SolutionHandler.getRequestActivity(element).getLatestArrival())
												/ 1000)
										+ " sec.");
						}
					}

					if (SolutionHandler.isFirstRequestActivityRouteElement(element)) {
						if ((element.getServiceBegin() < SolutionHandler.getFirstRequestActivity(element)
								.getEarliestArrival())) {
							System.out.println("Error in route: " + i + " element: "
									+ SolutionHandler.getRequest(element).getId() + " is to earlie.");
						}
					}

					if (SolutionHandler.isSecondRequestActivityRouteElement(element)) {
						if (element.getDrivingTime() > element.getLatestDrivingTime()) {
							System.out.println("Error in route: " + i + " element: "
									+ SolutionHandler.getRequest(element).getId() + " the driving time is violated.");
						}
					}

					if (element.getServiceBegin() - NetworkHandler.getTravelDuration(core.getNetwork(),
							core.getConfig(), routeElements.get(j - 1), element) < element.getRequestActivity()
									.getRequest().getRequestTime()) {

						System.out.println(
								"Error in Route: " + i + " element: " + SolutionHandler.getRequest(element).getId()
										+ " the departure begins before the request is known.");
					}

					utilisation = utilisation
							+ SolutionHandler.getChangeInQuantity(SolutionHandler.getRequestActivity(element));
					if (utilisation > capacity) {
						System.out.println("Error in Route: " + i + " element: "
								+ element.getRequestActivity().getLocation().getId()
								+ " the capacity of the vehicle is exceeded.");
					}
				}
			}
		}
	}
}
