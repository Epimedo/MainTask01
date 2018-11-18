package by.epam.javatraining.halavin.tasks.maintask01.view.util;

public class CreateLogOutput extends CreateOutput {

	@Override
	public Output create(InfoForOutputs info) {
		return new LogOutput(info);
	}

}
