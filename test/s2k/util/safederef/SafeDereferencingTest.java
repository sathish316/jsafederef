package s2k.util.safederef;

import static org.junit.Assert.assertNull;

import org.junit.Test;

import s2k.util.safederef.testmodels.Collar;
import s2k.util.safederef.testmodels.Dog;

public class SafeDereferencingTest {

	@Test
	public void shouldSafelyDereferenceMethodChaining(){
		Dog dog = new Dog("Jimmy");
		Collar collar = new Collar();
		dog.setCollar(collar);

		String name = dog.collar().tag().name();
		assertNull(name);
	}

	@Test
	public void shouldSafelyDereferenceMethodChainingForAnyLevel(){
		Dog dog = new Dog("Jimmy");

		String name = dog.collar().tag().name();
		assertNull(name);
	}
}
