package s2k.util.safederef;

import static org.junit.Assert.*;

import org.junit.Test;

import s2k.util.safederef.testmodels.Dog;

public class MaybeTest {

	@Test
	public void justShouldRepresentSomeObject(){
		Dog object = new Dog();
		Maybe<Dog> maybe = new Just(object);
		assertEquals(object, maybe.value());
	}
	
	@Test(expected = IllegalStateException.class)
	public void nothingShouldRepresentNoValue(){
		Nothing none = new Nothing();
		none.value();
	}
}
