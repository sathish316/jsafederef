package s2k.util.safederef;

import static org.junit.Assert.assertNull;

import org.junit.Test;

import s2k.util.safederef.testmodels.Collar;
import s2k.util.safederef.testmodels.Dog;

public class NullSafeDereferencingTest {

	@Test(expected = NullPointerException.class)
	public void shouldThrowNullPointerExceptionWhenNullIsEncounteredInMethodChaining(){
		Dog dog = new Dog();
		Collar collar = new Collar();
		dog.setCollar(collar);

		String name = dog.collar().tag().name();
	}

	@Test(expected = NullPointerException.class)
	public void shouldThrowNullPointerExceptionWhenNullIsEncounteredInMethodChainingAtAnyLevel(){
		Dog dog = new Dog();

		String name = dog.collar().tag().name();
	}

	@Test
	public void shouldSafelyDereferenceWhenNullIsEncounteredInMethodChaining(){
		Dog dog = new Dog();
		Collar collar = new Collar();
		dog.setCollar(collar);

		String name = dog._collar()._tag().name();
		assertNull(name);
	}

	@Test
	public void shouldSafelyDereferenceWhenNullIsEncounteredInMethodChainingAtAnyLevel(){
		Dog dog = new Dog();

		String name = dog._collar()._tag().name();
		assertNull(name);
	}
}
