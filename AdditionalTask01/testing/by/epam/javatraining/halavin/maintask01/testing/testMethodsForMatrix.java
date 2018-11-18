package by.epam.javatraining.halavin.maintask01.testing;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.Matrix;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.MatrixIsEmpty;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfMatrixBounds;
import by.epam.javatraining.halavin.tasks.maintask01.model.logic.MethodsForMatrix;
import junit.framework.Assert;

public class testMethodsForMatrix {
	public Matrix matrix1;
	public Matrix matrix2;

	@Test
	public void testFindMaxELement() throws MatrixIsEmpty, OutOfMatrixBounds {
		double[][] ar = { { 1, 2, 1, 6, 2, 10, 234, 32, 4, .4324, 23 },
				{ 123, 243, 234, 1, 2, 3, 4, 543, .534, 12, 31 } };
		matrix1 = new Matrix(ar);

		Assert.assertEquals(543., MethodsForMatrix.findMaxELement(matrix1));
	}

	@Test(expected = MatrixIsEmpty.class)
	public void testFindMaxELementErrowEmprty() throws MatrixIsEmpty, OutOfMatrixBounds {
		matrix1 = new Matrix();

		Assert.assertEquals(543., MethodsForMatrix.findMaxELement(matrix1));
	}

	
	@Test
	public void testFindMinELement() throws MatrixIsEmpty, OutOfMatrixBounds {
		double[][] ar = { { 1, 2, 1, 6, 2, 10, 234, 32, 4, .4324, 23 },
				{ 123, 243, 234, 1, 2, 3, 4, 543, .534, 12, 31 } };
		matrix1 = new Matrix(ar);

		Assert.assertEquals(.4324, MethodsForMatrix.findMinELement(matrix1));
	}

	@Test
	public void testFindMatrixAverage() throws MatrixIsEmpty, OutOfMatrixBounds {
		double[][] ar = { { 1, 2, 1, 6, 2, 10, 234, 32, 4, .4324, 23 },
				{ 123, 243, 234, 1, 2, 3, 4, 543, .534, 12, 31 } };
		matrix1 = new Matrix(ar);
		double average = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				average += ar[i][j];
			}
		}

		average /= ar.length * ar[0].length;

		Assert.assertEquals(average, MethodsForMatrix.findMatrixAverage(matrix1));
	}

	@Test
	public void testFindMatrixGeometric() throws MatrixIsEmpty, OutOfMatrixBounds {
		double[][] ar = { { 1, 2, 1, 6, 2, 10, 234, 32, 4, .4324, 23 },
				{ 123, 243, 234, 1, 2, 3, 4, 543, .534, 12, 31 } };
		matrix1 = new Matrix(ar);
		double average = 1;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				average *= ar[i][j];
			}
		}

		average = Math.pow(average, 1. / (ar.length * ar[0].length));

		Assert.assertEquals(average, MethodsForMatrix.findMatrixGeometric(matrix1));
	}

	@Test
	public void testIsSymmetricMainFalse() throws MatrixIsEmpty, OutOfMatrixBounds {
		double[][] ar = { { 1, 2, 1, 6, 2, 10, 234, 32, 4, .4324, 23 },
				{ 123, 243, 234, 1, 2, 3, 4, 543, .534, 12, 31 } };
		matrix1 = new Matrix(ar);

		Assert.assertFalse(MethodsForMatrix.isSymmetricMain(matrix1));
	}

	@Test
	public void testIsSymmetricIncidentalFalse() throws MatrixIsEmpty, OutOfMatrixBounds {
		double[][] ar = { { 1, 2, 1, 6, 2, 10, 234, 32, 4, .4324, 23 },
				{ 123, 243, 234, 1, 2, 3, 4, 543, .534, 12, 31 } };
		matrix1 = new Matrix(ar);

		Assert.assertFalse(MethodsForMatrix.isSymmetricIncidental(matrix1));
	}

	@Test
	public void testTransposeMatrix() throws MatrixIsEmpty, OutOfMatrixBounds {
		double[][] ar1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		double[][] ar2 = { { 1, 5 }, { 2, 6 }, { 3, 7 }, { 4, 8 } };
		matrix2 = new Matrix(ar1);
		matrix1 = new Matrix(ar2);

		MethodsForMatrix.transposeMatrix(matrix2);
		if (!matrix1.equals(matrix2)) {
			fail();
		}
	}

}
