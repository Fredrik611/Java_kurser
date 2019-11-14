/*
 * AbstractIntCollection.java
 * Date: 23 nov 2007
 * Author: Jonas Lundberg
 */
package fa222rw_assign1.IntCollection;

import java.util.Iterator;

/*
 * An abstract class that provides basic support for 
 * array based linear data structures.
 */

public abstract class AbstractIntCollection {
	protected int size = 0;
	protected int[] values = new int[8];
	
	
	/* Public interface */
	public int size() {return size;}
	
	// return false if there is a element in the array.
	public boolean isEmpty() {return size==0;}
	
	// returns the whole array in a string. 
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("[");
		for (int i=0;i<size;i++) {
			buf.append(" "+values[i]);
		}

		buf.append(" ]");
		return buf.toString();
	}
	
	// returns a IntIterator object 
	public Iterator<Integer> iterator() {
		return new IntIterator();
	}
	
	/* Protected help methods that can be used by extending classes */
	protected void  resize() {
		int[] tmp = new int[2*values.length];
		System.arraycopy(values,0,tmp,0,values.length); 
		values = tmp;
	}
	
	
	// checks the index if it's in the filled part of the array.
	protected boolean checkIndex(int index, int upper){
		if (index < 0 || index >= upper) {
			String msg = "Index = "+index+", Upper boundary = "+upper;
			System.err.println(msg);
			return false;
		}
		return true;
	}
	
	/* Private inner class used by iterator() */
	class IntIterator implements Iterator<Integer> {
		private int count = 0;
		public Integer next() {return values[count++];}
		
		public boolean hasNext() {return count<size;}
		
		public void remove() {
			throw new RuntimeException("remove() is not implemented");
		}
	}
}
