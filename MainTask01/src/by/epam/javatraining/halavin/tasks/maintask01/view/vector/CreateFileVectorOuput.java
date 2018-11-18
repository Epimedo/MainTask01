package by.epam.javatraining.halavin.tasks.maintask01.view.vector;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.InfoForFile;

public class CreateFileVectorOuput extends CreateVectorOutput {

	@Override
	public VectorOutput create() {
		VectorFileOutput vout = new VectorFileOutput();
		vout.setFileName(InfoForFile.FILEVECTOROUTNAME.getStr());

		return vout;
	}

}
