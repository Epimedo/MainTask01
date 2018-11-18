package by.epam.javatraining.halavin.tasks.maintask01.view.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.log4j.Logger;

public class Output {
	private static final Logger LOG = Logger.getRootLogger();

	public static void consoleOutput(String str) {
		System.out.println(str);
	}

	public static void logOutput(String str) {
		LOG.info(str);
	}

	public static void fileOutput(String var, String fileName) {
		File file = new File(fileName);

		try {

			if (!file.exists()) {
				file.createNewFile();
			}

			PrintWriter out = new PrintWriter(file.getAbsoluteFile());

			try {

				out.print(var);
			} finally {
				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}