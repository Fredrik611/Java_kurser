/**
 * 
 */
package fa222rw_lab2;

import java.util.Scanner;

/**
 * @author Fredrik
 *
 */
public class Baklanges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Mata in en textrad: ");
		StringBuilder sb = new StringBuilder ();
		// l�ser in stringen och v�nder p� den
		sb.append(in.nextLine());
		sb.reverse();
		
		System.out.print("Bakl�nges: " + sb);
		in.close();
		

	}

}
