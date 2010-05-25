package s2k.util.safederef;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import s2k.util.safederef.testmodels.Collar;
import s2k.util.safederef.testmodels.Dog;
import s2k.util.safederef.testmodels.Tag;

public class MaybeTest {

	@Test
	public void justShouldRepresentSomeObject(){
		Dog object = new Dog();
		Maybe<Dog> maybe = new Just(object);
		assertEquals(object, maybe.value());
	}
	
	@Test
	public void nothingShouldRepresentNullObject(){
		Nothing<Dog> none = new Nothing(Dog.class);
		assertTrue(none.value() instanceof Dog);
	}
	
	@Test
	public void nothingShouldRepresentNullObjectStubbedDeeply(){
		Nothing<Dog> none = new Nothing(Dog.class);
		assertTrue(none.value() instanceof Dog);
		assertTrue(none.value()._collar() instanceof Collar);
		assertTrue(none.value()._collar()._tag() instanceof Tag);
		assertNull(none.value()._collar()._tag().name());
	}
}
