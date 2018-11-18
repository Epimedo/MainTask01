package by.epam.javatraining.halavin.tasks.maintask01.view.vector;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;

public class CreateLogVectorOuput extends CreateVectorOutput {

	@Override
	public VectorOutput create() {
		return new VectorLogOutput();
	}

}
