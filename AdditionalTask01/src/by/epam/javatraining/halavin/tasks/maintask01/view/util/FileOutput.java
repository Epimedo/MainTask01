package by.epam.javatraining.halavin.tasks.maintask01.view.util;

import java.util.Arrays;

public class FileOutput {

	public static void outputMatrixMaxItem(Object obj, String filename) {
		Output.fileOutput("Matrix's maximum is " + obj, filename);
	}

	public static void outputMatrixMinItem(Object obj, String filename) {
		Output.fileOutput("Matrix's minimum is " + obj, filename);
	}

	public static void outputMatrixAverage(Object obj, String filename) {
		Output.fileOutput("Matrix's average is " + obj, filename);
	}

	public static void outputMatrixGeometric(Object obj, String filename) {
		Output.fileOutput("Matrix's geometric is " + obj, filename);
	}

	public static void outputIsMatrixSymmetric(Object obj, String filename) {
		Output.fileOutput("Matrix is symmetric: " + obj, filename);
	}

	public static void outputIsMatrixIncidentalSym(Object obj, String filename) {
		Output.fileOutput("Matrix is incidental symmetric: " + obj, filename);
	}

	public static void outputTransposeMatrix(Object obj, String filename) {
		Output.fileOutput("Transpose matrix:\n" + obj, filename);
	}

	public static void outputMatrixFirstLocalMax(Object obj, String filename) {
		Output.fileOutput("Matrix's first local maximum indexes are " + Arrays.toString((int[]) obj), filename);
	}

	public static void outputMatrixFirstLocalMin(Object obj, String filename) {
		Output.fileOutput("Matrix's first local minimum indexes are " + Arrays.toString((int[]) obj), filename);
	}
}
