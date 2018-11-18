package by.epam.javatraining.halavin.tasks.maintask01.view.util;

public enum InfoForFile {
	FILEOUTNAME("D://result.txt"), FILEVECTOROUTNAME("D://vector output.txt"), FILEINNAME("D://input data.txt");

	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	private InfoForFile(String str) {
		this.str = str;
	}

}
