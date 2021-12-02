package ovgu.pave.handler.modelHandler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import ovgu.pave.model.input.SecondRequestActivity;
import ovgu.pave.model.input.Trip;
import ovgu.pave.model.input.Input;
import ovgu.pave.model.input.FirstRequestActivity;
import ovgu.pave.model.input.InputFactory;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.input.RequestActivity;
import ovgu.pave.model.input.Vehicle;
import ovgu.pave.model.input.VehicleType;
import ovgu.pave.model.network.Location;

public class InputHandler {

	/*
	 * 
	 * init input
	 * 
	 */

	private Input localInput = InputFactory.eINSTANCE.createInput();

	public Input getLocalInput() {
		return localInput;
	}

	public List<Input> copyInput(int runs) {

		List<Input> inputs = new ArrayList<Input>();
		for (int r = 0; r < runs; r++) {
			Input copy = InputFactory.eINSTANCE.createInput();
			copy.getTrips().addAll(copyTrips(localInput.getTrips()));
			inputs.add(copy);
		}

		return inputs;
	}

	/*
	 * 
	 * static methods
	 * 
	 */

	@SuppressWarnings("unchecked")
	private static <T extends RequestActivity> T createRequestActivity(Class<T> activityClass) {
		RequestActivity activity = InputFactory.eINSTANCE.createRequestActivity();
		if (activityClass.equals(FirstRequestActivity.class))
			activity = InputFactory.eINSTANCE.createFirstRequestActivity();
		else if (activityClass.equals(SecondRequestActivity.class))
			activity = InputFactory.eINSTANCE.createSecondRequestActivity();
		return (T) activity;
	}

	public static Request createRequest(int id, Location firstActivityLocation, Location secondActivityLocation,
			int quantity) {
		Request request = createRequest(id, firstActivityLocation, secondActivityLocation);
		request.setQuantity(quantity);
		return request;
	}

	public static Request createRequest(int id, Location firstActivityLocation, Location secondActivityLocation) {
		Request request = InputFactory.eINSTANCE.createRequest();
		request.setId(id);
		if (firstActivityLocation != null)
			request.setFirstActivity(createRequestActivity(FirstRequestActivity.class, request, firstActivityLocation));
		if (secondActivityLocation != null)
			request.setSecondActivity(
					createRequestActivity(SecondRequestActivity.class, request, secondActivityLocation));
		return request;
	}

	@SuppressWarnings("unchecked")
	private static <T extends RequestActivity> T createRequestActivity(Class<T> activityClass, Request request,
			Location location) {

		RequestActivity activity = createRequestActivity(activityClass);
		if (isFirstRequestActivity(activity))
			activity.setId(request.getId());
		if (isSecondRequestActivity(activity))
			activity.setId(-request.getId());

		activity.setLocation(location);
		activity.setRequest(request);

		return (T) activity;
	}

	public static VehicleType createVehicleType(int id, int capacity) {
		VehicleType vehicleType = InputFactory.eINSTANCE.createVehicleType();
		vehicleType.setId(id);
		vehicleType.setCapacity(capacity);
		return vehicleType;
	}

	public static Vehicle createVehicle(int id, VehicleType vehicleType, Location startLocation, Location endLocation) {
		Vehicle vehicle = InputFactory.eINSTANCE.createVehicle();
		vehicle.setId(id);
		vehicle.setType(vehicleType);
		vehicle.setStartLocation(startLocation);
		vehicle.setEndLocation(endLocation);
		return vehicle;
	}

	public static <T> boolean isRequest(T object) {
		return object instanceof Request;
	}

	public static <T> boolean isRequestActivity(T object) {
		return object instanceof RequestActivity;
	}

	public static <T> boolean isFirstRequestActivity(T object) {
		return object instanceof FirstRequestActivity;
	}

	public static <T> boolean isSecondRequestActivity(T object) {
		return object instanceof SecondRequestActivity;
	}

	private static List<Trip> copyTrips(EList<Trip> trips) {

		List<Trip> copyTrips = new ArrayList<Trip>() ;

		for (Trip trip : trips) {
			Trip copy = InputFactory.eINSTANCE.createTrip();
			copy.setId(trip.getId());
			copy.setPickupZoneId(trip.getPickupZoneId());
			copy.setDropoffZoneId(trip.getDropoffZoneId());
			copy.setRequestTime(trip.getRequestTime());
			copyTrips.add(copy);
		}

		return copyTrips;
	}

	public static Trip createTrip(int id, int pickup, int dropoff, long requestTime) {
		Trip trip = InputFactory.eINSTANCE.createTrip();
		trip.setId(id);
		trip.setPickupZoneId(pickup);
		trip.setDropoffZoneId(dropoff);
		trip.setRequestTime(requestTime);
		return trip;
	}
}
