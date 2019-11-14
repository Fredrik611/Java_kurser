package fa222rw_assign4.GenericQueue;

import java.util.Iterator;

public class LinkedQueue<T> implements Queue<T>{
	private int size = 0;
	private Node head = null;
	private Node tail = null;	
	
	public LinkedQueue(){
	} 
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void enqueue(T element) {
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

	@Override
	public T dequeue() throws IndexOutOfBoundsException{
		if (isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		Node temp = head;
		head = head.next;
		size--;
		return temp.val;
	}

	@Override
	public T first() throws IndexOutOfBoundsException{
		if (size <= 0) {
			throw new IndexOutOfBoundsException();
		}
		
		return head.val;
	}

	@Override
	public T last() throws IndexOutOfBoundsException{
		if (size <= 0) {
			throw new IndexOutOfBoundsException();
		}
		
		return tail.val;
	}
	
	public String toString() {
		String str = "";
		Node node = head;
		while (node != null) {
			str += node.val.toString() + " ";
			node = node.next;
		}
		return str;
	}

	@Override
	public Iterator iterator() {
		
		return new NodeIterator();
	}
	private class NodeIterator implements Iterator<T> {
		private Node node = head;
		@Override
		public boolean hasNext() {
			return node != null;
		}

		@Override
		public T next() {
			T obj = node.val;
			node = node.next;
			return obj;
		}
		public void remove() {
			throw new RuntimeException("remove() is not implemented");
		}
	}
	private class Node{
		T val;
		Node next = null;
		Node(T val){ this.val = val;}
	}
}
