package by.epam.javatraining.halavin.tasks.maintask01.view.vector;

import java.io.FileNotFoundException;
import java.util.Arrays;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;

public class VectorFileInput extends VectorInput{
	private String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void fill(DoubleVector vector) {

		double[] numArr;
		numArr = Arrays.stream(str.toString().split(" ")).mapToDouble(Double::parseDouble).toArray();

		vector.setALLItems(numArr);
	}
}
