package ovgu.pave.core.algorithm.utilities;

import java.util.Random;

import ovgu.pave.core.Core;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.SupportRouteElement;

public class InitializeRoutes {

	public static void depotStartEnd(Core core) {

		SolutionHandler.initEmptyRoutesForVehicles(core.getSolution(), core.getInput().getVehicles());
		Random random = new Random(core.getConfig().getScenario().getRandomSeed());

		for (Route route : core.getSolution().getRoutes()) {

			SupportRouteElement morning = SolutionHandler.createSupportRouteElement(core.getNetwork().getLocations()
					.get(1 + random.nextInt(core.getNetwork().getLocations().size() - 1)));
			morning.setServiceBegin(core.getConfig().getScenario().getPlanningPeriodBegin());
			
			SupportRouteElement evening = SolutionHandler
					.createSupportRouteElement(route.getVehicle().getEndLocation());

			route.getRouteElements().add(morning);
			route.getRouteElements().add(evening);
		}
	}
}
