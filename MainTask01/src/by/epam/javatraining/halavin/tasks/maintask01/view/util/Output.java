package by.epam.javatraining.halavin.tasks.maintask01.view.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.log4j.Logger;

public abstract class Output {
	protected String str;

	public Output(InfoForOutputs info) {
		str = info.getStr();
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	abstract public void print(Object obj);
}