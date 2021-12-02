package ovgu.pave.handler;

import ovgu.pave.handler.modelHandler.ConfigHandler;
import ovgu.pave.handler.modelHandler.InputHandler;
import ovgu.pave.handler.modelHandler.NetworkHandler;
import ovgu.pave.model.config.Config;
import ovgu.pave.model.input.Input;
import ovgu.pave.model.network.Network;
import ovgu.pave.model.solution.Solution;

public class Handler {

	private Handler() {
	}

	private static boolean initialized = false;

	private static NetworkHandler _NetworkHandler = null;
	private static ConfigHandler _ConfigHandler = null;
	private static InputHandler _InputHandler = null;

	public static NetworkHandler getNetworkHandler() {
		return _NetworkHandler;
	}

	public static Network getNetwork() {
		return _NetworkHandler.getNetwork();
	}

	public static InputHandler getInputHandler() {
		return _InputHandler;
	}

	public static Input getLocalInput() {
		return _InputHandler.getLocalInput();
	}

	public static ConfigHandler getConfigHandler() {
		return _ConfigHandler;
	}

	public static Config getConfig() {
		return _ConfigHandler.getConfig();
	}

	public static void saveConfig(String path) {
		_ConfigHandler.saveConfig(path);
	}

	public static void initConfig(String path) {
		_ConfigHandler = new ConfigHandler();
	}

	public static void initHandlers(String path) {
		if (!initialized) {
			_NetworkHandler = new NetworkHandler();
			_InputHandler = new InputHandler();
			_ConfigHandler = new ConfigHandler();
			_ConfigHandler.loadConfig(path);
			initialized = true;
		}
	}

	public static class Result {

		private Network network;
		private Input input;
		private Config config;
		private Solution solution;

		public Result(Network network, Input input, Config config, Solution solution) {
			this.network = network;
			this.input = input;
			this.config = config;
			this.solution = solution;
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
	}
}
