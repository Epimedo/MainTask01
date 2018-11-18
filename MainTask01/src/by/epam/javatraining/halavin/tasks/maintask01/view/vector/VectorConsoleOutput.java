package by.epam.javatraining.halavin.tasks.maintask01.view.vector;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsEmpty;

public class VectorConsoleOutput extends VectorOutput {

	public void print(DoubleVector vector) throws VectorIsEmpty {
		System.out.println(vector.toString());
	}
}
