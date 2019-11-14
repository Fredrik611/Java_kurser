/**
 * 
 */
package fa222rw_assign4.BinaryHeap;

/**
 * @author Fredrik
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryIntHeap b = new BinaryIntHeap();
		for (int i = 1; i < 9; i++) {
			b.insert(i);
		}
		b.pullHighest();
		System.out.println(b.toString());
		
	}

}
