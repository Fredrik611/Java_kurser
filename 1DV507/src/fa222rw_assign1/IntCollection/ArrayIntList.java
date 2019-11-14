package fa222rw_assign1.IntCollection;

import java.util.Iterator;

public class ArrayIntList  extends AbstractIntCollection implements IntList{

	public ArrayIntList() {
		
	}
	
	@Override
	// refers to the method in the super class
	public Iterator<Integer> iterator() {
		return  super.iterator();
	}

	@Override
	public void add(int n) {
		if (size >= values.length) { // checks if the length of the array needs to be extended. 
			resize();
		}
		values[size++] = n; // adds the value to the array.
	}

	@Override
	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		// adds a integer att an index that is in the filled part of the array
		if (index < size )  
			values[index] = n; 
		else {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
			int tmp = 0;							// removes a integer at a index in the filled part of the array
			for (int i = index; i < size; i++) {
			tmp = values[i+1];
				values[i] = tmp;
			}
	}
	
	// returns the integer att the index. If it's filled
	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		if (index <= size) 
			return values[index];
		else
			throw new IndexOutOfBoundsException();
		}
	
	// returns the size
	@Override
	public int size() {return size;}
	
	// returns true if it's fille with something
	@Override
	public boolean isEmpty() {return size == 0;}

	// index of an integer
	@Override
	public int indexOf(int n) {
		for (int i = 0; i < size; i++) {
			if (values[i] == n) {
				return i;
			}
		}
		return -1;
	}

}
