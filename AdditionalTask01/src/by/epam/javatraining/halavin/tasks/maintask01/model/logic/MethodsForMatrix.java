package by.epam.javatraining.halavin.tasks.maintask01.model.logic;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.Matrix;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.MatrixIsEmpty;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfMatrixBounds;

public class MethodsForMatrix {

	// method finds the maximum element
	public static double findMaxELement(Matrix matrix) throws MatrixIsEmpty, OutOfMatrixBounds {
		double maxelement = matrix.getItem(0, 0);

		for (int i = 0; i < matrix.rlength(); i++) {
			for (int j = 0; j < matrix.clength(); j++) {
				if (matrix.getItem(i, j) > maxelement) {
					maxelement = matrix.getItem(i, j);
				}
			}
		}

		return maxelement;
	}

	// method finds the minimum element
	public static double findMinELement(Matrix matrix) throws MatrixIsEmpty, OutOfMatrixBounds {
		double minelement = matrix.getItem(0, 0);

		for (int i = 0; i < matrix.rlength(); i++) {
			for (int j = 0; j < matrix.clength(); j++) {
				if (matrix.getItem(i, j) < minelement) {
					minelement = matrix.getItem(i, j);
				}
			}
		}

		return minelement;
	}

	// method finds the matrix's average
	public static double findMatrixAverage(Matrix matrix) throws MatrixIsEmpty, OutOfMatrixBounds {
		double average = 0;

		for (int i = 0; i < matrix.rlength(); i++) {
			for (int j = 0; j < matrix.clength(); j++) {
				average += matrix.getItem(i, j);
			}
		}

		average /= (matrix.rlength() * matrix.clength());

		return average;
	}

	// method finds the matrix's geometric
	public static double findMatrixGeometric(Matrix matrix) throws MatrixIsEmpty, OutOfMatrixBounds {
		double geometric = 1;

		for (int i = 0; i < matrix.rlength(); i++) {
			for (int j = 0; j < matrix.clength(); j++) {
				geometric *= matrix.getItem(i, j);
			}
		}

		geometric = Math.pow(geometric, 1. / (matrix.rlength() * matrix.clength()));

		return geometric;
	}

	// this methods returns true if the matrix is symmetric about the main axis
	public static boolean isSymmetricMain(Matrix matrix) throws MatrixIsEmpty, OutOfMatrixBounds {
		boolean issym = true;

		if (matrix.rlength() != matrix.clength()) {
			return false;
		}

		for (int i = 0; i < matrix.rlength(); i++) {
			for (int j = i + 1; j < matrix.clength(); j++) {
				if (matrix.getItem(i, j) != matrix.getItem(j, i)) {
					issym = false;
					break;
				}
			}
		}

		return issym;
	}

	// this method returns true if the matrix is symmetric about the the secondary
	// axis
	public static boolean isSymmetricIncidental(Matrix matrix) throws MatrixIsEmpty, OutOfMatrixBounds {
		boolean issym = true;

		if (matrix.rlength() != matrix.clength()) {
			return false;
		}

		for (int i = 0; i < matrix.rlength() - 1; i++) {
			for (int j = matrix.clength() - i - 1, k = i; j >= 0; j--, k++) {
				if (matrix.getItem(matrix.rlength() - i - 1, k) != matrix.getItem(j, i)) {
					issym = false;
					break;
				}
			}
		}

		return issym;
	}

	// this method copies the input matrix and then transposes the copy
	public static void transposeMatrix(Matrix matrix) throws MatrixIsEmpty, OutOfMatrixBounds {
		double[][] transMatr = new double[matrix.clength()][matrix.rlength()];

		for (int i = 0; i < transMatr.length; i++) {
			for (int j = 0; j < transMatr[i].length; j++) {
				transMatr[i][j] = matrix.getItem(j, i);
			}
		}

		matrix.setALLItems(transMatr);
	}
}
