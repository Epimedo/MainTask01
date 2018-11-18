package by.epam.javatraining.halavin.tasks.maintask01.model.logic;

import java.util.Arrays;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfBoundsVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsEmpty;

public class SearchVectorMethods {

	// linear search element
	// algorithm complexity:
	// the worst O(n)
	// the best O(1)
	public static int linSearchVectorElement(DoubleVector vector, double element)
			throws VectorIsEmpty, OutOfBoundsVector {
		int key = -1;

		for (int i = 0; i < vector.getCount(); i++) {
			if (vector.getItem(i) == element) {
				key = i;
				break;
			}
		}

		return key;
	}

	// binary search element
	// algorithm complexity:
	// the worst O(log(n))
	// the best O(1)
	public static int binSearchVectorElement(DoubleVector vector, double element)
			throws VectorIsEmpty, OutOfBoundsVector {
		int key = -1;

		Arrays.sort(vector.getALLItems());

		int low = 0, high = vector.getCount()-1, mid;

		while (low <= high) {
			mid = (low + high) / 2;
			if (vector.getItem(mid) == element) {
				key = mid;
				break;
			} else {
				if (element < vector.getItem(mid)) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
		}

		return key;
	}
}
