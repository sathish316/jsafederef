package s2k.util.safederef;

import static org.junit.Assert.assertNull;

import org.junit.Test;

import s2k.util.safederef.testmodels.Collar;
import s2k.util.safederef.testmodels.Dog;

public class SafeDereferencingTest {

	@Test(expected = IllegalStateException.class)
	public void shouldSafelyDereferenceMethodChaining(){
		Dog dog = new Dog();
		Collar collar = new Collar();
		dog.setCollar(collar);

		String name = dog.collar().tag().name();
		assertNull(name);
	}

	@Test(expected = IllegalStateException.class)
	public void shouldSafelyDereferenceMethodChainingForAnyLevel(){
		Dog dog = new Dog();

		String name = dog.collar().tag().name();
		assertNull(name);
	}
}
