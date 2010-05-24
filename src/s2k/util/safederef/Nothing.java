package s2k.util.safederef;

public class Nothing<T> implements Maybe<T> {

	@Override
	public T value() {
		throw new IllegalStateException(); 
	}

}
