/**
 * 
 */
package fa222rw_lab1;
import java.util.Scanner;

/**
 * @author Fredrik
 * g�r om sekunder till timmar, minuter och sekunder. 
 */
public class Tid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//l�ser in sekunderna 
		System.out.print("Skriv in ett antal sekunder: ");
		int sekunder = in.nextInt();
		
		// Delar sekunderna med 3600 och sparar dem i en int.
		int timme = sekunder/3600;
		int rest = timme * 3600;
		sekunder -= rest;
		
		// samma som f�rra fast delar med 60 ist�llet f�r 3600
		int minuter = sekunder / 60;
		rest = minuter * 60;
		sekunder -= rest;
		in.close();
		// skriver ut allt 
		System.out.println("Detta motsvarar: " + timme + " timmar. " + minuter + " minuter. " + sekunder + " sekunder. ");
	}

}
