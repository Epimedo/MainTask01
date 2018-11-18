package by.epam.javatraining.halavin.tasks.maintask01.testing;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfBoundsVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsEmpty;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsFull;
import by.epam.javatraining.halavin.tasks.maintask01.model.logic.SortingVectorMethods;
import by.epam.javatraining.halavin.tasks.maintask01.view.vector.CreateRandomVecInput;
import by.epam.javatraining.halavin.tasks.maintask01.view.vector.VectorInput;
import by.epam.javatraining.halavin.tasks.maintask01.view.vector.VectorOutput;

public class testSortingVectorMethods {
	private DoubleVector vector;
	private double[] testArr;

	@Before
	public void initvectorsTest() throws VectorIsFull, VectorIsEmpty {
		vector = new DoubleVector();
		VectorInput in = new CreateRandomVecInput().create();
		in.fill(vector);
		testArr = Arrays.copyOf(vector.getALLItems(), vector.length());
	}

	@Test
	public void bubbleSortVectorTest() throws VectorIsEmpty, OutOfBoundsVector {
		Arrays.sort(testArr);
		SortingVectorMethods.bubbleSortVector(vector);

		if (!Arrays.equals(testArr, vector.getALLItems())) {
			fail();
		}
	}

	@Test
	public void selectionSortVectorTest() throws VectorIsEmpty, OutOfBoundsVector {
		Arrays.sort(testArr);
		SortingVectorMethods.selectionSortVector(vector);

		if (!Arrays.equals(testArr, vector.getALLItems())) {
			fail();
		}
	}

	@Test
	public void InsertionSortVectorIntTest() throws VectorIsEmpty, OutOfBoundsVector {
		Arrays.sort(testArr);
		SortingVectorMethods.insertionSortVectorInt(vector);

		if (!Arrays.equals(testArr, vector.getALLItems())) {
			fail();
		}
	}

	@Test
	public void mergeSortVectorTest() throws VectorIsEmpty {
		Arrays.sort(testArr);

		SortingVectorMethods.mergeSortVector(vector);

		if (!Arrays.equals(testArr, vector.getALLItems())) {
			fail();
		}
	}

	@Test
	public void QuickSortVectorTest() throws VectorIsEmpty {
		Arrays.sort(testArr);

		SortingVectorMethods.quickSortVector(vector);

		if (!Arrays.equals(testArr, vector.getALLItems())) {
			fail();
		}
	}

}
