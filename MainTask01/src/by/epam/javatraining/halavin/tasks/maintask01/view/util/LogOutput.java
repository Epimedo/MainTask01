package by.epam.javatraining.halavin.tasks.maintask01.view.util;

import org.apache.log4j.Logger;

public class LogOutput extends Output {
	private final Logger Log = Logger.getRootLogger();

	public LogOutput(InfoForOutputs info) {
		super(info);
	}

	@Override
	public void print(Object obj) {
		Log.info(str + obj);
	}

}
