package by.epam.javatraining.halavin.tasks.maintask01.view.vector;

public class VectorValidator {

	public static String operate(String str) {
		StringBuilder sb = new StringBuilder(str.length());
		int length = str.length();
		for (int i = 0; i < length; i++) {
			char ch = str.charAt(i);
			if (ch == 32 || ch == 46 || (ch > 47 && ch < 58)) {
				sb.append(ch);
			}
		}

		return sb.toString();

	}
}
