package s2k.util.safederef;

import static org.mockito.Mockito.mock;

public class Nothing<T> implements Maybe<T> {
	
	private Class<T> klass;

	public Nothing(Class<T> klass) {
		this.klass = klass;
	}

	@Override
	public T value() {
		return mock(klass); 
	}

}
