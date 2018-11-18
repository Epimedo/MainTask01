/*Halavin Ehor 
 * javatraining maintask 1
 * ver 1.0
 * The solutions for the main task. There are 5 sorting algorithms in the SortingVectorMethods class.
 * MethodsForVector class is consists of methods for manipulation of vector elements.
 * development date: 31.10.2018
 * 
 * 
 * MainTask01 class is the controller class, which was created to demonstrate the work of methods and sorting.
 * There are 3 parts. First, is declaration of vectors and filling them with data.
 * Second, is use of logic.
 * Third, is output of the results.
 */
package by.epam.javatraining.halavin.tasks.maintask01.controller;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;

import org.apache.log4j.Logger;

import by.epam.javatraining.halavin.tasks.maintask01.model.entities.DoubleVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.OutOfBoundsVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsEmpty;
import by.epam.javatraining.halavin.tasks.maintask01.model.exceptions.VectorIsFull;
import by.epam.javatraining.halavin.tasks.maintask01.model.logic.MethodsForVector;
import by.epam.javatraining.halavin.tasks.maintask01.model.logic.SearchVectorMethods;
import by.epam.javatraining.halavin.tasks.maintask01.model.logic.SortingVectorMethods;
import by.epam.javatraining.halavin.tasks.maintask01.model.logic.VectorCreator;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.ConsoleOutput;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.CreateConsoleOutput;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.CreateFileOutput;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.CreateLogOutput;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.CreateOutput;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.FileInput;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.FileInputCreator;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.InfoForOutputs;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.Input;
import by.epam.javatraining.halavin.tasks.maintask01.view.util.Output;
import by.epam.javatraining.halavin.tasks.maintask01.view.vector.CreateFileVectorOuput;
import by.epam.javatraining.halavin.tasks.maintask01.view.vector.CreateLogVectorOuput;
import by.epam.javatraining.halavin.tasks.maintask01.view.vector.CreateVectorFileInput;
import by.epam.javatraining.halavin.tasks.maintask01.view.vector.VectorFileInput;
import by.epam.javatraining.halavin.tasks.maintask01.view.vector.VectorInput;
import by.epam.javatraining.halavin.tasks.maintask01.view.vector.VectorOutput;
import by.epam.javatraining.halavin.tasks.maintask01.view.vector.VectorValidator;

public class MainTask01 {
	public static Logger LOG = Logger.getRootLogger();
	public static int LOWER_RANDOM_BORDER = -10;
	public static int UPPER_RANDOM_BORDER = 10;

	public static void main(String[] args) throws FileNotFoundException {

		DoubleVector copyvector = VectorCreator.createDoubleVector();

		try {
			Input in = new FileInputCreator().create();
			String strInput =  in.read();
			strInput = VectorValidator.operate(strInput);
			VectorInput vecInput = new CreateVectorFileInput().create(strInput);
			vecInput.fill(copyvector);
			
			VectorOutput output = new CreateLogVectorOuput().create();
			output.print(copyvector	);
			double maxitem = MethodsForVector.findMaxElement(copyvector);
			Output conout = new CreateFileOutput().create(InfoForOutputs.MAXITEM);
			conout.print(maxitem);

		} catch (VectorIsEmpty e) {
			LOG.debug(e.getMessage());
			e.printStackTrace();
		}  catch (OutOfBoundsVector e) {
			LOG.debug(e.getMessage());
			e.printStackTrace();
		}

	}
}
