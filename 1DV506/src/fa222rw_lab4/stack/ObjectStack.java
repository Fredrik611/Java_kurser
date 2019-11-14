/**
 * 
 */
package fa222rw_lab4.stack;

import java.util.Iterator;

/**
 * @author Fredrik
 *
 */
public class ObjectStack implements Stack{
	private Object[] arr;  	// array 
	private int filled;		// how much of the array is filled
	private int limit = 4;	// how big the array is
	
	public ObjectStack(){
		filled = -1;		// starts at -1 because it is not filled with any thing 
		arr = new Object[limit]; // makes an array that is "limit" big.
	}

	public int size() {		// returns the value of how long the array. If it is empty you will get a 0 
		return filled+1;
	}

	public boolean isEmpty() { // returns true if the array contains no elements 
		if (filled == -1) {
			return true;
		}
		return false;
	}

	public void push(Object element) { // adds a value to the array
		filled++;
		if (filled >= limit) { // if the filled value is greater or equals to the limit of the array than the resize method will be executed
			resize();
		}
		arr[filled] = element;
	}

	private void resize() { // Makes an new array that is twice as big as the last
		limit *= 2;
		Object[] tmp = new Object[limit];
		for (int i = 0; i < filled; i++) {
			tmp[i] = arr[i];
		}
		arr = tmp; 
	}
	
	public Object pop() { // takes the top element and return it and delete the element
		try {
			Object ob = arr[filled];
			arr[filled--] = null;
			return ob;
		}catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Object peek() { // just returns the top value of the stack
		try {
			return arr[filled-1];	
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Iterator<Object> iterator() { // Calls for a class that is called StackIterator. And returns it as a Iterator Object
		return new StackIterator(arr,filled);
	}
	
}
