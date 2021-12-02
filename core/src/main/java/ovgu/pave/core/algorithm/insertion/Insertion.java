package ovgu.pave.core.algorithm.insertion;

import ovgu.pave.core.Core;
import ovgu.pave.core.algorithm.utilities.RouteUpdater;
import ovgu.pave.handler.modelHandler.AlgorithmObjectsHandler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.algorithmObjects.InsertionInformation;
import ovgu.pave.model.algorithmObjects.InsertionOption;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.solution.Route;

public class Insertion {

	public static boolean minCostInsertion(Core core, Request request) {

		InsertionInformation insertionInformation = AlgorithmObjectsHandler.createInsertionInformation(request);
		insertionInformation = computeInsertionInformation(core, request);
		if (!insertionInformation.getInsertionOptions().isEmpty()) {
			insertRequest(core, insertionInformation);
			return true;
		} else {
			return false;
		}
	}

	private static InsertionInformation computeInsertionInformation(Core core, Request request) {

		InsertionInformation insertionInformation = AlgorithmObjectsHandler.createInsertionInformation(request);

		for (Route route : core.getSolution().getRoutes()) {
			InsertionOption insertionOption = InsertionOptionCalculator.getInsertionOption(core, request, route);
			if (insertionOption.getCosts() < Long.MAX_VALUE && (insertionInformation.getInsertionOptions().isEmpty()
					|| insertionInformation.getInsertionOptions().get(0).getCosts() > insertionOption.getCosts())) {
				insertionInformation.getInsertionOptions().add(0, insertionOption);
			}
		}

		return insertionInformation;
	}

	private static void insertRequest(Core core, InsertionInformation insertionInformation) {

		Request request = insertionInformation.getRequest();
		Route route = insertionInformation.getInsertionOptions().get(0).getRoute();

		int indexOrigin = insertionInformation.getInsertionOptions().get(0).getFirstActivityIndex();
		int indexDestination = insertionInformation.getInsertionOptions().get(0).getSecondActivityIndex();

		SolutionHandler.insertRequest(route, request, indexOrigin, indexDestination);
		RouteUpdater.updateAllElements(core, route, indexOrigin);
	}
}
