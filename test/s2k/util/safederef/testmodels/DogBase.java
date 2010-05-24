package s2k.util.safederef.testmodels;

public class DogBase {

	private Collar collar;

	public DogBase() {
	}

	public Collar collar() {
		return collar;
	}

	public void setCollar(Collar collar) {
		this.collar = collar;
	}

}
