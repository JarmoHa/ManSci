package ovgu.pave.experiments.utils;

import java.util.List;
import java.io.FileWriter;

public class WriteCSV {

	public static void write(String path, List<List<String>> values) {

		FileWriter writer;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(path);
		stringBuilder.append(".csv");

		try {
			writer = new FileWriter(stringBuilder.toString());
			for (int i = 0; i < values.size(); i++) {
				for (int j = 0; j < values.get(i).size(); j++) {
					writer.append(String.valueOf(values.get(i).get(j)));
					writer.append(',');
				}
				if (i + 1 < values.size())
					writer.append('\n');
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
