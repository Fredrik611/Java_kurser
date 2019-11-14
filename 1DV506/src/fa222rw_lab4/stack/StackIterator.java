/**
 * 
 */
package fa222rw_lab4.stack;

import java.util.Iterator;

/**
 * @author Fredrik
 *
 */
public class StackIterator implements Iterator<Object>{
	private int firstval = 0;		// first value in array
	private final Object[] element; // the array
	private final int finalval;		// how much is filled in array
	
	public StackIterator(Object[] vals, int size) {
		element = vals;
		finalval = size;
	}
	public boolean hasNext() {
		return firstval <= finalval; // returns true if it is not the last value in the array.
	}

	public Object next() {
		return element[firstval++]; // sends back an element in the array
	}

}
