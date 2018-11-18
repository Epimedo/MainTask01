package by.epam.javatraining.halavin.tasks.maintask01.model.logic;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.Matrix;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.MatrixIsEmpty;

public class MatrixCreator {

	public static Matrix createMatrix() {
		return new Matrix();
	}

	public static Matrix createMatrixSizeOf(int i, int j) {
		return new Matrix(i, j);
	}

	public static Matrix createMatrixOfArray(double[][] array) {
		return new Matrix(array);
	}

	public static Matrix createMatrixCopy(Matrix matrix) throws MatrixIsEmpty {
		return new Matrix(matrix);
	}
}
