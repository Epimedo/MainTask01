package by.epam.javatraining.halavin.tasks.maintask01.view.util;

public class ConsoleOutput extends Output {

	public ConsoleOutput(InfoForOutputs info) {
		super(info);
	}

	public void print(Object obj) {
		System.out.println(str + obj);
	}
}
