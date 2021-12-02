package ovgu.pave.core.algorithm.utilities;

import java.util.HashMap;

import ovgu.pave.core.Core;
import ovgu.pave.handler.modelHandler.NetworkHandler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.RouteElement;

public class RouteUpdater {

	public static void updateAllElements(Core core, Route route, int index) {
		HashMap<Request, Long> latestDrivingTimes = new HashMap<Request, Long>();
		for (int i = index; i < route.getRouteElements().size(); i++) {
			updateRouteElement(core, route, i, latestDrivingTimes);
		}
	}

	private static void updateRouteElement(Core core, Route route, int index,
			HashMap<Request, Long> latestDrivingTimes) {

		RouteElement prevElement = route.getRouteElements().get(index - 1);
		RouteElement currentElement = route.getRouteElements().get(index);

		long travelDuration = NetworkHandler.getTravelDuration(core.getNetwork(), core.getConfig(), prevElement,
				currentElement);
		currentElement.setDrivingTime(prevElement.getDrivingTime() + travelDuration);

		if (SolutionHandler.isFirstRequestActivityRouteElement(currentElement)) {
			Request request = SolutionHandler.getRequest(currentElement);
			latestDrivingTimes.put(request, currentElement.getDrivingTime() + request.getMaxDrivingDuration());
		} else if (SolutionHandler.isSecondRequestActivityRouteElement(currentElement)
				&& latestDrivingTimes.containsKey(SolutionHandler.getRequest(currentElement))) {
			currentElement.setLatestDrivingTime(latestDrivingTimes.remove(SolutionHandler.getRequest(currentElement)));
		}

		currentElement
				.setUtilization(prevElement.getUtilization() + SolutionHandler.getChangeInQuantity(currentElement));

		long newServiceBegin;
		if (SolutionHandler.isSupportRouteElement(currentElement)) {
			newServiceBegin = SolutionHandler.getServiceEnd(route, index - 1) + travelDuration;
		} else {
			if (SolutionHandler.getServiceEnd(route, index - 1) < SolutionHandler.getRequest(currentElement)
					.getRequestTime())
				newServiceBegin = SolutionHandler.getRequest(currentElement).getRequestTime();
			else
				newServiceBegin = SolutionHandler.getServiceEnd(route, index - 1);

			newServiceBegin += travelDuration;
			if (SolutionHandler.isFirstRequestActivityRouteElement(currentElement)
					&& newServiceBegin < SolutionHandler.getFirstRequestActivity(currentElement).getEarliestArrival())
				newServiceBegin = SolutionHandler.getFirstRequestActivity(currentElement).getEarliestArrival();
		}
		currentElement.setServiceBegin(newServiceBegin);
	}
}
