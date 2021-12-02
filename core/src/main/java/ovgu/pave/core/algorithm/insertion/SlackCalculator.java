package ovgu.pave.core.algorithm.insertion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import ovgu.pave.core.Core;
import ovgu.pave.handler.modelHandler.AlgorithmObjectsHandler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.algorithmObjects.DrivingTimeInformation;
import ovgu.pave.model.algorithmObjects.Slacks;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.solution.Route;

public class SlackCalculator {

	public static Slacks getSlacks(Core core, Route route) {

		Slacks slacks = AlgorithmObjectsHandler.createSlacks();

		slacks.setRoute(route);

		EList<Long> timeSlack = slacks.getTimeSlack();
		EList<List<DrivingTimeInformation>> drivingTimeSlack = slacks.getDrivingTimeSlack();
		EList<Integer> utilizationSlack = slacks.getUtilizationSlack();

		timeSlack.add(Long.MAX_VALUE);
		drivingTimeSlack.add(new ArrayList<DrivingTimeInformation>());
		utilizationSlack.add(0, route.getVehicle().getType().getCapacity());

		long currentTimeSlack = Long.MAX_VALUE;
		long currentHiddenTimeSlack = 0;
		ArrayList<DrivingTimeInformation> currentDrivingTimeSlack;
		HashMap<Request, DrivingTimeInformation> affectedDrivingTimeSlacks = new HashMap<Request, DrivingTimeInformation>();

		for (int i = route.getRouteElements().size() - 2; i > 0; i--) {

			if (SolutionHandler.isFirstRequestActivityRouteElement(route.getRouteElement(i))) {
				currentHiddenTimeSlack = route.getRouteElement(i).getServiceBegin()
						- SolutionHandler.getArrivalTime(core.getNetwork(), core.getConfig(), route.getRouteElement(i - 1),
								route.getRouteElement(i), SolutionHandler.getServiceEnd(route, i - 1));
				affectedDrivingTimeSlacks.remove(SolutionHandler.getRequest(route.getRouteElement(i))).setFirstIndex(i);
			}

			if (SolutionHandler.isSecondRequestActivityRouteElement(route.getRouteElement(i))) {
				currentHiddenTimeSlack = 0;
				DrivingTimeInformation drivingTimeInformation = AlgorithmObjectsHandler.createDrivingTimeInformation();
				drivingTimeInformation.setDrivingTimeSlack(
						route.getRouteElement(i).getLatestDrivingTime() - route.getRouteElement(i).getDrivingTime());
				affectedDrivingTimeSlacks.put(SolutionHandler.getRequest(route.getRouteElement(i)), drivingTimeInformation);
			}

			currentTimeSlack = SolutionHandler.getRequestActivity(route.getRouteElement(i)).getLatestArrival()
					- route.getRouteElement(i).getServiceBegin();
			if (currentTimeSlack < timeSlack.get(0))
				timeSlack.add(0, currentTimeSlack + currentHiddenTimeSlack);
			else
				timeSlack.add(0, timeSlack.get(0) + currentHiddenTimeSlack);

			currentDrivingTimeSlack = new ArrayList<DrivingTimeInformation>();
			currentDrivingTimeSlack.addAll(affectedDrivingTimeSlacks.values());
			drivingTimeSlack.add(0, currentDrivingTimeSlack);
			utilizationSlack.add(0, utilizationSlack.get(0)
					+ SolutionHandler.getChangeInQuantity(SolutionHandler.getRequestActivity(route.getRouteElement(i))));
		}

		if (route.getRouteElements().size() > 0 && SolutionHandler.isRequestActivityRouteElement(route.getRouteElement(0)))
			currentTimeSlack = SolutionHandler.getRequestActivity(route.getRouteElement(0)).getLatestArrival()
					- route.getRouteElement(0).getServiceBegin();
		else
			currentTimeSlack = Long.MAX_VALUE;

		if (currentTimeSlack < timeSlack.get(0))
			timeSlack.add(0, currentTimeSlack);
		else
			timeSlack.add(0, timeSlack.get(0));

		drivingTimeSlack.add(0, new ArrayList<DrivingTimeInformation>());
		utilizationSlack.add(0, -1);

		return slacks;
	}
}