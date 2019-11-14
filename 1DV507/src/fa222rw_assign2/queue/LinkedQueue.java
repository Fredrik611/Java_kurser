/**
 * 
 */
package fa222rw_assign2.queue;

import java.util.Iterator;

/**
* An interface representing a simple queue list. 
* 
* @author Fredrik Andersson
* @since 2019−02−06
*/

public class LinkedQueue implements Queue {
	private int size = 0;
	private Node head = null;
	private Node tail = null;
	/**
	 * Returns the number of elements in this queue.
	 * 
	 * @return  the number of elements in this queue.
	 */
	@Override
	public int size() { return size;}

	/**
	 * Checks if queue is empty.
	 * @return Returns true if this list contains no elements.
	 */
	@Override
	public boolean isEmpty() {
		if (size == 0) 
			return true;
		return false;
	}

	/**
	 * Appends an <code>element</code> at the end of the list.
	 * 
	 * @param Object element to be added.
	 */
	@Override
	public void enqueue(Object element) {
		 if (head == null) {
			head = new Node(element);
			tail = head;
		}
		 else {
			 tail.next = new Node(element);
			 tail = tail.next;
		 }
		size++;
	}

	/**
	 * Returns the first <code>element</code> in the queue and then  
	 *	
	 *	@return Object element is to be returned.
	 */
	@Override
	public Object dequeue() throws IndexOutOfBoundsException {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		else {
		Node temp = head;
		head = head.next;
		size--;
		return temp.value;
		}
	}

	/**
	 * Returns the first element i queue.
	 * 
	 * @return Object element is to be returned.
	 */
	@Override
	public Object first() throws IndexOutOfBoundsException{
		if (size > 0) 
			return head.value;
		else 
			throw new IndexOutOfBoundsException();
	}
	/**
	 * Returns the last element i queue.
	 * 
	 * @return Object element is to be returned.
	 */
	@Override
	public Object last() {
		if (size > 0) 
			return tail.value;
		else 
			throw new IndexOutOfBoundsException();
	}
	/**
	 * Returns a string of the content in queue.
	 * 
	 * @return a String with queue content. 
	 */
	 public String toString() {
		 StringBuilder str = new StringBuilder();
		 Node node = head;
		 while (node != null) {
			str.append(node.value +", ");
			node =node.next;
		}
		 str.deleteCharAt(str.length()-2);
		 return str.toString();
	 }

	/**
	 * Iterates over all <code>Objects</code> in queue.
	 */
	@Override
	public Iterator<Object> iterator(){
		
		return new NodeIterator();
	}
	private class NodeIterator implements Iterator<Object>{

		private Node node = head;
		@Override
		public boolean hasNext() {
			return node != null;
		}

		@Override
		public Object next() {
			Object obj = node.value;
			node = node.next;
			return obj;
		}
		public void remove() {
			throw new RuntimeException("remove() is not implemented");
		}
		
	}
	private class Node { // Private inner Node class
		Object value;
		Node next = null;
		Node(Object v) { value = v;}
	}
	
}


