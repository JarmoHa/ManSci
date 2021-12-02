package ovgu.pave.handler.modelHandler;

import java.util.ArrayList;
import java.util.List;

import ovgu.pave.model.config.Config;
import ovgu.pave.model.input.FirstRequestActivity;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.input.RequestActivity;
import ovgu.pave.model.input.SecondRequestActivity;
import ovgu.pave.model.solution.SolutionFactory;
import ovgu.pave.model.solution.SupportRouteElement;
import ovgu.pave.model.solution.RequestActivityRouteElement;
import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.RouteElement;
import ovgu.pave.model.solution.Solution;
import ovgu.pave.model.input.Vehicle;
import ovgu.pave.model.network.Location;
import ovgu.pave.model.network.Network;

public class SolutionHandler {

	/*
	 * 
	 * init solutions
	 *
	 */

	public static List<Solution> getSolutions(int runs) {

		List<Solution> solutions = new ArrayList<Solution>();
		for (int r = 0; r < runs; r++) {
			solutions.add(SolutionFactory.eINSTANCE.createSolution());
		}

		return solutions;
	}

	public static void initEmptyRoutesForVehicles(Solution solution, List<Vehicle> vehicles) {
		for (Vehicle vehicle : vehicles)
			solution.getRoutes().add(SolutionHandler.createRoute(vehicle));
	}

	/*
	 * 
	 * instance methods
	 * 
	 */

	public static Solution copySolution(Solution solution) {
		return copySolution(solution, false);
	}

	public static Solution copyEmptySolution(Solution solution) {
		return copySolution(solution, true);
	}

	private static Solution copySolution(Solution solution, boolean reset) {
		Solution copy = SolutionFactory.eINSTANCE.createSolution();

		for (Route route : solution.getRoutes())
			copy.getRoutes().add(copyRoute(route, reset));

		if (!reset) {
			copy.setScore(solution.getScore());
			copy.getRejectedRequests().addAll(solution.getRejectedRequests());
			copy.getAcceptedRequests().addAll(solution.getAcceptedRequests());
		}
		return copy;
	}

	/*
	 * 
	 * static methods
	 * 
	 */

	public static Route createRoute(Vehicle vehicle) {
		Route route = SolutionFactory.eINSTANCE.createRoute();
		route.setVehicle(vehicle);
		return route;
	}

	public static RequestActivityRouteElement createRequestActivityRouteElement(RequestActivity activity) {
		RequestActivityRouteElement routeElement = SolutionFactory.eINSTANCE.createRequestActivityRouteElement();
		routeElement.setRequestActivity(activity);
		routeElement.setServiceDuration(activity.getServiceDuration());
		return routeElement;
	}

	public static SupportRouteElement createSupportRouteElement(Location location) {
		SupportRouteElement routeElement = SolutionFactory.eINSTANCE.createSupportRouteElement();
		routeElement.setLocation(location);
		return routeElement;
	}

	private static Route copyRoute(Route route, boolean reset) {
		Route copy;
		copy = createRoute(route.getVehicle());
		if (!reset) {
			for (RouteElement routeElement : route.getRouteElements())
				copy.getRouteElements().add(copyRouteElement(copy, routeElement));
		}
		return copy;
	}

	private static RouteElement copyRouteElement(Route route, RouteElement routeElement) {
		RouteElement copy = SolutionFactory.eINSTANCE.createRouteElement();
		if (isRequestActivityRouteElement(routeElement)) {
			RequestActivity activity = ((RequestActivityRouteElement) routeElement).getRequestActivity();
			copy = createRequestActivityRouteElement(activity);
		} else if (isSupportRouteElement(routeElement)) {
			Location location = ((SupportRouteElement) routeElement).getLocation();
			copy = createSupportRouteElement(location);
			((SupportRouteElement) copy).setTimeStamp(((SupportRouteElement) routeElement).getTimeStamp());
		}

		copy.setServiceBegin(routeElement.getServiceBegin());
		copy.setDrivingTime(routeElement.getDrivingTime());
		copy.setUtilization(routeElement.getUtilization());
		copy.setServiceDuration(routeElement.getServiceDuration());
		copy.setLatestDrivingTime(routeElement.getLatestDrivingTime());

		copy.setRoute(route);
		return copy;
	}

	public static void insertRequest(Route route, Request request, int indexFirstActivity, int indexSecondActivity) {

		if (request.getSecondActivity() != null) {
			insertActivity(route, request.getSecondActivity(), indexSecondActivity);
		}
		insertActivity(route, request.getFirstActivity(), indexFirstActivity);
	}

	public static void insertActivity(Route route, RequestActivity activity, int index) {
		insertRouteElement(route, createRequestActivityRouteElement(activity), index);
	}

	public static void insertRouteElement(Route route, RouteElement routeElement, int index) {
		routeElement.setRoute(route);
		route.getRouteElements().add(index, routeElement);
	}

	public static int getRouteElementIndex(Route route, RouteElement routeElement) {
		for (int i = 0; i < route.getRouteElements().size(); i++)
			if (route.getRouteElements().get(i) == routeElement)
				return i;
		return -1;
	}

	public static RouteElement findRouteElement(Route route, RequestActivity requestActivity) {
		int index = findRouteElementIndex(route, requestActivity);
		if (index == -1)
			return null;
		else
			return route.getRouteElements().get(index);
	}

	private static int findRouteElementIndex(Route route, RequestActivity requestActivity) {

		for (int i = 0; i < route.getRouteElements().size(); i++) {
			RouteElement routeElement = route.getRouteElements().get(i);
			if (isRequestActivityRouteElement(routeElement)) {
				RequestActivity foundRequestActivity = ((RequestActivityRouteElement) routeElement)
						.getRequestActivity();
				if (foundRequestActivity == requestActivity)
					return i;
			}
		}
		return -1;
	}

	public static int removeRequestFromRoute(Request request, Route route) {

		int indexFirstActivity = findRouteElementIndex(route, request.getFirstActivity());
		route.getRouteElements().remove(indexFirstActivity);

		if (request.getSecondActivity() != null) {
			int indexSecondActivity = findRouteElementIndex(route, request.getSecondActivity());
			route.getRouteElements().remove(indexSecondActivity);
		}
		return indexFirstActivity;
	}

	public static RequestActivity getRequestActivity(RouteElement routeElement) {
		if (isRequestActivityRouteElement(routeElement))
			return ((RequestActivityRouteElement) routeElement).getRequestActivity();
		else
			return null;
	}

	public static FirstRequestActivity getFirstRequestActivity(RouteElement routeElement) {
		if (isFirstRequestActivityRouteElement(routeElement))
			return (FirstRequestActivity) ((RequestActivityRouteElement) routeElement).getRequestActivity();
		else
			return null;
	}

	public static SecondRequestActivity getSecondRequestActivity(RouteElement routeElement) {
		if (isSecondRequestActivityRouteElement(routeElement))
			return (SecondRequestActivity) ((RequestActivityRouteElement) routeElement).getRequestActivity();
		else
			return null;
	}

	public static Request getRequest(RouteElement routeElement) {
		return getRequestActivity(routeElement).getRequest();
	}

	public static Location getLocation(RouteElement routeElement) {
		if (isRequestActivityRouteElement(routeElement))
			return ((RequestActivityRouteElement) routeElement).getRequestActivity().getLocation();
		else if (isSupportRouteElement(routeElement))
			return ((SupportRouteElement) routeElement).getLocation();
		else
			return null;
	}

	public static double getLatitude(RouteElement routeElement) {
		if (isRequestActivityRouteElement(routeElement))
			return ((RequestActivityRouteElement) routeElement).getRequestActivity().getLocation().getLat();
		else if (isSupportRouteElement(routeElement))
			return ((SupportRouteElement) routeElement).getLocation().getLat();
		else
			return -1;
	}

	public static double getLongitude(RouteElement routeElement) {
		if (isRequestActivityRouteElement(routeElement))
			return ((RequestActivityRouteElement) routeElement).getRequestActivity().getLocation().getLon();
		else if (isSupportRouteElement(routeElement))
			return ((SupportRouteElement) routeElement).getLocation().getLon();
		else
			return -1;
	}

	public static <T> boolean isRouteElement(T object) {
		return object instanceof RouteElement;
	}

	public static <T> boolean isRequestActivityRouteElement(T object) {
		return object instanceof RequestActivityRouteElement;
	}

	public static <T> boolean isFirstRequestActivityRouteElement(RouteElement routeElement) {
		if (routeElement instanceof RequestActivityRouteElement)
			return InputHandler.isFirstRequestActivity(getRequestActivity(routeElement));

		return false;
	}

	public static <T> boolean isSecondRequestActivityRouteElement(RouteElement routeElement) {
		if (routeElement instanceof RequestActivityRouteElement)
			return InputHandler.isSecondRequestActivity(getRequestActivity(routeElement));

		return false;
	}

	public static <T> boolean isSupportRouteElement(T object) {
		return object instanceof SupportRouteElement;
	}

	public static <T> boolean isRequestActivity(T object) {
		return object instanceof RequestActivity;
	}

	public static long getServiceEnd(Route route, int index) {
		return getServiceEnd(route.getRouteElements().get(index));
	}

	public static long getServiceEnd(RouteElement routeElement) {
		return routeElement.getServiceBegin() + routeElement.getServiceDuration();
	}

	public static <T1, T2> long getArrivalTime(Network network, Config config, T1 from, T2 to, Long serviceEnd) {
		return serviceEnd + NetworkHandler.getTravelDuration(network, config, from, to);
	}

	public static <T1, T2> long getServiceBegin(Network network, Config config, T1 from, T2 to, Long serviceEnd) {

		long arrivalTime = getArrivalTime(network, config, from, to, serviceEnd);

		if (isSupportRouteElement(to)) {
			return arrivalTime;
		}

		RequestActivity requestActivity = null;
		if (isRequestActivityRouteElement(to))
			requestActivity = getRequestActivity((RouteElement) to);
		else if (isRequestActivity(to)) {
			requestActivity = (RequestActivity) to;
		}

		if (requestActivity != null) {
			if (serviceEnd < requestActivity.getRequest().getRequestTime())
				arrivalTime = getArrivalTime(network, config, from, to, requestActivity.getRequest().getRequestTime());

			if (InputHandler.isFirstRequestActivity(requestActivity)
					&& arrivalTime < ((FirstRequestActivity) requestActivity).getEarliestArrival()) {
				arrivalTime = ((FirstRequestActivity) requestActivity).getEarliestArrival();

			}
			return arrivalTime;
		}

		System.out.println("Error in method getServiceBegin()");
		return -1;
	}

	public static <T> int getChangeInQuantity(T object) {

		RequestActivity requestActivity;
		if (isRequestActivity(object))
			requestActivity = (RequestActivity) object;
		else if (isRequestActivityRouteElement(object))
			requestActivity = getRequestActivity((RouteElement) object);
		else
			return 0;

		if (InputHandler.isFirstRequestActivity(requestActivity))
			return requestActivity.getRequest().getQuantity();
		else
			return -requestActivity.getRequest().getQuantity();
	}
}
