package by.epam.javatraining.halavin.tasks.maintask01.view.util.matrix;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import org.apache.log4j.Logger;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.Matrix;

public class MatrixOutput {
	private static final Logger LOG = Logger.getRootLogger();

	public static void consoleMatrixOutput(Matrix matrix) {
		System.out.print(matrix.toString());
	}

	public static void logMatrixOutput(Matrix matrix) {
		String[] str = matrix.toString().split("\n");

		for (int i = 0; i < str.length; i++) {
			LOG.info(str[i]);
		}
	}

	public static void fileOutputVector(Matrix matrix, String fileName) {
		File file = new File(fileName);
		String str = matrix.toString();

		try {

			if (!file.exists()) {
				file.createNewFile();
			}

			PrintWriter out = new PrintWriter(file.getAbsoluteFile());

			try {

				out.print(str);
			} finally {
				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
