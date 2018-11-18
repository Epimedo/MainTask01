package by.epam.javatraining.halavin.tasks.maintask01.view.util;

public enum InfoForOutputs {
	MAXITEM("The vector's maximum item is "), MINITEM("The vector's minimum item is "),
	AVERAGE("The vector's average is "), GEOMETRIC("The vector's geometric is "),
	ECNCREASING("The vector's items are increasing,it is"),
	LOCALMAXINDEX("The vector's first local maximum's  index is "),
	LOCALMININDEX("The vector's first local minimum's index is "), REVERSE("The reverse vector is "),
	SEARCH("The item index is ");

	private String str;

	private InfoForOutputs(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

}
