/**
 * 
 */
package fa222rw_lab1;
import java.util.Scanner;

/**
 * @author Fredrik
 * gör om sekunder till timmar, minuter och sekunder. 
 */
public class Tid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//läser in sekunderna 
		System.out.print("Skriv in ett antal sekunder: ");
		int sekunder = in.nextInt();
		
		// Delar sekunderna med 3600 och sparar dem i en int.
		int timme = sekunder/3600;
		int rest = timme * 3600;
		sekunder -= rest;
		
		// samma som förra fast delar med 60 istället för 3600
		int minuter = sekunder / 60;
		rest = minuter * 60;
		sekunder -= rest;
		in.close();
		// skriver ut allt 
		System.out.println("Detta motsvarar: " + timme + " timmar. " + minuter + " minuter. " + sekunder + " sekunder. ");
	}

}
