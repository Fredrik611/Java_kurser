package fa222rw_assign4.BinaryHeap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryHeapTest {


	@Test
	void InsertTest() {
		BinaryIntHeap heap = new BinaryIntHeap();
		for (int i = 1; i < 9; i++) {
			heap.insert(i);
		}
		assertEquals("8 7 6 4 3 2 5 1 ", heap.toString());
	}
	@Test
	void IsEmpty() {
		BinaryIntHeap b = new BinaryIntHeap();
		assertEquals(true,b.isEmpty());
		b.insert(1);
		assertEquals(false,b.isEmpty());
		b.pullHighest();
		assertEquals(true,b.isEmpty());
	}
	@Test
	void pullHighest() {
		BinaryIntHeap heap = new BinaryIntHeap();
		for (int i = 1; i < 9; i++) {
			heap.insert(i);
		}
		assertEquals("8 7 6 4 3 2 5 1 ", heap.toString());
		
		heap.pullHighest();
		assertEquals("7 4 6 1 3 2 5 ", heap.toString());
	}
	@Test
	void size() {
		BinaryIntHeap heap = new BinaryIntHeap();
		assertEquals(0,heap.size());
		heap.insert(2);
		assertEquals(1,heap.size());
		heap.pullHighest();
		assertEquals(0,heap.size());
		for (int i = 0; i < 100; i++) {
			heap.insert(i);
		}
		assertEquals(100,heap.size());
		
	}
}
