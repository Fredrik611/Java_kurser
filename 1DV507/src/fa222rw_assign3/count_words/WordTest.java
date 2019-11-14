package fa222rw_assign3.count_words;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordTest {
	static int cnt = 1;
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Test " + cnt++);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Complete!");
	}

	@Test
	void hashCodetest() {
		Word test1 = new Word("Hi");
		assertEquals(2640, test1.hashCode());
		
		Word test2 = new Word("Hello");
		assertEquals(5811059,test2.hashCode());
		
		Word test3 = new Word("nfsdfkg");
		assertEquals(1011583442,test3.hashCode());
	}
	
	@Test
	void equalsTest() {
		Word test1 = new Word("Hi");
		Word test2 = new Word("Hello");
		Word test3 = new Word("lowerlevel");
		
		assertEquals(false, test1.equals(test2));
		
		assertEquals(true, test1.equals(test1));
		
		assertEquals(false,test2.equals(test3));
	}
	@Test
	void compareToTest() {
		Word test1 = new Word("Hello");
		Word test2 = new Word("Hi");
		assertTrue(test1.compareTo(test2) < 0);
		Word test3 = new Word("hello");
		assertTrue(test1.compareTo(test3) == 0);
	}
	@Test 
	void ExtremeTest() {
		Word test1 = new Word("");
		Word test2 = new Word("");
		assertTrue(test1.compareTo(test2) == 0);
	}
}
