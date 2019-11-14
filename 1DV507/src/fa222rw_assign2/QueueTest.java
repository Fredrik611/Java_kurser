package fa222rw_assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fa222rw_assign2.ArrayQueue.ArrayQueue;

class QueueTest {
	private static int test_cnt = 0;
	
	// Type needs to be change when testing ArrayQueue or LinkedQueue.
	private ArrayQueue queue = new ArrayQueue();
	
	//  Just to keep track where we are in the test. 
	@BeforeEach
	public void setUp() {
		test_cnt++;
		System.out.println("Test "+ test_cnt);
	}
	// empties the array after each test
	@AfterEach
	public void tearDown() throws Exception {
		int size = queue.size();
		for (int i = 0; i < size; i++) {
			queue.dequeue();
		}
	}
	// a test that checks that the queue size is corrects 
	@Test
	public void testQueueSize() {
		build(0);
		assertEquals(0, queue.size());
	}
	
	// a test that checks that enqueue works 
	@Test
	public void testEnqueueQueue() {
		build(20);
		assertEquals(20, queue.size());
	}
	// a test that checks that dequeue works 
	@Test
	public void testDequeueQueue() {
		build(10);
		for (int i = 0; i < 10 ; i++) {
			assertEquals(i, queue.dequeue());
		}
		assertEquals(0,queue.size());
	}
	// a test that checks that the is empty function works
	@Test 
	public void testIsEmpty() {
		assertEquals(true, queue.isEmpty());
		queue.enqueue(2);
		assertEquals(false,queue.isEmpty());
	}
	// a test that checks the first and last functions of the class
	@Test
	public void testfirstAndLast() {
		build(5);
		assertEquals(0, queue.first());
		assertEquals(4,queue.last());
	}
	// a test where the class should throw a exception
	@Test
	public void testThrows() {
		assertThrows(IndexOutOfBoundsException.class, () -> queue.first());
		assertThrows(IndexOutOfBoundsException.class, () -> queue.last());
		assertThrows(IndexOutOfBoundsException.class, () -> queue.dequeue());
	}
	

	// Return type needs to be change when testing ArrayQueue or LinkedQueue
	private void build(int size) {
		for (int i = 0; i < size; i++) {
			queue.enqueue(i);
		}
	}
}
