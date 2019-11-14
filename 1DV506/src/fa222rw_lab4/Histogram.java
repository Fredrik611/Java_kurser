/**
 * 
 */
package fa222rw_lab4;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Fredrik
 *
 */
public class Histogram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] histogram = {0,0,0,0,0,0,0,0,0,0}; // array with the different intervals
		int min = 0;							 // min value in the interval
		int max = 0;							 // max value in the interval
		int rest = 0;							 // how many values that aren't in the intervals
		int sum = 0;							 // the sum of all the values that are in the interval
		int number = 0;							 // just a temporary value
		
		StringBuilder str = new StringBuilder(); // a stringbuilder that helps build the stapeldiagram
		boolean in = false;						 // a boolean that becomes true if the value is in the interval
		String temp = "";						 // a temporary string
		try {
			File fil = new File(args[0]); 
			Scanner scan = new Scanner(fil);
			
			while (scan.hasNext()) {
				
				temp = scan.nextLine();
				if (temp.length() <= 0) { // check so the line isn't empty
					scan.close();
					throw new InputMismatchException("Text file is contains invilid data");
				}
				
				for (int i = 0; i < temp.length(); i++) { // checks so there isn't something that is not a number
					if (!(temp.charAt(i)>= '0' && temp.charAt(i) <= '9' ) )  {
						scan.close();
						throw new InputMismatchException("Text file is contains invilid data"); // if there is it throws an exception
					}
				}
				
				number = Integer.parseInt(temp); // parses the value to an int
				
				for (int i = 0; i < histogram.length; i++) {
					// checks if the number is in a interval
					if (number >= i*10+1 && number <= (i+1)*10) {
						
						histogram[i]++;
						sum++;
						in = true;
					}
					
				}
				// if the value is not in the interval this becomes true and rest counter get plus 1 
				if (!in) {
					rest++;
				}
				in = false;
			}
			
			scan.close();
			// Writes out the right information
			System.out.println("Läser heltal från filen: " + fil.getPath() );
			System.out.println("Antal i intervallet [1,100]: " + sum);
			System.out.println("Övriga: " + rest);
			
			//  Writes out the interval and how many there where in that interval
			for (int i = 0; i < histogram.length; i++) {	
				max = (i+1)*10;
				min = i*10+1;
				for (int j = 0; j < histogram[i]; j++) {
					str.append("*");
				}
				
				
				System.out.println( min + " - " + max + " | " + str.toString());
		
				// then delets all the * that where in it.
				str.delete(0, histogram[i]);
			}
		} 
		// if the file was not found
		catch (IOException e) {
			
			e.printStackTrace();
		}
		// if there are a string in the file
		catch (InputMismatchException e) {
			System.out.print(e.getMessage());
		}
		
		

	}

}
