package by.epam.javatraining.halavin.tasks.maintask01.view.util;

public class CreateFileOutput extends CreateOutput {

	@Override
	public Output create(InfoForOutputs info) {
		FileOutput fileout = new FileOutput(info);
		fileout.setFilename(InfoForFile.FILEOUTNAME.getStr());

		return fileout;
	}

}
