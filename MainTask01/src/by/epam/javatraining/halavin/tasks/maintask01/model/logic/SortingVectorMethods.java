package by.epam.javatraining.halavin.tasks.maintask01.model.logic;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfBoundsVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsEmpty;

public class SortingVectorMethods {

	// bubble vector sorting
	// algorithm complexity:
	// the worst O(n^2)
	// the best O(n)
	public static void bubbleSortVector(DoubleVector vector) throws VectorIsEmpty, OutOfBoundsVector {
		double swapVar = 0;
		boolean swap = true;
		for (int i = 0; i < vector.getCount() - 1; i++) {
			if (!swap) {
				break;
			}else {
				swap = false;
			}
			for (int j = 0; j < vector.getCount() - i - 1; j++) {
				if (vector.getItem(j) > vector.getItem(j + 1)) {
					swap = true;
					swapVar = vector.getItem(j);
					vector.setItem(vector.getItem(j + 1), j);
					vector.setItem(swapVar, j + 1);
				}
			}
		}

	}

	// selection vector sorting
	// algorithm complexity:
	// the worst O(n^2)
	// the best O(n^2)
	public static void selectionSortVector(DoubleVector vector) throws VectorIsEmpty, OutOfBoundsVector {
		int minIndex = 0;
		double swapvar = 0;

		for (int i = 0; i < vector.getCount() - 1; i++) {
			minIndex = i;

			for (int j = i + 1; j < vector.getCount(); j++) {
				if (vector.getItem(minIndex) > vector.getItem(j)) {
					minIndex = j;
				}
			}

			swapvar = vector.getItem(i);
			vector.setItem(vector.getItem(minIndex), i);
			vector.setItem(swapvar, minIndex);
		}

	}

	// insertion vector sorting
	// algorithm complexity:
	// the worst O(n^2)
	// the best O(n)
	public static void insertionSortVectorInt(DoubleVector vector) throws OutOfBoundsVector, VectorIsEmpty {
		double swapVar = 0;
		int j = 0;

		for (int i = 1; i < vector.getCount(); i++) {
			swapVar = vector.getItem(i);
			j = i - 1;

			while (j >= 0 && vector.getItem(j) > swapVar) {
				vector.setItem(vector.getItem(j), j + 1);
				j--;
			}
			vector.setItem(swapVar, j + 1);
		}
	}

	private static void merge(double[] array, int l, int m, int r) {
		int i, j, k;
		int n1 = m - l + 1;
		int n2 = r - m;

		double[] L = new double[n1];
		double[] R = new double[n2];

		for (i = 0; i < n1; i++)
			L[i] = array[l + i];
		for (j = 0; j < n2; j++)
			R[j] = array[m + 1 + j];

		i = 0;
		j = 0;
		k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}

	// merge vector sorting, it uses mergeVector method to merges two subvectors
	private static void mergeSort(double[] array, int l, int r) {
		if (l < r) {
			int m = l + (r - l) / 2;

			mergeSort(array, l, m);
			mergeSort(array, m + 1, r);

			merge(array, l, m, r);
		}
	}

	public static void mergeSortVector(DoubleVector vector) throws VectorIsEmpty {
		mergeSort(vector.getALLItems(), 0, vector.getCount() - 1);
	}

	/*
	 * This function takes last element as pivot, places the pivot element at its
	 * correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot
	 * 
	 * algorithm complexity: the worst O(n*log(n)) the best O(n*log(n))
	 */
	private static int partition(double[] array, int low, int high) {
		double pivot = array[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {

			if (array[j] <= pivot) {
				i++;

				double temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		double temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		return i + 1;
	}

	// vector quicksort
	// algorithm complexity:
	// the worst O(n^2)
	// the best O(n log (n))
	private static void quickSort(double array[], int low, int high) {
		if (low < high) {
			int pi = partition(array, low, high);

			quickSort(array, low, pi - 1);
			quickSort(array, pi + 1, high);
		}
	}

	public static void quickSortVector(DoubleVector vector) throws VectorIsEmpty {
		quickSort(vector.getALLItems(), 0, vector.getCount() - 1);
	}
}
