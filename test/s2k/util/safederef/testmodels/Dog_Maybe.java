package s2k.util.safederef.testmodels;

import s2k.util.safederef.Just;
import s2k.util.safederef.Maybe;
import s2k.util.safederef.Nothing;

public class Dog_Maybe extends DogBase{

	public Maybe<Collar> maybe_collar() {
		Collar object = super.collar();
		if(object == null)
			return new Nothing(Collar.class);
		return new Just(object);
	}
}
