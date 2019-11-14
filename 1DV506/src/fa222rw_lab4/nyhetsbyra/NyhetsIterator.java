package fa222rw_lab4.nyhetsbyra;

import java.util.ArrayList;
import java.util.Iterator;

public class NyhetsIterator implements Iterator<Nyhet> {
	private int firstval; // first value in array
	private final ArrayList<Nyhet> elements; // the array
	private final int finalval; // how much is filled in array

	public NyhetsIterator(ArrayList<Nyhet> nyheter) {
		elements = nyheter;
		finalval = nyheter.size();
		firstval = 0;
	}

	public boolean hasNext() {
		return firstval < finalval; // returns true if it is not the last value in the array.
	}

	public Nyhet next() {
		return elements.get(firstval++); // sends back an element in the array
	}
}
