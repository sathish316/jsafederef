package s2k.util.safederef.testmodels;


public class Tag_Safe extends Tag_Maybe{

	public String name() {
		return super._name().value();
	}
}
