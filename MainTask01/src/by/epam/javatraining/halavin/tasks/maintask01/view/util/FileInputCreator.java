package by.epam.javatraining.halavin.tasks.maintask01.view.util;

public class FileInputCreator extends InputCreator {

	@Override
	public Input create() {
		FileInput flInput = new FileInput();
		flInput.setFileName(InfoForFile.FILEINNAME.getStr());

		return flInput;
	}

}
