
package by.epam.javatraining.halavin.tasks.maintask01.view.vector;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import org.apache.log4j.Logger;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfBoundsVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsEmpty;

public abstract class VectorOutput {

	abstract public void print(DoubleVector vector) throws VectorIsEmpty, OutOfBoundsVector;

}
