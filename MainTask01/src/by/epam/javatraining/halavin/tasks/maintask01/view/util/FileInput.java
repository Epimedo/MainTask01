package by.epam.javatraining.halavin.tasks.maintask01.view.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInput extends Input {

	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String read() throws FileNotFoundException {
		File file = new File(fileName);
		StringBuilder sb = new StringBuilder();

		try {

			BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
			try {

				String s;
				while ((s = in.readLine()) != null) {
					sb.append(s);
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
