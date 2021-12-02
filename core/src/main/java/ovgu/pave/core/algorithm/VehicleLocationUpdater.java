package ovgu.pave.core.algorithm;

import ovgu.pave.core.Core;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.Solution;

public class VehicleLocationUpdater {

	public static void updateAll(Core core, Solution finalSolution, Long timeStamp, boolean relocation) {

		
		for (int routeIndex = 0; routeIndex < core.getSolution().getRoutes().size(); routeIndex++) {
			VehicleLocationUpdater.updateVehicle(core, core.getSolution().getRoutes().get(routeIndex),
					finalSolution.getRoutes().get(routeIndex), timeStamp);
			}
		}
	

	private static void updateVehicle(Core core, Route route, Route finalRoute, long timeStamp) {
		while (route.getRouteElements().size() > 2 && SolutionHandler.getServiceEnd(route, 0) < timeStamp) {
			finalRoute.getRouteElements().add(route.getRouteElements().remove(0));
		}
	}

}
