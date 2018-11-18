package by.epam.javatraining.halavin.tasks.maintask01.testing;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfBoundsVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsEmpty;
import by.epam.javatraining.halavin.tasks.maintask01.model.logic.SearchVectorMethods;

public class testSearchVectorMethods {
	public DoubleVector vector1;
	public DoubleVector vector2;

	@Before
	public void initVectorTest() throws VectorIsEmpty {
		vector1 = new DoubleVector(1, 3, 2, 10, 4, 7, 4, 23, 3, 21, 45, 6, 54, 46, .0456);
		vector2 = new DoubleVector(1, 3, 2, 10, 4, 7, 4, 23, 3, 21, 45, 6, 54, 46);

	}

	@Test
	public void LinSearchVectorElementHasTest() throws VectorIsEmpty, OutOfBoundsVector {
		double variable = 0.0456;
		int index = 14;

		assertEquals(index, SearchVectorMethods.linSearchVectorElement(vector1, variable));

	}

	@Test
	public void LinSearchVectorElementNotHasTest() throws VectorIsEmpty, OutOfBoundsVector {
		int index = -1;
		double variable = 99;

		assertEquals(index, SearchVectorMethods.linSearchVectorElement(vector1, variable));

	}
	
	@Test
	public void binSearchVectorElementHasTest() throws VectorIsEmpty, OutOfBoundsVector {
		int index = 0;
		double variable = 1;

		assertEquals(index, SearchVectorMethods.binSearchVectorElement(vector2, variable));
	}

	@Test
	public void binSearchVectorElementNotHasTest() throws VectorIsEmpty, OutOfBoundsVector {
		int index = -1;
		double variable = 101;

		assertEquals(index, SearchVectorMethods.binSearchVectorElement(vector1, variable));
	}

}
