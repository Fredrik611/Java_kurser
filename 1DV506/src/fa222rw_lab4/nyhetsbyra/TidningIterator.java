package fa222rw_lab4.nyhetsbyra;

import java.util.ArrayList;
import java.util.Iterator;

public class TidningIterator implements Iterator<Tidning> {
	private int firstval = 0;		// first value in array
	private final ArrayList<Tidning> elements; // the array
	private final int finalval;		// Last value of the array 
	
	public TidningIterator(ArrayList<Tidning> tidningar) {
		elements = tidningar;
		finalval = tidningar.size();
	}
	public boolean hasNext() {
		return firstval < finalval; // returns true if it is not the last value in the array.
	}

	public Tidning next() {
		return elements.get(firstval++); // sends back an element in the array
	}
}
