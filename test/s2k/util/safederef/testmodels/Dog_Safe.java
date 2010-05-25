package s2k.util.safederef.testmodels;


public class Dog_Safe extends Dog_Maybe{
	
	public Collar _collar() {
		return super.maybe_collar().value();
	}
}
