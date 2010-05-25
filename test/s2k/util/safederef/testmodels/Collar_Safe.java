package s2k.util.safederef.testmodels;


public class Collar_Safe extends Collar_Maybe{
	
	public Tag _tag() {
		return super.maybe_tag().value();
	}
	
	
}
