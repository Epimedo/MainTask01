package by.epam.javatraining.halavin.tasks.maintask01.view.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Input {

	public static int consoleInputInt() {
		return new Scanner(System.in).nextInt();
	}

	public static double consoleInputDouble() {
		return new Scanner(System.in).nextDouble();
	}

	public static String fileInput(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		StringBuilder sb = new StringBuilder();

		try {

			BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
			try {

				String s;
				while ((s = in.readLine()) != null) {
					sb.append(s).append("\n");
				}
			} finally {

				in.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return sb.toString();
	}


}
