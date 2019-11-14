
package fa222rw_lab1;

import java.util.Scanner;

/** Tar emot user input och printar ut det med citat tecken
 * @author Fredrik
 *
 */
public class Citat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Skriv ett citat: ");
		//läser in citat och skriver ut med två " med citatet 
		String citat = userInput.nextLine();
		System.out.println('"' + citat + '"');
		userInput.close();
	}

}
