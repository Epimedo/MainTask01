package by.epam.javatraining.halavin.tasks.maintask01.view.vector;

public class CreateVectorFileInput extends CreateVectorInput {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public VectorInput create() {
		VectorFileInput in = new VectorFileInput();
		in.setStr(str);
		return in;
	}
	
	public VectorInput create(String str) {
		VectorFileInput in = new VectorFileInput();
		in.setStr(str);
		return in;
	}

}
