package by.epam.javatraining.halavin.tasks.maintask01.view.vector;

import java.util.Random;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsFull;

public class VectorRandomInput extends VectorInput {
	private double upperBorder;

	public double getUpperBorder() {
		return upperBorder;
	}

	public void setUpperBorder(double upperBorder) {
		this.upperBorder = upperBorder;
	}

	public double getLowerBorder() {
		return lowerBorder;
	}

	public void setLowerBorder(double lowerBorder) {
		this.lowerBorder = lowerBorder;
	}

	private double lowerBorder;
	private Random random = new Random();

	public void fill(DoubleVector vector) {
		for (int i = 0; i < vector.length(); i++) {
			try {
				vector.addItem(random.nextDouble() * (upperBorder - lowerBorder) + lowerBorder);
			} catch (VectorIsFull e) {
				e.printStackTrace();
			}
		}

	}
}
