package ovgu.pave.handler.modelHandler;

import java.util.ArrayList;
import java.util.List;

import ovgu.pave.model.config.Config;
import ovgu.pave.model.config.ConfigFactory;

public class ConfigHandler {

	private Config config = ConfigFactory.eINSTANCE.createConfig();

	public ConfigHandler() {
		config.setScenario(ConfigFactory.eINSTANCE.createScenario());
		config.getScenario().setRequestConstraints(ConfigFactory.eINSTANCE.createRequestConstraints());
	}

	public List<Config> copyConfig(int runs) {

		List<Config> configs = new ArrayList<Config>();
		Config copy;
		for (int r = 1; r <= runs; r++) {

			copy = ConfigFactory.eINSTANCE.createConfig();
			copy.setScenario(ConfigFactory.eINSTANCE.createScenario());
			copy.getScenario().setRequestConstraints(ConfigFactory.eINSTANCE.createRequestConstraints());
		
			copy.setExperiments(config.getExperiments());
			copy.setRuns(config.getRuns());
					
			copy.getScenario().setRandomSeed(config.getScenario().getRandomSeed() * r);
			copy.getScenario().setPlanningPeriodBegin(config.getScenario().getPlanningPeriodBegin());
			copy.getScenario().setPlanningPeriodLength(config.getScenario().getPlanningPeriodLength());
			copy.getScenario().setNumberOfVehicles(config.getScenario().getNumberOfVehicles());
			copy.getScenario().setVehicleCapacity(config.getScenario().getVehicleCapacity());
			copy.getScenario().setNumberOfRequests(config.getScenario().getNumberOfRequests());
			copy.getScenario().setTravelTimeFactor(config.getScenario().getTravelTimeFactor());

			copy.getScenario().getRequestConstraints()
					.setMinTravelTime(config.getScenario().getRequestConstraints().getMinTravelTime());
			copy.getScenario().getRequestConstraints()
					.setServiceDuration(config.getScenario().getRequestConstraints().getServiceDuration());
			copy.getScenario().getRequestConstraints()
					.setMaxWaitingTime(config.getScenario().getRequestConstraints().getMaxWaitingTime());
			copy.getScenario().getRequestConstraints()
					.setDetourFactor(config.getScenario().getRequestConstraints().getDetourFactor());
		
			configs.add(copy);
		}
		
		return configs;
	}

	public Config getConfig() {
		return config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	public void saveConfig(String path) {
		IOHandler.saveConfig(config, path);
	}

	public void loadConfig(String path) {
		config = IOHandler.loadConfig(path);
	}
}
