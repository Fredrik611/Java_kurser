/**
 * 
 */
package fa222rw_lab2;

import java.util.Scanner;

/**
 * @author Fredrik
 *
 */
public class RaknaA {

	/**
	 * @param args
	 * Räknar ut a och A i en mening 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Mata in en textrad: ");
		int cnta = 0;
		int cntA = 0;
		
		String str = in.nextLine();

		// går igenom stringen och kollar ifall det finns ett A eller a
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				cnta += 1;
			}
			if (str.charAt(i) == 'A') {
			cntA += 1;
			}
		}
		in.close();
		
		System.out.println("Antal a: " + cnta);
		System.out.println("Antal A: " + cntA);

	}

}
