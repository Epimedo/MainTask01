package by.epam.javatraining.halavin.tasks.maintask01.view.util.matrix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.Matrix;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.MatrixIsEmpty;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.MatrixIsFull;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfMatrixBounds;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.Input;

public class MatrixInput {
	private static Scanner scanner = new Scanner(System.in);
	private static Random random = new Random();
	private static final int UPPER_RRANDOM_BORDER = 100;
	private static final int LOWER_RRANDOM_BORDER = -100;

	public static void consoleimputMatrix(Matrix matrix) throws MatrixIsFull {

		for (int i = 0; i < matrix.rlength(); i++) {
			for (int j = 0; j < matrix.clength(); j++) {
				matrix.addItem(scanner.nextDouble());
			}
		}

	}

	public static void randomMatrixFiLLDouble(Matrix matrix) throws MatrixIsEmpty, OutOfMatrixBounds, MatrixIsFull {

		for (int i = 0; i < matrix.rlength(); i++) {
			for (int j = 0; j < matrix.clength(); j++) {
				matrix.addItem(
						random.nextDouble() * (UPPER_RRANDOM_BORDER - LOWER_RRANDOM_BORDER) + LOWER_RRANDOM_BORDER);

			}
		}
	}

	public static void fileInputMatrix(Matrix matrix, String filename) throws FileNotFoundException {
		String str[] = Input.fileInput("c://matrix4.txt").split("\n");
		int row = str.length;
		int column = str[0].split(" ").length;
		double[][] array = new double[row][column];

		for (int i = 0; i < row; i++) {
			array[i] = Arrays.stream(str[i].split(" ")).mapToDouble(Double::parseDouble).toArray();
		}

		matrix.setALLItems(array);

	}
}
