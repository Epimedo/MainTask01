package by.epam.javatraining.halavin.tasks.maintask01.model.logic;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.Matrix;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.MatrixIsEmpty;

public class MethodsForSearch {

	// findLocalMaxindex methods uses this method to compare neighboring items
	private static boolean checkLocalMax(double[][] matrix, int i, int j) {
		boolean isMax = true;
		if (i > 0 && matrix[i][j] <= matrix[i - 1][j]) {
			isMax = false;
		}

		if (isMax && i < matrix.length - 1 && matrix[i][j] <= matrix[i + 1][j]) {
			isMax = false;
		}
		if (isMax && j > 0 && matrix[i][j] <= matrix[i][j - 1]) {
			isMax = false;
		}
		if (isMax && j < matrix[0].length - 1 && matrix[i][j] <= matrix[i][j + 1]) {
			isMax = false;
		}

		return isMax;
	}

	// this methods returns the indexes of local maximum or {-1 , -1} if there is no
	// local minimum
	public static int[] findLocaLMaxIndex(Matrix matrix) throws MatrixIsEmpty {
		int[] maxlocal = { -1, -1 };

		for (int i = 0; i < matrix.rlength(); i++) {
			for (int j = 0; j < matrix.clength(); j++) {
				if (checkLocalMax(matrix.getALLItems(), i, j)) {
					maxlocal[0] = i;
					maxlocal[1] = j;
					return maxlocal;
				}
			}
		}

		return maxlocal;
	}

	// findLocalMinindex methods uses this method to compare neighboring items
	private static boolean checkLocalMin(double[][] matrix, int i, int j) {
		boolean isMin = true;
		if (i > 0 && matrix[i][j] >= matrix[i - 1][j]) {
			isMin = false;
		}

		if (isMin && i < matrix.length - 1 && matrix[i][j] >= matrix[i + 1][j]) {
			isMin = false;
		}
		if (isMin && j > 0 && matrix[i][j] >= matrix[i][j - 1]) {
			isMin = false;
		}
		if (isMin && j < matrix[0].length - 1 && matrix[i][j] >= matrix[i][j + 1]) {
			isMin = false;
		}

		return isMin;
	}

	// this methods returns the indexes of local minimum or {-1 , -1} if there is no
	// local minimum
	public static int[] findLocaLMinIndex(Matrix matrix) throws MatrixIsEmpty {
		int[] minlocal = { -1, -1 };

		for (int i = 0; i < matrix.rlength(); i++) {
			for (int j = 0; j < matrix.clength(); j++) {
				if (checkLocalMin(matrix.getALLItems(), i, j)) {
					minlocal[0] = i;
					minlocal[1] = j;
					return minlocal;
				}
			}
		}

		return minlocal;
	}
}
