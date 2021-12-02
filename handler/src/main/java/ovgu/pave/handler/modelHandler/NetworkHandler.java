package ovgu.pave.handler.modelHandler;

import ovgu.pave.model.config.Config;
import ovgu.pave.model.input.RequestActivity;
import ovgu.pave.model.network.NetworkFactory;
import ovgu.pave.model.network.Zone;
import ovgu.pave.model.solution.RouteElement;
import ovgu.pave.model.network.Location;
import ovgu.pave.model.network.Network;

public class NetworkHandler {

	/*
	 * 
	 * getter and setter
	 * 
	 */
	private Network network = NetworkFactory.eINSTANCE.createNetwork();

	public Network getNetwork() {
		return network;
	}

	// Create methods
	public static Zone createZone(int id) {
		Zone zone = NetworkFactory.eINSTANCE.createZone();
		zone.setId(id);

		return zone;
	}

	public static Location createLocation(int id, double lon, double lat) {
		Location location = NetworkFactory.eINSTANCE.createLocation();
		location.setId(id);
		location.setLat(lat);
		location.setLon(lon);
		return location;
	}

	// duration methods

	public static <T1, T2> long getTravelDuration(Network network, Config config, T1 from, T2 to) {

		return (long) (network.getMatrix()[getLocation(from).getId()][getLocation(to).getId()]
				* config.getScenario().getTravelTimeFactor());
	}

	public static <T1, T2, T3> long getInsertionDuration(Network network, Config config, T1 from, T2 over, T3 to) {

		long insertionCosts = getTravelDuration(network, config, from, over)
				+ getTravelDuration(network, config, over, to) - getTravelDuration(network, config, from, to);

		return insertionCosts;
	}

	public static <T1, T2, T3, T4> long getInsertionDurationIfIndexesEqual(Network network, Config config, T1 from,
			T2 overFirst, T3 overSecond, T4 to) {

		long insertionCosts = getTravelDuration(network, config, from, overFirst)
				+ getTravelDuration(network, config, overFirst, overSecond)
				+ getTravelDuration(network, config, overSecond, to) - getTravelDuration(network, config, from, to);

		return insertionCosts;
	}

	public static <T1, T2> long getInsertionDurationAtEnd(Network network, Config config, T1 from, T2 over) {

		long insertionCosts = getTravelDuration(network, config, from, over);
		return insertionCosts;
	}

	public static <T1, T2, T3> long getInsertionDurationIfIndexesEqualAtEnd(Network network, Config config, T1 from,
			T2 overFirst, T3 overSecond) {

		long insertionCosts = getTravelDuration(network, config, from, overFirst)
				+ getTravelDuration(network, config, overFirst, overSecond);

		return insertionCosts;
	}

	/*
	 * 
	 * get locations
	 * 
	 */

	public static <T> Location getLocation(T object) {
		if (object instanceof Location)
			return (Location) object;
		else if (SolutionHandler.isRequestActivity(object))
			return ((RequestActivity) object).getLocation();
		else if (SolutionHandler.isRouteElement(object))
			return SolutionHandler.getLocation((RouteElement) object);
		else
			return null;
	}

}
