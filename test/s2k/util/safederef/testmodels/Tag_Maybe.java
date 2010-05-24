package s2k.util.safederef.testmodels;

import s2k.util.safederef.Just;
import s2k.util.safederef.Maybe;
import s2k.util.safederef.Nothing;

public class Tag_Maybe extends TagBase{

	public Maybe<String> _name() {
		String object = super.name();
		if(object == null)
			return new Nothing(String.class);
		return new Just(object);
	}

}
