package fa222rw_lab1;

import java.util.Scanner;

public class KortNamn {
	/** 
	 * @author Fredrik
	 * 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// läser in en string och tar den första karaktären i stringen.
		System.out.print("Förnamn: ");
		String fornamn = in.next(); 
		char forst = fornamn.charAt(0);
		
		// tar efternamnet och tar de första tre bokstäverna. 
		System.out.print("Efternamn");
		String efternamn = in.next();
		String last = efternamn.substring(0, 3);
		
		// skriver ut kort namnet
		System.out.print(forst + ". " + last);
		in.close();
		
		}
}
