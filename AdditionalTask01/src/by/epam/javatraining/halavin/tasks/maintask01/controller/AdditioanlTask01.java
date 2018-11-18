/*Halavin Ehor
 * javatraining additioanl task 01
 * ver 1.0
 * This task is about matrix data manipulation.
 * 
 * development date: 31.10.2018
 * 
 */
package by.epam.javatraining.halavin.tasks.maintask01.controller;

import java.io.FileNotFoundException;
import java.util.Arrays;

import org.apache.log4j.Logger;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.Matrix;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.MatrixIsEmpty;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.MatrixIsFull;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfMatrixBounds;
import by.epam.javatraining.halavin.tasks.maintask01.model.logic.MatrixCreator;
import by.epam.javatraining.halavin.tasks.maintask01.model.logic.MethodsForMatrix;
import by.epam.javatraining.halavin.tasks.maintask01.model.logic.MethodsForSearch;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.ConsoleOutput;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.FileOutput;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.Input;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.LogOutput;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.Output;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.matrix.MatrixInput;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.matrix.MatrixOutput;

public class AdditioanlTask01 {
	public static int MATRIX_SIZE_I = 10;
	public static int MATRIX_SIZE_J = 15;
	public static Logger Log = Logger.getRootLogger();
	public static String filename = "C://Output.txt";

	public static void main(String[] args) throws FileNotFoundException {
		Matrix matr = MatrixCreator.createMatrix();
		double[][] ar = { { 1, 2, 1, 6, 2, 10, 234, 32, 4, .4324, 23 },
				{ 123, 243, 234, 1, 2, 3, 4, 543, .534, 10, 31 } };
		Matrix matrix1 = MatrixCreator.createMatrixOfArray(ar);

		try {
			MatrixInput.randomMatrixFiLLDouble(matr);

			double maxItem = MethodsForMatrix.findMaxELement(matr);

			LogOutput.outputMatrixMaxItem(maxItem);

			MethodsForMatrix.transposeMatrix(matr);

			FileOutput.outputTransposeMatrix(matr, filename);

			int[] localMax = MethodsForSearch.findLocaLMaxIndex(matr);

			LogOutput.outputMatrixFirstLocalMax(localMax);

		} catch (MatrixIsEmpty | OutOfMatrixBounds | MatrixIsFull e) {
			Log.debug(e.getMessage());
			e.printStackTrace();
		}

	}

}
