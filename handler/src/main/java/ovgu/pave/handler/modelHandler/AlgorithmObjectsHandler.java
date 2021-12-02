package ovgu.pave.handler.modelHandler;

import ovgu.pave.model.algorithmObjects.AlgorithmObjectsFactory;
import ovgu.pave.model.algorithmObjects.DrivingTimeInformation;
import ovgu.pave.model.algorithmObjects.InsertionInformation;
import ovgu.pave.model.algorithmObjects.InsertionOption;
import ovgu.pave.model.algorithmObjects.Slacks;
import ovgu.pave.model.input.Request;

public class AlgorithmObjectsHandler {

	public static InsertionInformation createInsertionInformation(Request request) {
		InsertionInformation insertionInformation = AlgorithmObjectsFactory.eINSTANCE.createInsertionInformation();
		insertionInformation.setRequest(request);
		return insertionInformation;
	}

	public static InsertionOption createInsertionOption() {
		return AlgorithmObjectsFactory.eINSTANCE.createInsertionOption();
	}
	
	public static Slacks createSlacks() {
		return AlgorithmObjectsFactory.eINSTANCE.createSlacks();
	}
	
	public static DrivingTimeInformation createDrivingTimeInformation() {
		return AlgorithmObjectsFactory.eINSTANCE.createDrivingTimeInformation();
	}
	
	
}
