package by.epam.javatraining.halavin.tasks.maintask01.model.exceptions;

public class MainTaskTechException extends Exception {

	public MainTaskTechException() {
		super("Exception with maintask work");
	}

	public MainTaskTechException(String str) {
		super(str);
	}
}
