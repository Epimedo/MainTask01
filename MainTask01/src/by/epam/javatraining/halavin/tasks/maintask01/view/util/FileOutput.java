package by.epam.javatraining.halavin.tasks.maintask01.view.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOutput extends Output {
	private String filename;

	public FileOutput(InfoForOutputs info) {
		super(info);
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public void print(Object obj) {
		File file = new File(filename);
		String str = obj.toString();

		try {

			if (!file.exists()) {
				file.createNewFile();
			}

			PrintWriter out = new PrintWriter(file.getAbsoluteFile());

			try {

				out.print(super.str + str);
			} finally {
				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
