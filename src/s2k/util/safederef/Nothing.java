package s2k.util.safederef;

import static org.mockito.Mockito.mock;

import org.mockito.Mockito;

public class Nothing<T> implements Maybe<T> {
	
	private Class<T> klass;

	public Nothing(Class<T> klass) {
		this.klass = klass;
	}

	@Override
	public T value() {
		return mock(klass, Mockito.RETURNS_DEEP_STUBS); 
	}

}
