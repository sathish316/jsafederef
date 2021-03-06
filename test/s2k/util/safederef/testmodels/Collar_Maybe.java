package s2k.util.safederef.testmodels;

import s2k.util.safederef.Just;
import s2k.util.safederef.Maybe;
import s2k.util.safederef.Nothing;

public class Collar_Maybe extends CollarBase{

	public Maybe<Tag> maybe_tag() {
		Tag object = super.tag();
		if(object == null)
			return new Nothing(Tag.class);
		return new Just(object);
	}
}
