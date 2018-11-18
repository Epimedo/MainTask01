package by.epam.javatraining.halavin.tasks.maintask01.view.util;

import java.util.Arrays;

public class LogOutput {

	public static void outputMatrixMaxItem(Object obj) {
		Output.logOutput("Matrix's maximum is " + obj);
	}

	public static void outputMatrixMinItem(Object obj) {
		Output.logOutput("Matrix's minimum is " + obj);
	}

	public static void outputMatrixAverage(Object obj) {
		Output.logOutput("Matrix's average is " + obj);
	}

	public static void outputMatrixGeometric(Object obj) {
		Output.logOutput("Matrix's geometric is " + obj);
	}

	public static void outputIsMatrixSymmetric(Object obj) {
		Output.logOutput("Matrix is symmetric: " + obj);
	}

	public static void outputIsMatrixIncidentalSym(Object obj) {
		Output.logOutput("Matrix is incidental symmetric: " + obj);
	}

	public static void outputTransposeMatrix(Object obj) {
		Output.logOutput("Transpose matrix:\n" + obj);
	}

	public static void outputMatrixFirstLocalMax(Object obj) {
		Output.logOutput("Matrix's first local maximum indexes are " + Arrays.toString((int[]) obj));
	}

	public static void outputMatrixFirstLocalMin(Object obj) {
		Output.logOutput("Matrix's first local minimum indexes are " + Arrays.toString((int[]) obj));
	}
}
