package fa222rw_assign4.GenericQueue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class LinkedQueueTest {
	@Test
	void Size() {
		LinkedQueue<Integer> h = new LinkedQueue<Integer>();
		assertEquals(0, h.size());
		for (int i = 0; i < 5; i++) {
			h.enqueue(i);
		}
		assertEquals(5, h.size());
		for (int i = 0; i < 5; i++) {
			h.dequeue();
		}
		assertEquals(0, h.size());
	}
	@Test
	void isEmpty() {
		LinkedQueue<Integer> h = new LinkedQueue<Integer>();
		assertEquals(true, h.isEmpty());
		h.enqueue(2);
		assertEquals(false, h.isEmpty());
		h.dequeue();
		assertEquals(true, h.isEmpty());
	}
	@Test
	void ExceptionTest() {
		LinkedQueue<Integer> h = new LinkedQueue<Integer>();
		assertThrows(IndexOutOfBoundsException.class,() -> {h.dequeue();});
		assertThrows(IndexOutOfBoundsException.class,() -> {h.first();});
		assertThrows(IndexOutOfBoundsException.class,() -> {h.last();});
		
	}

	@Test
	void IntEnqueue() {
		LinkedQueue<Integer> h = new LinkedQueue<Integer>();
		h.enqueue(2);
		h.enqueue(2);
		h.enqueue(2);
		assertEquals("2 2 2 ", h.toString());
		
	}
	@Test
	void IntDequeue(){
		LinkedQueue<Integer> h = new LinkedQueue<Integer>();
		for (int i = 0; i < 20; i++) {
			h.enqueue(i);
		}
		assertEquals(20, h.size());
		// don't know if casting it to (Integer) is the correct way but is the only way i get it to work.
		assertEquals((Integer)0, h.dequeue());
		assertEquals((Integer)1, h.dequeue());
		assertEquals((Integer)2, h.dequeue());
	}
	@Test
	void IntFirst() {
		LinkedQueue<Integer> h = new LinkedQueue<Integer>();
		for (int i = 0; i < 10; i++) {
			h.enqueue(i);
		}
		assertEquals((Integer)0, h.first());
	}
	@Test
	void IntLast() {
		LinkedQueue<Integer> h = new LinkedQueue<Integer>();
		for (int i = 0; i < 10; i++) {
			h.enqueue(i);
		}
		assertEquals((Integer)9, h.last());
	}
	
	@Test
	void StringEnqueue() {
		LinkedQueue<String> s = new LinkedQueue<String>();
		s.enqueue("Hello World!");
		s.enqueue("Hello World!");
		s.enqueue("Hello World!");
		assertEquals("Hello World! Hello World! Hello World! ",s.toString());
	}
	@Test
	void StringDequeue(){
		LinkedQueue<String> s = new LinkedQueue<String>();
		s.enqueue("Hello ");
		s.enqueue("World");
		s.enqueue("!");
		assertEquals("Hello ", s.dequeue());
	}
	@Test
	void StringFirst() {
		LinkedQueue<String> s = new LinkedQueue<String>();
		s.enqueue("Hello ");
		s.enqueue("World");
		s.enqueue("!");
		assertEquals("Hello ", s.first());
	}
	@Test
	void StringLast() {
		LinkedQueue<String> s = new LinkedQueue<String>();
		s.enqueue("Hello ");
		s.enqueue("World");
		s.enqueue("!");
		assertEquals("!", s.last());
	}

}
