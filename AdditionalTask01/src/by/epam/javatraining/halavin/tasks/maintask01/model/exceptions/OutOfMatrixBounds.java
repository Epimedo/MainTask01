package by.epam.javatraining.halavin.tasks.maintask01.model.exceptions;

public class OutOfMatrixBounds extends Exception {
	@Override
	public String getMessage() {
		return "Out of matrix bounds";
	}
}
