package by.epam.javatraining.halavin.tasks.maintask01.view.vector;

import by.epam.javatraining.halavin.tasks.maintask01.view.util.InfoForVectorCreation;

public class CreateRandomVecInput extends CreateVectorInput {

	@Override
	public VectorInput create() {
		VectorRandomInput vecin = new VectorRandomInput();
		vecin.setLowerBorder(InfoForVectorCreation.RANDOMLOWERBORDERE.getValue());
		vecin.setUpperBorder(InfoForVectorCreation.RANDOMUPPERBORDER.getValue());

		return vecin;
	}

}
