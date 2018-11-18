package by.epam.javatraining.halavin.tasks.maintask01.model.logic;

import java.util.Arrays;

import org.apache.log4j.Logger;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfBoundsVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsEmpty;

public class MethodsForVector {

	// finding the maximum element
	// algorithm complexity:
	// the worst O(n)
	// the best O(1)
	public static double findMaxElement(DoubleVector vector) throws VectorIsEmpty, OutOfBoundsVector {
		double max = vector.getItem(0);

		for (int i = 0; i < vector.getCount(); i++) {
			if (vector.getItem(i) > max) {
				max = vector.getItem(i);
			}
		}

		return max;
	}

	// finding the minimum element
	// algorithm complexity:
	// the worst O(n)
	// the best O(1)
	public static double findMinElement(DoubleVector vector) throws VectorIsEmpty, OutOfBoundsVector {
		double min = vector.getItem(0);

		for (int i = 0; i < vector.getCount(); i++) {
			if (vector.getItem(i) < min) {
				min = vector.getItem(i);
			}
		}

		return min;
	}

	// finding the vector's average
	public static double findVectorAverage(DoubleVector vector) throws VectorIsEmpty, OutOfBoundsVector {
		double average = 0;

		for (int i = 0; i < vector.getCount(); i++) {
			average += vector.getItem(i);
		}
		average /= vector.length();

		return average;
	}

	// finding the vector's geometric
	public static double findVectorGeometric(DoubleVector vector) throws VectorIsEmpty, OutOfBoundsVector {
		double geometric = 1;

		for (int i = 0; i < vector.getCount(); i++) {
			if (vector.getItem(i) == 0) {
				return 0;
			}
			geometric *= vector.getItem(i);
		}

		return Math.pow(geometric, 1. / vector.length());
	}

	// ascending definition
	public static boolean isEncreasing(DoubleVector vector) throws VectorIsEmpty, OutOfBoundsVector {
		boolean isEncreasing = true;

		for (int i = 0; i < vector.getCount() - 1; i++) {

			if (vector.getItem(i) > vector.getItem(i + 1)) {
				isEncreasing = false;
				break;
			}
		}

		return isEncreasing;
	}

	// finding the vector's local minimum index
	// algorithm complexity:
	// the worst O(n)
	// the best O(1)
	public static int findLocaLMinIndex(DoubleVector vector) throws VectorIsEmpty, OutOfBoundsVector {
		int key = -1;

		if (vector.getItem(0) < vector.getItem(1)) {
			key = 0;
		} else {

			for (int i = 1; i < vector.getCount() - 1; i++) {
				if (vector.getItem(i) < vector.getItem(i - 1) && vector.getItem(i) < vector.getItem(i + 1)) {
					key = i;
					return key;
				}
			}

			if (vector.getItem(vector.getCount() - 1) < vector.getItem(vector.getCount() - 2)) {
				key = vector.getCount() - 1;
			}
		}

		return key;

	}

	// finding the vector's local maximum index
	// algorithm complexity:
	// the worst O(n)
	// the best O(1)
	public static int findLocaLMaxIndex(DoubleVector vector) throws VectorIsEmpty, OutOfBoundsVector {
		int key = -1;
		if (vector.getItem(0) > vector.getItem(1)) {
			key = 0;
		} else {
			for (int i = 1; i < vector.getCount() - 1; i++) {
				if (vector.getItem(i) > vector.getItem(i - 1) && vector.getItem(i) > vector.getItem(i) + 1) {
					key = i;
					break;
				}
			}
			
			if (vector.getItem(vector.getCount() - 1) > vector.getItem(vector.getCount() - 2)) {
				key = vector.getCount() - 1;
			}
		}

		return key;
	}

	// vector's reverse
	public static void reverseVector(DoubleVector vector) throws VectorIsEmpty, OutOfBoundsVector {
		double swapVar = 0;

		for (int i = 0, j = vector.getCount() - 1; i < vector.getCount() / 2; i++, j--) {
			swapVar = vector.getItem(i);
			vector.setItem(vector.getItem(j), i);
			vector.setItem(swapVar, j);
		}
	}

}
