package by.epam.javatraining.halavin.maintask01.testing;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.Matrix;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.MatrixIsEmpty;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.MatrixIsFull;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfMatrixBounds;
import junit.framework.Assert;

public class testMatrix {
	public Matrix matrix1;
	public Matrix matrix2;

	@Test
	public void testHashCode() {
		matrix1 = new Matrix();
		matrix2 = new Matrix();

		Assert.assertEquals(matrix2.hashCode(), matrix2.hashCode());
	}

	@Test
	public void testMatrix() {
		matrix1 = new Matrix();
		int rows = 4;
		int columns = 3;

		Assert.assertEquals(rows, matrix1.rlength());
		Assert.assertEquals(columns, matrix1.clength());
	}

	@Test
	public void testMatrixIntInt() {
		matrix1 = new Matrix(3, 4);
		int rows = 3;
		int columns = 4;

		Assert.assertEquals(rows, matrix1.rlength());
		Assert.assertEquals(columns, matrix1.clength());
	}

	@Test
	public void testMatrixDoubleArrayArray() throws MatrixIsEmpty {
		double[][] array = { { 2, 3, 4 }, { 2, 1, 2 } };
		matrix1 = new Matrix(array);

		for (int i = 0; i < array.length; i++) {
			if (!Arrays.equals(array, matrix1.getALLItems())) {
				fail();
			}
		}

	}

	@Test
	public void testMatrixMatrix() {
		double[][] array = { { 2, 3, 4 }, { 2, 1, 2 } };
		matrix1 = new Matrix(array);
		matrix2 = new Matrix(array);

		if (!matrix1.equals(matrix2)) {
			fail();
		}
	}

	@Test
	public void testSetALLItems() throws MatrixIsEmpty {
		double[][] array = { { 2, 3, 4 }, { 2, 1, 2 } };
		matrix1 = new Matrix();

		matrix1.setALLItems(array);

		for (int i = 0; i < array.length; i++) {
			if (!Arrays.equals(array, matrix1.getALLItems())) {
				fail();
			}
		}
	}

	@Test
	public void testGetALLItems() throws MatrixIsEmpty {
		double[][] array = { { 2, 3, 4 }, { 2, 1, 2 } };
		matrix1 = new Matrix();

		matrix1.setALLItems(array);

		for (int i = 0; i < array.length; i++) {
			if (!Arrays.equals(array, matrix1.getALLItems())) {
				fail();
			}
		}
	}

	@Test(expected = MatrixIsEmpty.class)
	public void testGetALLItemsError() throws MatrixIsEmpty {
		matrix1 = new Matrix();

		matrix1.getALLItems();
	}

	@Test
	public void testGetItem() throws MatrixIsEmpty, OutOfMatrixBounds {
		int rindex = 2;
		int cindex = 1;

		double[][] array = { { 2, 3, 4 }, { 2, 1, 2 }, { 1, 7, 9 } };
		matrix1 = new Matrix(array);

		Assert.assertEquals(7., matrix1.getItem(rindex, cindex));
	}

	@Test
	public void testAddItem() throws MatrixIsFull, MatrixIsEmpty, OutOfMatrixBounds {
		matrix1 = new Matrix();
		matrix1.addItem(1);
		matrix1.addItem(2);
		matrix1.addItem(3);
		matrix1.addItem(4);
		matrix1.addItem(5);

		Assert.assertEquals(4., matrix1.getItem(1, 0));

	}

	@Test
	public void testSetItem() throws MatrixIsEmpty, OutOfMatrixBounds {
		int rindex = 2;
		int cindex = 1;
		double item = .4342;

		double[][] array = { { 2, 3, 4 }, { 2, 1, 2 }, { 1, 7, 9 } };
		matrix1 = new Matrix(array);
		matrix1.setItem(item, rindex, cindex);

		Assert.assertEquals(item, matrix1.getItem(rindex, cindex));
	}

	@Test
	public void testRlength() {
		matrix1 = new Matrix(2, 5);

		Assert.assertEquals(2, matrix1.rlength());
	}

	@Test
	public void testClength() {
		matrix1 = new Matrix(4, 9);

		Assert.assertEquals(9, matrix1.clength());
	}

	@Test
	public void testRowCount() {
		matrix1 = new Matrix();

		Assert.assertEquals(0, matrix1.rowCount());
	}

	@Test
	public void testColumnCount() throws MatrixIsFull {
		matrix1 = new Matrix();
		matrix1.addItem(1);
		matrix1.addItem(1);
		matrix1.addItem(1);
		matrix1.addItem(1);
		matrix1.addItem(1);

		int columncount = 3;
		Assert.assertEquals(columncount, matrix1.columnCount());
	}

	@Test
	public void testCount() {
		double[][] array = { { 2, 3, 4 }, { 2, 1, 2 } };
		matrix1 = new Matrix(array);

		int count = 6;
		Assert.assertEquals(count, matrix1.count());
	}

	@Test
	public void testToString() {
		double[][] arr1 = { { 1, 2, 3 }, { 23, 32, 4 } };
		matrix1 = new Matrix(arr1);

		String str = "\n1.0 2.0 3.0 \n23.0 32.0 4.0 \n";

		Assert.assertEquals(str, matrix1.toString());
	}

	@Test
	public void testEqualsObject() {
		double[][] arr1 = { { 1, 2, 3 }, { 23, 32, 4 } };
		double[][] arr2 = { { 1, 2, 3 }, { 23, 32, 4 } };
		matrix1 = new Matrix(arr1);
		matrix2 = new Matrix(arr2);

		if (!matrix1.equals(matrix2)) {
			fail();
		}
	}

}
