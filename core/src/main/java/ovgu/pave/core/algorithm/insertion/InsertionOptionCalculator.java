package ovgu.pave.core.algorithm.insertion;

import ovgu.pave.core.Core;
import ovgu.pave.handler.modelHandler.AlgorithmObjectsHandler;
import ovgu.pave.handler.modelHandler.NetworkHandler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.algorithmObjects.DrivingTimeInformation;
import ovgu.pave.model.algorithmObjects.InsertionOption;
import ovgu.pave.model.algorithmObjects.Slacks;
import ovgu.pave.model.input.FirstRequestActivity;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.input.RequestActivity;
import ovgu.pave.model.input.SecondRequestActivity;
import ovgu.pave.model.solution.Route;

public class InsertionOptionCalculator {

	public static InsertionOption getInsertionOption(Core core, Request request, Route route) {

		Slacks slacks = SlackCalculator.getSlacks(core, route);
		InsertionOption insertionOption = AlgorithmObjectsHandler.createInsertionOption();
		insertionOption.setRoute(route);
		insertionOption.setCosts(Long.MAX_VALUE);

		FirstRequestActivity firstActivity = request.getFirstActivity();
		SecondRequestActivity secondActivity = request.getSecondActivity();
		int finalFirstIndex = -1;
		int finalSecondIndex = -1;

		for (int firstIndex = 1; firstIndex < route.getRouteElements().size(); firstIndex++) {
			finalFirstIndex = checkFirstIndex(core, slacks, firstActivity, firstIndex);
			if (finalFirstIndex == -1)
				break;
			else if (finalFirstIndex == 1) {
				for (int secondIndex = firstIndex; secondIndex < route.getRouteElements().size(); secondIndex++) {
					finalSecondIndex = checkSecondIndex(core, slacks, firstActivity, secondActivity, firstIndex,
							secondIndex);
					if (finalSecondIndex == -1)
						break;
					else if (finalSecondIndex == 1) {
						long insertionCosts = getInsertionCosts(core, route, firstActivity, secondActivity, firstIndex,
								secondIndex);
						if (insertionOption.getCosts() > insertionCosts) {
							insertionOption.setCosts(insertionCosts);
							insertionOption.setFirstActivityIndex(firstIndex);
							insertionOption.setSecondActivityIndex(secondIndex);
						}
					}
				}
			}
		}
		return insertionOption;
	}

	private static int checkFirstIndex(Core core, Slacks slacks, FirstRequestActivity firstActivity, int firstIndex) {

		if (SolutionHandler.isFirstRequestActivityRouteElement(slacks.getRoute().getRouteElement(firstIndex - 1))
				&& SolutionHandler.getFirstRequestActivity(slacks.getRoute().getRouteElement(firstIndex - 1))
						.getEarliestArrival() > firstActivity.getLatestArrival())
			return -1;

		long beginAtFirstActivity = SolutionHandler.getServiceBegin(core.getNetwork(), core.getConfig(),
				slacks.getRoute().getRouteElement(firstIndex - 1), firstActivity,
				SolutionHandler.getServiceEnd(slacks.getRoute(), firstIndex - 1));

		if (beginAtFirstActivity < firstActivity.getEarliestArrival()
				|| beginAtFirstActivity > firstActivity.getLatestArrival())
			return 0;

		long newArrivalTime = (SolutionHandler.getArrivalTime(core.getNetwork(), core.getConfig(), firstActivity,
				slacks.getRoute().getRouteElement(firstIndex),
				(beginAtFirstActivity + firstActivity.getServiceDuration())));

		long additionalTime = newArrivalTime - (SolutionHandler.getArrivalTime(core.getNetwork(), core.getConfig(),
				slacks.getRoute().getRouteElement(firstIndex - 1), slacks.getRoute().getRouteElement(firstIndex),
				SolutionHandler.getServiceEnd(slacks.getRoute(), firstIndex - 1)));

		long additionalDrivingTime = NetworkHandler.getInsertionDuration(core.getNetwork(), core.getConfig(),
				slacks.getRoute().getRouteElement(firstIndex - 1), firstActivity,
				slacks.getRoute().getRouteElement(firstIndex));

		if (!ckeckServiceBegins(slacks, firstIndex, additionalTime)
				|| !ckeckDrivingTimes(slacks, firstIndex, additionalDrivingTime)
				|| !checkUtilization(slacks, firstIndex, firstIndex, firstActivity))
			return 0;

		return 1;
	}

	private static int checkSecondIndex(Core core, Slacks slacks, FirstRequestActivity firstActivity,
			SecondRequestActivity secondActivity, int firstIndex, int secondIndex) {

		long travelDuration;

		long beginAtSecondActivity;
		long newSerivceBegin = SolutionHandler.getServiceBegin(core.getNetwork(), core.getConfig(),
				slacks.getRoute().getRouteElement(firstIndex - 1), firstActivity,
				SolutionHandler.getServiceEnd(slacks.getRoute(), firstIndex - 1));
		long newDrivingTime = slacks.getRoute().getRouteElement(firstIndex - 1).getDrivingTime()
				+ NetworkHandler.getTravelDuration(core.getNetwork(), core.getConfig(),
						slacks.getRoute().getRouteElement(firstIndex - 1), firstActivity);
		long maxDrivingTime = newDrivingTime + secondActivity.getRequest().getMaxDrivingDuration();

		long firstAddDrivingTime = 0;
		long secondAddDrivingTime = 0;
		if (firstIndex == secondIndex) {
			secondAddDrivingTime = NetworkHandler.getInsertionDurationIfIndexesEqual(core.getNetwork(),
					core.getConfig(), slacks.getRoute().getRouteElement(firstIndex - 1), firstActivity, secondActivity,
					slacks.getRoute().getRouteElement(firstIndex));
			beginAtSecondActivity = SolutionHandler.getServiceBegin(core.getNetwork(), core.getConfig(), firstActivity,
					secondActivity, (newSerivceBegin + firstActivity.getServiceDuration()));
		} else {

			travelDuration = NetworkHandler.getTravelDuration(core.getNetwork(), core.getConfig(), firstActivity,
					slacks.getRoute().getRouteElement(firstIndex));
			newDrivingTime = newDrivingTime + travelDuration;
			newSerivceBegin = newSerivceBegin + firstActivity.getServiceDuration() + travelDuration;

			for (int i = firstIndex; i < secondIndex - 1; i++) {
				travelDuration = NetworkHandler.getTravelDuration(core.getNetwork(), core.getConfig(),
						slacks.getRoute().getRouteElement(i), slacks.getRoute().getRouteElement(i + 1));
				newSerivceBegin = newSerivceBegin + slacks.getRoute().getRouteElement(i).getServiceDuration()
						+ travelDuration;
				newDrivingTime = newDrivingTime + travelDuration;
				if (newDrivingTime > maxDrivingTime)
					return -1;
			}

			travelDuration = NetworkHandler.getTravelDuration(core.getNetwork(), core.getConfig(),
					slacks.getRoute().getRouteElement(secondIndex - 1), secondActivity);
			newDrivingTime = newDrivingTime + travelDuration;
			if (newDrivingTime > maxDrivingTime)
				return -1;

			if (newSerivceBegin < slacks.getRoute().getRouteElement(secondIndex - 1).getServiceBegin())
				beginAtSecondActivity = SolutionHandler.getServiceBegin(core.getNetwork(), core.getConfig(),
						slacks.getRoute().getRouteElement(secondIndex - 1), secondActivity,
						SolutionHandler.getServiceEnd(slacks.getRoute(), secondIndex - 1));
			else
				beginAtSecondActivity = SolutionHandler.getServiceBegin(core.getNetwork(), core.getConfig(),
						slacks.getRoute().getRouteElement(secondIndex - 1), secondActivity,
						(newSerivceBegin + slacks.getRoute().getRouteElement(secondIndex - 1).getServiceDuration()));

			firstAddDrivingTime = NetworkHandler.getInsertionDuration(core.getNetwork(), core.getConfig(),
					slacks.getRoute().getRouteElement(firstIndex - 1), firstActivity,
					slacks.getRoute().getRouteElement(firstIndex));
			secondAddDrivingTime = NetworkHandler.getInsertionDuration(core.getNetwork(), core.getConfig(),
					slacks.getRoute().getRouteElement(secondIndex - 1), secondActivity,
					slacks.getRoute().getRouteElement(secondIndex));
		}

		if (beginAtSecondActivity > secondActivity.getLatestArrival())
			return -1;

		long additionalTime = SolutionHandler.getArrivalTime(core.getNetwork(), core.getConfig(), secondActivity,
				slacks.getRoute().getRouteElement(secondIndex),
				(beginAtSecondActivity + secondActivity.getServiceDuration()))
				- SolutionHandler.getArrivalTime(core.getNetwork(), core.getConfig(),
						slacks.getRoute().getRouteElement(secondIndex - 1),
						slacks.getRoute().getRouteElement(secondIndex),
						SolutionHandler.getServiceEnd(slacks.getRoute(), secondIndex - 1));

		if (!ckeckServiceBegins(slacks, secondIndex, additionalTime)
				|| !ckeckDrivingTimes(slacks, firstIndex, secondIndex, firstAddDrivingTime, secondAddDrivingTime)
				|| !checkUtilization(slacks, firstIndex, secondIndex, firstActivity))
			return 0;

		return 1;
	}

	private static boolean ckeckServiceBegins(Slacks slacks, int index, Long additionalTime) {
		if (slacks.getTimeSlack().get(index) < additionalTime)
			return false;
		return true;
	}

	private static boolean ckeckDrivingTimes(Slacks slacks, int index, Long additionalDrivingTime) {
		for (DrivingTimeInformation drivingTimeInformation : slacks.getDrivingTimeSlack().get(index)) {
			if (drivingTimeInformation.getDrivingTimeSlack() < additionalDrivingTime)
				return false;
		}
		return true;
	}

	private static boolean ckeckDrivingTimes(Slacks slacks, int firstIndex, int secondIndex, Long firstAddDrivingTime,
			Long secondAddDrivingTime) {
		for (DrivingTimeInformation drivingTimeInformation : slacks.getDrivingTimeSlack().get(secondIndex)) {
			if (drivingTimeInformation.getFirstIndex() < firstIndex
					&& drivingTimeInformation.getDrivingTimeSlack() < firstAddDrivingTime + secondAddDrivingTime)
				return false;
			else if (drivingTimeInformation.getDrivingTimeSlack() < secondAddDrivingTime) {
				return false;
			}
		}

		return true;
	}

	private static boolean checkUtilization(Slacks slacks, int startIndex, int endIndex,
			RequestActivity requestActivity) {
		for (int i = startIndex; i <= endIndex; i++) {
			if (slacks.getUtilizationSlack().get(i) < SolutionHandler.getChangeInQuantity(requestActivity))
				return false;
		}
		return true;
	}

	private static long getInsertionCosts(Core core, Route route, FirstRequestActivity firstActivity,
			SecondRequestActivity secondActivity, int firstActivityIndex, int secondActivityIndex) {

		if (firstActivityIndex == secondActivityIndex && secondActivityIndex < route.getRouteElements().size() - 1) {

			return NetworkHandler.getInsertionDurationIfIndexesEqual(core.getNetwork(), core.getConfig(),
					route.getRouteElement(firstActivityIndex - 1), firstActivity, secondActivity,
					route.getRouteElement(firstActivityIndex));
		} else if (firstActivityIndex == secondActivityIndex) {
			return NetworkHandler.getInsertionDurationIfIndexesEqualAtEnd(core.getNetwork(), core.getConfig(),
					route.getRouteElement(firstActivityIndex - 1), firstActivity, secondActivity);
		} else if (secondActivityIndex < route.getRouteElements().size() - 1) {
			return NetworkHandler.getInsertionDuration(core.getNetwork(), core.getConfig(),
					route.getRouteElement(firstActivityIndex - 1), firstActivity,
					route.getRouteElement(firstActivityIndex))
					+ NetworkHandler.getInsertionDuration(core.getNetwork(), core.getConfig(),
							route.getRouteElement(secondActivityIndex - 1), secondActivity,
							route.getRouteElement(secondActivityIndex));
		} else {
			return NetworkHandler.getInsertionDuration(core.getNetwork(), core.getConfig(),
					route.getRouteElement(firstActivityIndex - 1), firstActivity,
					route.getRouteElement(firstActivityIndex))
					+ NetworkHandler.getInsertionDurationAtEnd(core.getNetwork(), core.getConfig(),
							route.getRouteElement(secondActivityIndex - 1), secondActivity);
		}
	}
}
