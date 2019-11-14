/**
 * 
 */
package fa222rw_lab2;

import java.util.Scanner;

/**
 * @author Fredrik
 *
 */
public class Palindrom {

	public static void main(String[] args) {
		boolean pali = true;
		Scanner in = new Scanner(System.in);
		System.out.print("Skriv in ett palindrom: ");
		StringBuilder str = new StringBuilder(in.nextLine());
		in.close();

		// kollar ifall det är en bokstav om det inte är det så tar den bort det
		for (int i = 0; i < str.length(); i++) {
			if ( !( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') && !( str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
				str.deleteCharAt(i);
			}
			else {
				char c = str.charAt(i);
				str.setCharAt(i, Character.toLowerCase(c));
			}
		}
		//jämnför alla vokstaver med varandra.
		for (int i = 0; i < str.length()/2; i++) {
			if (!(str.charAt(i) == str.charAt(str.length()-i-1))) {
				pali = false;
				break;
			}
		}
		if (pali) {
			System.out.print("Ja, det är ett palindrom");
		}
		else {
			System.out.print("Nej, det är inte ett palindrom");
		}
	}

}
