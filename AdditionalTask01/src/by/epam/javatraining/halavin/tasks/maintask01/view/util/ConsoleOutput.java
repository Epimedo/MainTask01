package by.epam.javatraining.halavin.tasks.maintask01.view.util;

import java.util.Arrays;

public class ConsoleOutput {

	public static void outputMatrixMaxItem(Object obj) {
		Output.consoleOutput("Matrix's maximum is " + obj);
	}

	public static void outputMatrixMinItem(Object obj) {
		Output.consoleOutput("Matrix's minimum is " + obj);
	}

	public static void outputMatrixAverage(Object obj) {
		Output.consoleOutput("Matrix's average is " + obj);
	}

	public static void outputMatrixGeometric(Object obj) {
		Output.consoleOutput("Matrix's geometric is " + obj);
	}

	public static void outputIsMatrixSymmetric(Object obj) {
		Output.consoleOutput("Matrix is symmetric: " + obj);
	}

	public static void outputIsMatrixIncidentalSym(Object obj) {
		Output.consoleOutput("Matrix is incidental symmetric: " + obj);
	}

	public static void outputTransposeMatrix(Object obj) {
		Output.consoleOutput("Transpose matrix:\n" + obj);
	}

	public static void outputMatrixFirstLocalMax(Object obj) {
		Output.consoleOutput("Matrix's first local maximum indexes are " + Arrays.toString((int[]) obj));
	}

	public static void outputMatrixFirstLocalMin(Object obj) {
		Output.consoleOutput("Matrix's first local minimum indexes are " + Arrays.toString((int[]) obj));
	}
}
