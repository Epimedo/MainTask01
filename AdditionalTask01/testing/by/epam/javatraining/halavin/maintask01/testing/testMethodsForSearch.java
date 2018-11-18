package by.epam.javatraining.halavin.maintask01.testing;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.Matrix;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.MatrixIsEmpty;
import by.epam.javatraining.halavin.tasks.maintask01.model.logic.MethodsForMatrix;
import by.epam.javatraining.halavin.tasks.maintask01.model.logic.MethodsForSearch;

public class testMethodsForSearch {
	public Matrix matrix;

	@Test
	public void testFindLocaLMaxIndex() throws MatrixIsEmpty {
		double[][] array = { { 1, 3, 2 }, { 2, 1, 5 } };
		matrix = new Matrix(array);

		int[] index = MethodsForSearch.findLocaLMaxIndex(matrix);
		int[] trueIndex = { 0, 1 };
		if (!Arrays.equals(trueIndex, index)) {
			fail();
		}
	}
	

	@Test
	public void testFindLocaLMaxIndexNotHas() throws MatrixIsEmpty {
		double[][] array = { { 1, 1, 1 }, { 1, 1, 1 } };
		matrix = new Matrix(array);

		int[] index = MethodsForSearch.findLocaLMaxIndex(matrix);
		int[] trueIndex = { -1, -1 };
		if (!Arrays.equals(trueIndex, index)) {
			fail();
		}
	}

	@Test
	public void testFindLocaLMinIndex() throws MatrixIsEmpty {
		double[][] array = { { 1, 3, 2 }, { 2, 1, 5 } };
		matrix = new Matrix(array);

		int[] index = MethodsForSearch.findLocaLMinIndex(matrix);
		int[] trueIndex = { 0, 0 };
		if (!Arrays.equals(trueIndex, index)) {
			fail();
		}
	}
	
	@Test
	public void testFindLocaLMinIndexNotHas() throws MatrixIsEmpty {
		double[][] array = { { 1, 1, 1 }, { 1, 1, 1 } };
		matrix = new Matrix(array);

		int[] index = MethodsForSearch.findLocaLMinIndex(matrix);
		int[] trueIndex = { -1, -1 };
		if (!Arrays.equals(trueIndex, index)) {
			fail();
		}
	}

}
