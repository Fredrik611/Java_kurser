package fa222rw_assign2.ArrayQueue;

import java.util.Iterator;

public interface Queue { 
	/**
	 * Returns the number of elements in this queue.
	 * 
	 * @return  the number of elements in this queue.
	 */
	   public int size();  					  // current queue size 
	   /**
	    * Returns true if the queue is empty.
	    * 
	    * @return true if the queue is empty.
	    */
	   public boolean isEmpty(); 			  // true if queue is empty
	   /**
	    * Adds a Object element at the end of the queue.
	    * 
	    * @param element - The element that shall be added to the queue.
	    */
	   public void enqueue(Object element);   // add element at end of queue 
	   /**
	    * Pops the first element in the queue.
	    * 
	    * @return the first element in the queue
	    */
	   public Object dequeue();               // return and remove first element. 
	   /**
	    * Returns the first Object in the queue. (without removing it)
	    * @return the value of the first element in the queue.
	    */
	   public Object first();                 // return (without removing) first element 
	   /**
	    * Returns the latest element to be added to queue.
	    * 
	    * @return the latest element in the queue.
	    */
	   public Object last();                  // return (without removing) last element 
	   /**
	    * returns a string that represent the content of the queue. The string is separated with a comma (,).
	    * @return a string 
	    */
	   public String toString();              // return a string representation of the queue content
	   /**
	    * Returns an iterator over the elements contained in this queue.
	    * @return an iterator over the elements contained in this queue. 
	    */
	   public Iterator<Object> iterator();    // element iterator
}