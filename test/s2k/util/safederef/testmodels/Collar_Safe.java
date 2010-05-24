package s2k.util.safederef.testmodels;


public class Collar_Safe extends Collar_Maybe{
	
	public Tag tag() {
		return super._tag().value();
	}
	
	
}
