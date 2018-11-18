package by.epam.javatraining.halavin.tasks.maintask01.model.logic;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfBoundsVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsEmpty;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsFull;

public class VectorCreator {
	
	//creates default size vector
	public static DoubleVector createDoubleVector() {
		return new DoubleVector();
	}

	//creates vector with items like in arguments
	public static DoubleVector createDoubleVector(double... arg) {
		return new DoubleVector(arg);
	}

	//creates copy of input vector
	public static DoubleVector createDoubleVectorCopy(DoubleVector vector)
			throws VectorIsFull, OutOfBoundsVector, VectorIsEmpty {
		return new DoubleVector(vector);
	}
}
