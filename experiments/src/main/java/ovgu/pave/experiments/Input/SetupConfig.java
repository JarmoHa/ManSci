package ovgu.pave.experiments.Input;

import ovgu.pave.handler.Handler;

public class SetupConfig {

	private static final String _DefaultConfigPath = "../config";
	private static final int minToMilliseconds = 60000;

	public static void main(String[] args) {
		System.out.println("run SetupConfig in experiments");

		Handler.initConfig("../config.xml");
		setupBasics();
		setupScenario();

		String suffix = "";
		saveConfig(suffix);

		System.out.println("SetupConfig in experiments is finished");
	}

	private static void setupBasics() {
		Handler.getConfig().setInputFolder("../resources/input/");
		Handler.getConfig().setOutputFolder("../resources/output/");
	}

	public static void setupScenario() {

		Handler.getConfig().getScenario().setRandomSeed(7757);
		Handler.getConfig().getScenario().setPlanningPeriodBegin(14 * 60 * minToMilliseconds);
		Handler.getConfig().getScenario().setPlanningPeriodLength(8 * 60 * minToMilliseconds);
		Handler.getConfig().getScenario().setNumberOfRequests(8 * 800);
		Handler.getConfig().getScenario().setNumberOfVehicles(200);
		Handler.getConfig().getScenario().setVehicleCapacity(6);
		Handler.getConfig().getScenario().setTravelTimeFactor(2.0);

		// RequestConstraints
		Handler.getConfig().getScenario().getRequestConstraints().setMinTravelTime(5 * minToMilliseconds);
		Handler.getConfig().getScenario().getRequestConstraints().setServiceDuration((int) (0.5 * minToMilliseconds));
		Handler.getConfig().getScenario().getRequestConstraints().setMaxWaitingTime(10 * minToMilliseconds);
		Handler.getConfig().getScenario().getRequestConstraints().setDetourFactor(1.5);		
	}

	private static void saveConfig(String suffix) {
		String path = _DefaultConfigPath + suffix + ".xml";
		Handler.getConfig().setConfigPath(path);
		Handler.saveConfig(path);
	}
}
