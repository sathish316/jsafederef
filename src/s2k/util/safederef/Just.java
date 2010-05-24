package s2k.util.safederef;


public class Just<T> implements Maybe<T>{
	
	private T value;	
	
	public Just(T value) {
		this.value = value;
	}

	@Override
	public T value() {
		return value;
	}

}
