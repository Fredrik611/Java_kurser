/**
 * 
 */
package fa222rw_lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Fredrik
 *
 */
public class RaknaTecken {

	public static void main(String[] args) {
		// all the counters for the different characters
		int stora = 0;
		int sma = 0;
		int space = 0;
		int rest = 0;
		try {
			// gets the file and start to read it 
			File fil = new File("C:\\Temp\\historyOfProgramming.txt");
			Scanner in = new Scanner(fil);
			
			while (in.hasNextLine()) {
				String str = in.nextLine();
				// checks what categori the character is in
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
						sma++;
					
					if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') 
						stora++;
					
					if ((str.charAt(i) == ' ' || str.charAt(i) == '\t' || str.charAt(i) == '\r' || str.charAt(i) == '\n') ) 
						space++;
					
					else
						rest++;
				}
				
			}
			in.close();
			// Writes out the results 
			System.out.print(sma + " " + stora + " " + space + " " + rest);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
