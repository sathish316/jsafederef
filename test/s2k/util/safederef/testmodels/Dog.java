package s2k.util.safederef.testmodels;

public class Dog {

	private String name;
	private Collar collar;

	public Dog() {
	}

	public Dog(String name) {
		this.name = name;
	}

	public Collar collar() {
		return collar;
	}

	public void setCollar(Collar collar) {
		this.collar = collar;
	}

}
