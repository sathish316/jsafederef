package s2k.util.safederef.testmodels;


public class Dog_Safe extends Dog_Maybe{
	
	public Collar collar() {
		return super._collar().value();
	}
}
