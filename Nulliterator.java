import java.util.*;



public class Nulliterator<T> implements Iterator<T>{

	public boolean hasNext() {
		return false;
	}



	public T next() {

		return null;
	}

	

	public void remove(){

	}

}