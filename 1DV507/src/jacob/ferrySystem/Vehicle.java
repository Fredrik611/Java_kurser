/**
 * 
 */
package fa222rw_assign1.ferrySystem;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * @author Fredrik
 *
 */
public abstract class Vehicle{
	protected double size;
	protected int price;
	protected ArrayList<Passenger> passengers;
	protected boolean embarked;
	
	
	
	public Vehicle() {
		
	}
	// gets size
	public double getSize() {return size;}
	
	// gets price 
	public int getPrice() {return price;}
	
	// embark vehicle
	public void embark() {
		embarked = true;
	}
	// disembark vehicle
	public void disembark() {
		embarked = false;
	}
	// iterats passengers in the buss
	public Iterator<Passenger> iterator() {
		
		return new passangersIterator();
	}
	
	// passenger Iterator
	class passangersIterator implements Iterator<Passenger> {
		private int count = 0;
		public Passenger next() {return passengers.get(count++);}
		
		public boolean hasNext() {return count<passengers.size();}
		
		public void remove() {
			throw new RuntimeException("remove() is not implemented");
		}
	}
	
	
}
