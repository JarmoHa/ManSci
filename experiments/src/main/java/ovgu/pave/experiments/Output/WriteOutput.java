package ovgu.pave.experiments.Output;

import java.util.List;

import ovgu.pave.experiments.utils.WriteCSV;
import ovgu.pave.handler.Handler;
import ovgu.pave.handler.Handler.Result;

public class WriteOutput {

	public static void writeOutput(List<Result> finalResults, int experiment) {

		String outputPath = createOutputPath();
		Handler.saveConfig(outputPath + "_config_" + experiment);
		List<List<String>> statisticOutputs = StatisticsOutput.createStatisticOutputs(finalResults);
		WriteCSV.write(outputPath + "_statistics_" + experiment, statisticOutputs);
	}

	private static String createOutputPath() {
		StringBuilder path = new StringBuilder();
		path.append(Handler.getConfig().getOutputFolder());
		path.append("/");
		path.append(Handler.getConfig().getScenario().getArea());
		return path.toString();
	}
}
