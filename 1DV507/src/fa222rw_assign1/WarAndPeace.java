/**
 * 
 */
package fa222rw_assign1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Fredrik
 *
 */
public class WarAndPeace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String text = readText("C:\\Temp\\WarAndPeace.txt");
		String[] words = text.split(" ");
		System.out.println("Initial word count: "+words.length);  
		// Counts all the words that are unique and it is not casesensative. 
		long wordCnt = Arrays.stream(words).map(WarAndPeace::removeCharacter).map(String::toLowerCase).filter(x -> x.isEmpty() == false).distinct().count();
		
		System.out.println("Unique word count: " + wordCnt);
	}
	
	private static String readText(String path){
		StringBuilder temp = new StringBuilder();
		try {
			// reads the file and puts it all in a StringBuilder
			Scanner in = new Scanner(new FileReader(path));
			while (in.hasNext()) {
				temp.append(in.nextLine());
				temp.append(" ");
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return temp.toString();

		
	}
	private static String removeCharacter(String str) {
		// takes a string and divides it to just chars 
		String[] tmp = str.split("");
		// removes all the unwanted characters nd then sends back the a string with only the chars that we want.
		return Arrays.stream(tmp).filter(x -> x.isEmpty() == false)
				.filter(c -> Character.isLetter(c.charAt(0)) || c.contains("'") ||  c.contains("-"))
				.collect(Collectors.joining(""));
	}
	
}
