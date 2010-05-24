package s2k.util.safederef;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import s2k.util.safederef.testmodels.Dog;

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
		assertNull(none.value().collar());
	}
}
