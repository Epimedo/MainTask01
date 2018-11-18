package by.epam.javatraining.halavin.tasks.maintask01.view.vector;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;

public class CreateConsoleVectroOutput extends CreateVectorOutput {

	@Override
	public VectorOutput create() {
		return new VectorConsoleOutput();
	}

}
