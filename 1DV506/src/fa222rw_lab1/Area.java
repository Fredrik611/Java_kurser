/**
 * 
 */
package fa222rw_lab1;

import java.util.Scanner;
import java. text .DecimalFormat;

/** 
 * @author Fredrik
 * Programmet kommer att r�kna ut en area p� en cirkel med hj�lp av radien.
 */
public class Area {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// L�ser in radien
		System.out.print("Ange en cirkelradie: ");
		float radie = in.nextFloat();
		
		// R�knar ut arean p� cirklen 
		float area = (float) (Math.pow(radie,2)* Math.PI);
		
		// G�r om talet till en decimals noggrannhet
		DecimalFormat decimal = new DecimalFormat("0.#");
		String StrArea = decimal.format(area);
		
		System.out.print("Cirkelns area �r " + StrArea);
		in.close();
	}

}
