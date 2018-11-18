package by.epam.javatraining.halavin.tasks.maintask01.view.vector;

import org.apache.log4j.Logger;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsEmpty;

public class VectorLogOutput extends VectorOutput{
	private static final Logger LOG = Logger.getRootLogger();
	
	public void print(DoubleVector vector) throws VectorIsEmpty {
		LOG.info(vector.toString());
	}
}
