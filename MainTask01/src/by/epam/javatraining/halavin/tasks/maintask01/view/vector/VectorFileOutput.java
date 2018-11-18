package by.epam.javatraining.halavin.tasks.maintask01.view.vector;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfBoundsVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsEmpty;

public class VectorFileOutput extends VectorOutput {
	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void print(DoubleVector vector) throws VectorIsEmpty, OutOfBoundsVector {
		File file = new File(fileName);

		try {

			if (!file.exists()) {
				file.createNewFile();
			}

			PrintWriter out = new PrintWriter(file.getAbsoluteFile());

			try {

				out.print(vector.toString());
			} finally {
				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
