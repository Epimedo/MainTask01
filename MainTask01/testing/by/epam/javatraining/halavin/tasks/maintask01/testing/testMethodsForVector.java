package by.epam.javatraining.halavin.tasks.maintask01.testing;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfBoundsVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsEmpty;
import by.epam.javatraining.halavin.tasks.maintask01.model.logic.MethodsForVector;
import by.epam.javatraining.halavin.tasks.maintask01.view.vector.VectorOutput;

public class testMethodsForVector {
	private DoubleVector vector;

	@Test
	public void findMaxElementTest() throws VectorIsEmpty, OutOfBoundsVector {
		vector = new DoubleVector(5, 6, .234, 1.23, 3453, 323, 22);
		double max = 3453;
		assertEquals(max, MethodsForVector.findMaxElement(vector), 0);
	}

	@Test
	public void findMinElementTest() throws VectorIsEmpty, OutOfBoundsVector {
		vector = new DoubleVector(5, 6, .234, 1.23, 3453, 323, 22);
		double min = .234;
		assertEquals(min, MethodsForVector.findMinElement(vector),3);
	}

	@Test
	public void findVectorAverageTest() throws VectorIsEmpty, OutOfBoundsVector {
		vector = new DoubleVector(5, 6, .234, 1.23, 3453, 323, 22);
		double average = 0;

		for (int i = 0; i < 7; i++) {
			average += vector.getItem(i);
		}
		average /= 7;

		assertEquals(average, MethodsForVector.findVectorAverage(vector),3);
	}

	@Test
	public void findVectorGeometricTest() throws VectorIsEmpty, OutOfBoundsVector {
		vector = new DoubleVector(5, 6, .234, 1.23, 3453, 323, 22);
		double geometric = 1;

		for (int i = 0; i < 7; i++) {
			geometric *= vector.getItem(i);
		}
		geometric = Math.pow(geometric, 1. / 7);

		assertEquals(geometric, MethodsForVector.findVectorGeometric(vector),3);
	}

	@Test
	public void isEncreasingTrueTest() throws VectorIsEmpty, OutOfBoundsVector {
		vector = new DoubleVector(1, 2, 3, 4, 6, 7);

		assertTrue(MethodsForVector.isEncreasing(vector));
	}

	@Test
	public void isEncreasingFalseTest() throws VectorIsEmpty, OutOfBoundsVector {
		vector = new DoubleVector(5, 6, .234, 1.23, 3453, 323, 22);

		assertFalse(MethodsForVector.isEncreasing(vector));
	}

	@Test
	public void findLocaLMinIndexHasTest() throws VectorIsEmpty, OutOfBoundsVector {
		vector = new DoubleVector(7, 6, .234, 1.23, 3453, 323, 22);
		int index = 2;
		assertEquals(index, MethodsForVector.findLocaLMinIndex(vector));
	}

	@Test
	public void findLocaLMinIndexNotHasTest() throws VectorIsEmpty, OutOfBoundsVector {
		vector = new DoubleVector(7, 6, 6, 7, 6, 6, 7);
		int index = -1;
		assertEquals(index, MethodsForVector.findLocaLMinIndex(vector));
	}

	@Test
	public void findLocaLMaxIndexHasTest() throws VectorIsEmpty, OutOfBoundsVector {
		vector = new DoubleVector(7, 6, .234, 1.23, 3453, 323, 22);
		int index = 0;
		assertEquals(index, MethodsForVector.findLocaLMaxIndex(vector));
	}

	@Test
	public void findLocaLMaxIndexNotHasTest() throws VectorIsEmpty, OutOfBoundsVector {
		vector = new DoubleVector(6, 7, 7, 6, 8, 8, 8, 9, 9, 10, 10);
		int index = -1;
		assertEquals(index, MethodsForVector.findLocaLMaxIndex(vector));
	}

	@Test
	public void reverseVectorTest() throws VectorIsEmpty, OutOfBoundsVector {
		vector = new DoubleVector(7, 6, .234, 1.23, 3453, 323, 22);
		double[] reverseArr = { 22, 323, 3453, 1.23, .234, 6, 7 };

	
		MethodsForVector.reverseVector(vector);
		if (!Arrays.equals(reverseArr, vector.getALLItems())) {
			fail();
		}
	}

}
