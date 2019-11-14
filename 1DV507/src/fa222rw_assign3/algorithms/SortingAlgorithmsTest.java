package fa222rw_assign3.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class SortingAlgorithmsTest {
	private SortingAlgorithms sort = new SortingAlgorithms();

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void insertionIntTest() {
		int[] unsorted = {3,4,2,5,1};
		int[] sorted = {1,2,3,4,5};
		assertArrayEquals(sorted, sort.insertionSort(unsorted));

	}
	@Test
	void insertionStringTest(){
		Comparator<String> comp = new Comparator<String>(){
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		String[] unsorted = {"a","b","a","k", "ffrfrfrfrf"};
		String[] sorted = {"a","a","b","ffrfrfrfrf","k"};
		assertArrayEquals(sorted, sort.insertionSort(unsorted,comp));
	}
	
	@Test 
	void mergeIntTest() {
		int[] unsorted = {3,4,2,5,1};
		int[] sorted = {1,2,3,4,5};
		assertArrayEquals(sorted, sort.mergeSort(unsorted));
	}
	@Test
	void mergeStringTest(){
		Comparator<String> comp = new Comparator<String>(){
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		String[] unsorted = {"a","b","a","k", "sdfsdfsg"};
		String[] sorted = {"a","a","b","k","sdfsdfsg"};
		assertArrayEquals(sorted, sort.insertionSort(unsorted,comp));
	}
}
