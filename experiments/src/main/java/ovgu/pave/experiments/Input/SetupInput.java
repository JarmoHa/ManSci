package ovgu.pave.experiments.Input;

import java.util.List;

import ovgu.pave.experiments.utils.ReadCSV;
import ovgu.pave.handler.Handler;
import ovgu.pave.handler.modelHandler.InputHandler;
import ovgu.pave.handler.modelHandler.NetworkHandler;
import ovgu.pave.model.input.Trip;
import ovgu.pave.model.network.Location;
import ovgu.pave.model.network.Zone;

public class SetupInput {

	private static String folderPath;

	public static void run() {
		SetupInput.readData(Handler.getConfig().getInputFolder());
		System.out.println("Initialization completed");
	}

	public static void reset() {
		Handler.getLocalInput().getTrips().clear();
		Handler.getLocalInput().getVehicles().clear();
		Handler.getLocalInput().getVehicleTypes().clear();
		Handler.getNetwork().getLocations().clear();
		run();
	}

	private static void readData(String folderPath) {

		SetupInput.folderPath = folderPath;
		readLocations(Handler.getConfig().getScenario().getArea() + "_Locations.csv");
		readMatrix(Handler.getConfig().getScenario().getArea() + "_DurationMatrix.csv");
		readTrips(Handler.getConfig().getScenario().getArea() + "_Trips.csv");
	}

	private static void readTrips(String tripsFile) {

		List<List<Double>> trips = ReadCSV.read(getPath(tripsFile), ",", double.class, true);

		for (List<Double> trip : trips) {
			Trip t = InputHandler.createTrip(trip.get(0).intValue(), trip.get(1).intValue(), trip.get(2).intValue(),
					trip.get(3).longValue() * 1000);

			Handler.getLocalInput().getTrips().add(t);
		}
	}

	private static void readLocations(String locationFile) {

		List<List<Double>> locations = ReadCSV.read(getPath(locationFile), ",", double.class, true);

		for (int i = 0; i <= 263; i++) {
			Zone z = NetworkHandler.createZone(i);
			Handler.getNetwork().getZones().add(z);
		}

		for (List<Double> location : locations) {
			Location l = NetworkHandler.createLocation(location.get(0).intValue(), location.get(1), location.get(2));
			l.setZone(Handler.getNetwork().getZones().get(location.get(3).intValue()));
			Handler.getNetwork().getZones().get(location.get(3).intValue()).getLocations().add(l);
			Handler.getNetwork().getLocations().add(l);
		}

	}

	private static void readMatrix(String durationFileName) {

		List<List<Long>> durationMatrix = ReadCSV.read(getPath(durationFileName), ",", long.class, true);
		Long[][] matrix = new Long[durationMatrix.size()][durationMatrix.size()];

		for (int i = 0; i < durationMatrix.size(); i++) {
			for (int j = 0; j < durationMatrix.size(); j++) {
				matrix[i][j] = durationMatrix.get(i).get(j);
			}
		}
		Handler.getNetwork().setMatrix(matrix);
	}

	private static String getPath(String filename) {
		return folderPath + filename;
	}

}