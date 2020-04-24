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
		b.insert(15);
		b.insert(7);
		b.insert(52);
		b.insert(13);
		b.insert(16);
		b.insert(6);
		b.insert(24);
		b.insert(46);
		
		b.pullHighest();
		System.out.println(b.toString());
		
	}

}
