package ovgu.pave.core.demand;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import ovgu.pave.core.Core;
import ovgu.pave.handler.modelHandler.InputHandler;
import ovgu.pave.handler.modelHandler.NetworkHandler;
import ovgu.pave.model.config.RequestConstraints;
import ovgu.pave.model.input.FirstRequestActivity;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.input.SecondRequestActivity;
import ovgu.pave.model.input.Trip;
import ovgu.pave.model.input.Vehicle;
import ovgu.pave.model.network.Location;

public class Initialization {

	public static void updateScenario(Core core) {
		setupVehicles(core);
		setupRequests(core, core.getInput().getRequests());
	}

	private static void setupVehicles(Core core) {

		core.getInput().getVehicleTypes()
				.add(InputHandler.createVehicleType(0, core.getConfig().getScenario().getVehicleCapacity()));
		Random random = new Random(core.getConfig().getScenario().getRandomSeed());

		Location location = core.getNetwork().getLocations()
				.get(random.nextInt(core.getNetwork().getLocations().size()));

		for (int i = 0; i < core.getConfig().getScenario().getNumberOfVehicles(); i++) {
			Vehicle v = InputHandler.createVehicle(i, core.getInput().getVehicleTypes().get(0), location, location);
			core.getInput().getVehicles().add(v);
		}
	}

	private static void setupRequests(Core core, EList<Request> requests) {

		int randomSeed = core.getConfig().getScenario().getRandomSeed();
		Random randomTrips = new Random(randomSeed);
		Random randomLocations = new Random(randomSeed);

		int numberOfRequests = core.getConfig().getScenario().getNumberOfRequests();
		List<Trip> trips = new ArrayList<Trip>();
		trips.addAll(core.getInput().getTrips());
		Trip trip = null;
		Location firstLocation = null;
		Location secondLocation = null;
		for (int requestId = 0; requestId < numberOfRequests; requestId++) {
			trip = trips.remove(randomTrips.nextInt(trips.size()));

			if (core.getNetwork().getZones().get(trip.getPickupZoneId()).getLocations().isEmpty()) {
				System.out.println(trip.getPickupZoneId());
			}
			firstLocation = core.getNetwork().getZones().get(trip.getPickupZoneId()).getLocations().get(randomLocations
					.nextInt(core.getNetwork().getZones().get(trip.getPickupZoneId()).getLocations().size()));
			secondLocation = firstLocation;
			int counter = 0;
			while (NetworkHandler.getTravelDuration(core.getNetwork(), core.getConfig(), firstLocation,
					secondLocation) < core.getConfig().getScenario().getRequestConstraints().getMinTravelTime()
					&& counter < 10) {
				secondLocation = core.getNetwork().getZones().get(trip.getDropoffZoneId()).getLocations()
						.get(randomLocations.nextInt(
								core.getNetwork().getZones().get(trip.getDropoffZoneId()).getLocations().size()));
				counter++;
			}
			requests.add(createRequest(core, requestId, trip.getRequestTime(), firstLocation, secondLocation));
		}

		ECollections.sort(requests, new RequestTimeComparator());
	}

	private static Request createRequest(Core core, int requestId, long requestTime, Location firstActivityLocation,
			Location secondActivityLocation) {

		Request request = InputHandler.createRequest(requestId, firstActivityLocation, secondActivityLocation, 1);
		request.setRequestTime(requestTime);

		RequestConstraints requestConfig = core.getConfig().getScenario().getRequestConstraints();
		FirstRequestActivity firstActivity = request.getFirstActivity();
		SecondRequestActivity secondActivity = request.getSecondActivity();

		request.setMaxDrivingDuration(Math.round(
				(NetworkHandler.getTravelDuration(core.getNetwork(), core.getConfig(), firstActivity, secondActivity)
						* requestConfig.getDetourFactor())));

		firstActivity.setServiceDuration(requestConfig.getServiceDuration());
		secondActivity.setServiceDuration(requestConfig.getServiceDuration());

		firstActivity.setEarliestArrival(request.getRequestTime());
		firstActivity.setLatestArrival(firstActivity.getEarliestArrival() + requestConfig.getMaxWaitingTime());
		secondActivity.setLatestArrival(firstActivity.getLatestArrival() + request.getMaxDrivingDuration());

		return request;
	}

	private static class RequestTimeComparator implements Comparator<Request> {
		@Override
		public int compare(Request r1, Request r2) {
			return Double.compare(r1.getRequestTime(), r2.getRequestTime());
		}
	}
}
