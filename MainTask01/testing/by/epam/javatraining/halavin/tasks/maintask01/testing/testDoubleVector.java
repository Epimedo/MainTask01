package by.epam.javatraining.halavin.tasks.maintask01.testing;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfBoundsVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsEmpty;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsFull;
import by.epam.javatraining.halavin.tasks.maintask01.view.vector.CreateRandomVecInput;
import by.epam.javatraining.halavin.tasks.maintask01.view.vector.VectorInput;

public class testDoubleVector {
	private DoubleVector vector;
	private DoubleVector initVector;

	@Before
	public void initVector() {
		initVector = new DoubleVector();
	}

	@Test
	public void doubleVectorConstrTest() {
		vector = new DoubleVector();
		int defaultdoubleVectorSize = 15;

		assertEquals(defaultdoubleVectorSize, vector.length());
	}

	@Test
	public void doubleVectorDoubleArrayTest() throws VectorIsEmpty {
		vector = new DoubleVector(1, 5, 6, 7, 11, 56);
		double[] testVector = { 1, 5, 6, 7, 11, 56 };

		if (!Arrays.equals(vector.getALLItems(), testVector)) {
			fail();
		}
	}

	@Test
	public void doubleVectorDoubleVectorTest() throws VectorIsEmpty, OutOfBoundsVector, VectorIsFull {
		DoubleVector testVector = new DoubleVector(1, 5, 6, 7, 11, 56);
		vector = new DoubleVector(testVector);

		if (!Arrays.equals(vector.getALLItems(), testVector.getALLItems())) {
			fail();
		}
	}

	@Test
	public void getItemTest() throws VectorIsEmpty, OutOfBoundsVector {
		vector = new DoubleVector(1, 5, 6, 7, 11, 56);
		int index = 3;
		assertEquals(7., vector.getItem(index),4);
	}

	@Test(expected = OutOfBoundsVector.class)
	public void getItemOutOfVectorTest() throws VectorIsEmpty, OutOfBoundsVector {
		vector = new DoubleVector(1, 5, 6, 7, 11, 56);
		int index = 10;

		vector.getItem(index);
	}

	@Test(expected = VectorIsEmpty.class)
	public void getItemOfEmprtyVectorTest() throws VectorIsEmpty, OutOfBoundsVector {
		vector = new DoubleVector();
		int index = 5;

		vector.getItem(index);
	}

	@Test
	public void setALLItemsTest() throws VectorIsEmpty {
		double[] testVector = { 1, 3, 5, 1, 2 };
		double[] testVector2 = { 1, 3, 5, 1, 2 };
		vector = new DoubleVector();

		vector.setALLItems(testVector);

		if (!Arrays.equals(vector.getALLItems(), testVector2)) {
			fail();
		}
	}

	@Test
	public void addItemTest() throws VectorIsFull, VectorIsEmpty, OutOfBoundsVector {
		vector = new DoubleVector();
		vector.addItem(15);
		vector.addItem(13);
		vector.addItem(12);
		vector.addItem(67);

		double[] testarr = { 15, 13, 12, 67 };
		assertEquals(vector.getItem(0), testarr[0],4);
		assertEquals(vector.getItem(1), testarr[1],4);
		assertEquals(vector.getItem(2), testarr[2],4);
		assertEquals(vector.getItem(3), testarr[3],4);

	}

	@Test(expected = VectorIsFull.class)
	public void addItemFullExcTest() throws VectorIsFull {
		VectorInput in = new CreateRandomVecInput().create();
		in.fill(initVector);
		initVector.addItem(15);
	}

	@Test
	public void LengthTest() {
		vector = new DoubleVector(1, 5, 6, 7, 3, 4);
		int size = 6;
		assertEquals(size, vector.length());
	}

	@Test
	public void getCountTest() throws VectorIsFull {
		vector = new DoubleVector();
		vector.addItem(5);
		vector.addItem(3);
		vector.addItem(5.5);

		int count = 3;
		assertEquals(count, vector.getCount());
	}

	@Test
	public void setItemTest() throws OutOfBoundsVector, VectorIsEmpty {
		double item = 5.8;
		int index = 4;
		vector = new DoubleVector(5, 6, 7, 8, 9, 0, 678);
		vector.setItem(item, index);

		assertEquals(item, vector.getItem(index),4);
	}

	@Test(expected = OutOfBoundsVector.class)
	public void setItemOutOfBoundsTest() throws OutOfBoundsVector, VectorIsEmpty {
		double item = 5.8;
		int index = -1;
		vector = new DoubleVector(5, 6, 7, 8, 9, 0, 678);
		vector.setItem(item, index);

	}

	@Test
	public void toStringTest() {
		vector = new DoubleVector(1, 2, 3, 4, 5, 6, 7, 8, 9);
		String teststr = "1.0 2.0 3.0 4.0 5.0 6.0 7.0 8.0 9.0 ";

		assertEquals(teststr, vector.toString());

	}

	@Test
	public void equalsTrueTest() {
		vector = new DoubleVector(1, 2, 3, 4, 5, 6, 7, 8, 9);
		DoubleVector vector2 = new DoubleVector(1, 2, 3, 4, 5, 6, 7, 8, 9);

		assertTrue(vector.equals(vector2));
	}

	@Test
	public void FalseTest() {
		vector = new DoubleVector(1, 2, 3, 4, 5, 6, 7, 8, 9);
		DoubleVector vector2 = new DoubleVector(0, 2, 3, 4, 5, 6, 7, 8, 9);

		assertFalse(vector.equals(vector2));
	}

	@Test
	public void hashcodeTrueTest() {
		vector = new DoubleVector(1, 2, 3, 4, 5, 6, 7, 8, 9);
		DoubleVector vector2 = new DoubleVector(1, 2, 3, 4, 5, 6, 7, 8, 9);

		assertEquals(vector.hashCode(), vector2.hashCode());
	}

	@Test
	public void hashcodeFalseTest() {
		vector = new DoubleVector(2, 4, 74, 5, 6, 7);
		DoubleVector vector2 = new DoubleVector(4, 7, 2, 3, 5);

		assertFalse(vector.hashCode() == vector2.hashCode());
	}

}
