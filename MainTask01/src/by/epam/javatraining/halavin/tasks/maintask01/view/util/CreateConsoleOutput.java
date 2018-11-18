package by.epam.javatraining.halavin.tasks.maintask01.view.util;

public class CreateConsoleOutput extends CreateOutput {

	@Override
	public Output create(InfoForOutputs info) {
		return new ConsoleOutput(info);
	}

}
