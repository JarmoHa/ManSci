package ovgu.pave.experiments;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import ovgu.pave.core.Core;
import ovgu.pave.experiments.Input.SetupInput;
import ovgu.pave.experiments.Output.WriteOutput;
import ovgu.pave.handler.Handler;
import ovgu.pave.handler.Handler.Result;
import ovgu.pave.handler.ThreadHandler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.config.Config;
import ovgu.pave.model.input.Input;
import ovgu.pave.model.solution.Solution;

public class Lab {

	List<Result> finalResults;

	public static void main(String[] args) {
		new Lab().run();
		System.out.println("done");
	}

	private void run() {

		Handler.initHandlers("../config.xml");

		Handler.getConfig().getScenario().setArea("Manhattan");

		Handler.getConfig().setExperiments(1);
		Handler.getConfig().setRuns(4);
		Handler.getConfig().setThreadCount(4);

		SetupInput.run();
		runExperiments();
	}

	private void runExperiments() {

		List<Result> results;
		ThreadHandler.createThreadPool();

		for (int i = 0; i < Handler.getConfig().getExperiments(); i++) {
			results = runRouting();
			getScore(results, Handler.getConfig().getScenario().getArea() + "-" + " Score = ");
			WriteOutput.writeOutput(results, i);
		}

		ThreadHandler.shutDownThreadPool();
	}

	private List<Result> runRouting() {

		List<Config> configs = Handler.getConfigHandler().copyConfig(Handler.getConfig().getRuns());
		List<Input> inputs = Handler.getInputHandler().copyInput(Handler.getConfig().getRuns());
		List<Solution> solutions = SolutionHandler.getSolutions(Handler.getConfig().getRuns());

		List<Callable<Object>> cores = new ArrayList<Callable<Object>>();
		for (int id = 0; id < Handler.getConfig().getRuns(); id++) {
			cores.add(new Core(id, Handler.getNetwork(), inputs.get(id), configs.get(id), solutions.get(id)));
//			try {
//				cores.get(id).call();
//				System.out.println(id);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
		}

		ThreadHandler.run(cores);
		return getResults(cores);
	}

	private static List<Result> getResults(List<Callable<Object>> cores) {
		List<Result> results = new ArrayList<Result>();
		for (Callable<Object> object : cores) {
			Core core = (Core) object;
			results.add(new Result(core.getNetwork(), core.getInput(), core.getConfig(), core.getSolution()));
		}
		return results;
	}

	public static double[] getScore(List<Result> results, String printOutput) {

		double mean = 0;
		double sd = 0;
		double[][] score = new double[results.size()][2];

		for (int i = 0; i < results.size(); i++) {
			mean += results.get(i).getSolution().getScore();
			score[i][0] = i;
			score[i][1] = (Math.round(results.get(i).getSolution().getScore() * 1000.0) / 10.0);
		}
		mean = mean / results.size();

		for (int i = 0; i < results.size(); i++) {
			sd += Math.pow((results.get(i).getSolution().getScore() - mean), 2);
		}

		sd = Math.sqrt(sd / (results.size() - 1));

		System.out.println(printOutput + " mean: " + Math.round(mean * 10000.0) / 100.0 + "%, sd: "
				+ Math.round(sd * 10000.0) / 100.0 + "%");

		double[] result = { mean, sd };
		return result;
	}
}
