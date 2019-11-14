/**
 * 
 */
package fa222rw_assign3.count_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Fredrik
 *
 */
public class IdentyfyWordsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		
		StringBuilder text = new StringBuilder();
			// get history of programming 
			Scanner in = new Scanner(new File("C:\\Temp\\historyOfProgramming.txt"));
			// reads in the text 
			while(in.hasNextLine()){
				// appends the text to the string builder.
				text.append(removeUnwanted(in.nextLine()) + " ");
			}
			// just to check that is the right length
			System.out.print(text.length());
			// the file that is should write to
			PrintWriter print = new PrintWriter("C:\\Temp\\Words.txt");
			// print to  the string builder to file
			print.print(text.toString());
			in.close();
			print.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	private static String removeUnwanted(String line) {
		// takes a string and divides it to just chars 
		String[] tmp = line.split("");
		// removes all the unwanted characters and then sends back the a string with only the chars that we want.
		return Arrays.stream(tmp).filter(x -> x.isEmpty() == false)
				.filter(c -> Character.isLetter(c.charAt(0)) || Character.isWhitespace(c.charAt(0)))
				.collect(Collectors.joining(""));
	}

}
