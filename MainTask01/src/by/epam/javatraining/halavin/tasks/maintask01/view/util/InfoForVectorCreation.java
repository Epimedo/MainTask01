package by.epam.javatraining.halavin.tasks.maintask01.view.util;

public enum InfoForVectorCreation {
	RANDOMLOWERBORDERE(10), RANDOMUPPERBORDER(-10);

	private double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	private InfoForVectorCreation(double value) {
		this.value = value;
	}
}
