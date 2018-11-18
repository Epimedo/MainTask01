package by.epam.javatraining.halavin.tasks.maintask01.model.entities;

import java.util.Arrays;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.log4j.Logger;

import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfBoundsVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsEmpty;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsFull;

public class DoubleVector {
	public static Logger LOG = Logger.getRootLogger();
	
	public static final int ARRAY_DEFAULT_SIZE = 15;
	private double[] array;
	private int count = 0;

	// creates default size vector
	public DoubleVector() {
		array = new double[ARRAY_DEFAULT_SIZE];
	}

	// takes incoming array
	public DoubleVector(double... ar) {
		array = ar;
		count = ar.length;
	}

	// makes copy incoming vector
	public DoubleVector(DoubleVector copyVector) {
		array = new double[copyVector.length()];

		for (int i = 0; i < array.length; i++) {
			try {
				addItem(copyVector.getItem(i));
			} catch (VectorIsFull | VectorIsEmpty | OutOfBoundsVector e) {
				LOG.info(e.getMessage());
				e.printStackTrace();
			}
		}
	}

	// returns item with requested index
	public double getItem(int index) throws VectorIsEmpty, OutOfBoundsVector {
		if (count == 0) {
			throw new VectorIsEmpty();
		}

		if (index < 0 || index > count - 1) {
			throw new OutOfBoundsVector();
		}

		return array[index];
	}

	// returns array
	public double[] getALLItems() throws VectorIsEmpty {
		if (count == 0) {
			throw new VectorIsEmpty();
		}

		return array;
	}

	// changes array to incoming
	public void setALLItems(double[] arr) {
		array = arr;
		count = arr.length;
	}

	// puts new item in the end of vector
	public void addItem(double item) throws VectorIsFull {
		if (count == array.length) {
			throw new VectorIsFull();
		}
		array[count++] = item;
	}

	// returns array's size
	public int length() {
		return array.length;
	}

	// returns the item's count in array
	public int getCount() {
		return count;
	}

	// puts item in requested place
	public void setItem(double item, int index) throws OutOfBoundsVector {
		if (index < 0 || index > count - 1) {
			throw new OutOfBoundsVector();
		}

		array[index] = item;
	}

	// returns a string representation of the vector
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < count; i++) {
			sb.append(array[i]).append(" ");
		}

		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		DoubleVector vector = (DoubleVector) obj;

		if (this == obj) {
			isEqual = true;
		} else {
			if (obj == null || this.getClass() != obj.getClass()) {
				isEqual = false;
			} else
				try {
					if (Arrays.equals(array, vector.getALLItems())) {
						isEqual = new EqualsBuilder().append(count, vector.count).isEquals();
					}
				} catch (VectorIsEmpty e) {
					LOG.debug(e.getMessage());
					e.printStackTrace();
				}
		}
		return isEqual;
	}

	@Override
	public int hashCode() {
		int hashSum = 0;

		for (int i = 0; i < array.length; i++) {
			hashSum += array[i] * (i + 1);
		}

		return new HashCodeBuilder(9, 19).append(count).toHashCode() + hashSum;
	}
}
