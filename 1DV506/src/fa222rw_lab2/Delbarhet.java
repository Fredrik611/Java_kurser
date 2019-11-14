/**
 * 
 */
package fa222rw_lab2;

/**
 * @author Fredrik
 *
 */
public class Delbarhet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int cnt = 0;
		// Kollar ifall det är delbart med antigen 4 eller 5 men inte med båda. 
		for (int i = 100; i < 201; i++) {
			if (i % 5 == 0|| i % 4 == 0 ){
	
				if (!(i % 5 == 0 && i % 4 == 0)) {
					System.out.print(i + " ");
					cnt++;
					if (cnt % 10 == 0) {
						System.out.print("\n");
					}
				}
			}
		}
	}

}
