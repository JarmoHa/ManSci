package ovgu.pave.core;

import java.util.Random;
import java.util.concurrent.Callable;

import ovgu.pave.core.algorithm.Routing;
import ovgu.pave.core.demand.Initialization;
import ovgu.pave.model.config.Config;
import ovgu.pave.model.network.Network;
import ovgu.pave.model.solution.Solution;
import ovgu.pave.model.input.Input;

public class Core implements Callable<Object> {

	int id;
	Network network;
	Config config;
	Solution solution;
	Input input;
	Random random;

	public Core(int id, Network network, Input input, Config config, Solution solution) {
		this.id = id;
		this.network = network;
		this.config = config;
		this.solution = solution;
		this.input = input;
		this.random = new Random(config.getScenario().getRandomSeed());

	}

	public Object call() {

		Initialization.updateScenario(this);
		solution = Routing.run(this);
		return null;
	}

	public Network getNetwork() {
		return network;
	}

	public Input getInput() {
		return input;
	}
	
	public Config getConfig() {
		return config;
	}

	public Solution getSolution() {
		return solution;
	}

	public Random getRandom() {
		return random;
	}

	public void setSolution(Solution solution) {
		this.solution = solution;
	}
}
