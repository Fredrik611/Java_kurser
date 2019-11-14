/**
 * 
 */
package fa222rw_lab1;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author Fredrik
 *
 */
public class Avstand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// l�ser in alla v�rden 
		System.out.print("Skriv in x1: ");
		int x1 = in.nextInt();
		System.out.print("Skriv in x2 ");
		int x2 = in.nextInt();
		System.out.print("Skriv in y1 ");
		int y1 = in.nextInt();
		System.out.print("Skriv in y2 ");
		int y2 = in.nextInt();
		
		// r�knar avst�ndet emellan punkterna
		double avstand = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		
		// g�r om talet med tre decimals noggrannhet
		DecimalFormat dec = new DecimalFormat("0.###");
		String avstandDec = dec.format(avstand);
		System.out.print(avstandDec);
		in.close();

	}

}
