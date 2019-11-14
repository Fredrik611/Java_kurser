/**
 * 
 */
package fa222rw_lab2;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Fredrik
 *
 */
public class HighLow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int tal = 0;
		int forsok = 1;
		int gissning = 0;
		int ratt = 0;
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		//Skapar ett tal mellan 1-100
		tal = 1 + rand.nextInt(100);
		
		while (ratt != 1 && forsok != 10) {
			
			// kollar om gissningen höggre eller lägre 
			System.out.print("Gisning " + forsok + ": ");
			gissning = in.nextInt();
			
			if (gissning == tal) {
				System.out.println("Rätt svar efter bara " + forsok + " gissningar - Strålande!");
				ratt = 1;
			}
			
			else if (gissning < tal) {
				System.out.println("Ledtråd: högre");
			}
			
			else {
				System.out.println("Ledtråd: lägre");
			}
			
			forsok++;
			
		}
		
		in.close();
		
		if (ratt == 0 && forsok == 10) {
			System.out.println("Tyvärr du klarade inte det! Talet var: " + tal);
			
		}

	}

}
