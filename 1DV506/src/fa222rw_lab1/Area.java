/**
 * 
 */
package fa222rw_lab1;

import java.util.Scanner;
import java. text .DecimalFormat;

/** 
 * @author Fredrik
 * Programmet kommer att räkna ut en area på en cirkel med hjälp av radien.
 */
public class Area {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Läser in radien
		System.out.print("Ange en cirkelradie: ");
		float radie = in.nextFloat();
		
		// Räknar ut arean på cirklen 
		float area = (float) (Math.pow(radie,2)* Math.PI);
		
		// Gör om talet till en decimals noggrannhet
		DecimalFormat decimal = new DecimalFormat("0.#");
		String StrArea = decimal.format(area);
		
		System.out.print("Cirkelns area är " + StrArea);
		in.close();
	}

}
