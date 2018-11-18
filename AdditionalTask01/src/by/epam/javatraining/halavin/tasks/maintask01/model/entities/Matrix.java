package by.epam.javatraining.halavin.tasks.maintask01.model.entities;

import java.util.Arrays;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.log4j.Logger;

import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.MatrixIsEmpty;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.MatrixIsFull;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfMatrixBounds;

public class Matrix {
	public static final Logger LOG = Logger.getRootLogger();
	public static final int MATRIX_DEFAULT_SIZE_ROW = 4;
	public static final int MATRIX_DEFAULT_SIZE_COLUMN = 3;
	private double[][] matrix;
	private int count = 0;
	private int rowCount = 0;
	private int columnCount = 0;

	public Matrix() {
		matrix = new double[MATRIX_DEFAULT_SIZE_ROW][MATRIX_DEFAULT_SIZE_COLUMN];
	}

	public Matrix(int rows, int columns) {
		matrix = new double[rows][columns];
	}

	public Matrix(double[][] array) {
		matrix = array;
		count = array.length * array[0].length;
		rowCount = matrix.length;
		columnCount = matrix[0].length;
	}

	public Matrix(Matrix inmatrix) throws MatrixIsEmpty {
		double[][] inarray = inmatrix.getALLItems();
		matrix = new double[inarray.length][inarray[0].length];

		for (int i = 0; i < inarray.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = inarray[i][j];
			}
		}

		count = inmatrix.count();
		rowCount = inmatrix.rowCount();
		columnCount = inmatrix.columnCount();
	}

	public void setALLItems(double[][] array) {
		matrix = array;
		rowCount = matrix.length;
		columnCount = matrix[0].length;
		count = matrix.length * matrix[0].length;
	}

	public double[][] getALLItems() throws MatrixIsEmpty {
		if (count == 0) {
			throw new MatrixIsEmpty();
		}

		return matrix;
	}

	public double getItem(int i, int j) throws MatrixIsEmpty, OutOfMatrixBounds {
		if (count == 0) {
			throw new MatrixIsEmpty();
		}
		if (i > rowCount - 1 && j > columnCount - 1) {
			throw new OutOfMatrixBounds();
		}
		return matrix[i][j];
	}

	public void addItem(double item) throws MatrixIsFull {
		if (count == matrix.length * matrix[0].length) {
			throw new MatrixIsFull();
		}

		matrix[rowCount][columnCount++] = item;
		count++;

		if (columnCount == matrix[0].length) {
			columnCount = 0;
			rowCount++;
		}
	}

	public void setItem(double item, int i, int j) throws MatrixIsEmpty, OutOfMatrixBounds {
		if (count == 0) {
			throw new MatrixIsEmpty();
		}
		if (i > rowCount - 1 && j > columnCount - 1) {
			throw new OutOfMatrixBounds();
		}

		matrix[i][j] = item;
	}

	public int rlength() {
		return matrix.length;
	}

	public int clength() {
		return matrix[0].length;
	}

	public int rowCount() {
		if(count == 0) {
			return 0;
		}
		return rowCount + 1;
	}

	public int columnCount() {
		if (count == matrix.length * matrix[0].length) {
			return matrix.length;
		}else if(count == 0) {
			return 0;
		}
		return columnCount + 1;
	}

	public int count() {
		return count;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				sb.append(matrix[i][j]).append(" ");
			}
			sb.append("\n");
		}

		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {

		boolean isEqual = false;
		Matrix matrix = (Matrix) obj;

		if (this == obj) {
			isEqual = true;
		} else {
			if (obj == null || this.getClass() != obj.getClass()) {
				isEqual = false;
			} else

				for (int i = 0; i < this.matrix.length; i++) {
					for (int j = 0; j < this.matrix[i].length; j++) {
						try {
							if (this.matrix[i][j] != matrix.getItem(i, j)) {
								isEqual = false;
								i += this.matrix.length;
								break;
							}
						} catch (MatrixIsEmpty | OutOfMatrixBounds e) {
							LOG.debug(e.getMessage());
							e.printStackTrace();
						}
					}
				}
			isEqual = new EqualsBuilder().append(count, matrix.count).append(rowCount, matrix.rowCount)
					.append(columnCount, matrix.columnCount).isEquals();

		}
		return isEqual;
	}

	@Override
	public int hashCode() {
		int hashSum = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				hashSum += matrix[i][j] * (i + 1);
			}
		}

		return new HashCodeBuilder(9, 19).append(count).append(rowCount).append(columnCount).toHashCode() + hashSum;
	}
}
