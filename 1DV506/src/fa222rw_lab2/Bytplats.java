/**
 * 
 */
package fa222rw_lab2;

/**
 * @author Fredrik
 *
 */
public class Bytplats {
	public static void main(String[] args) {
		char temp;
		char[] text = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 
	         			't', 't', 'e', 'D' };
		for (char c : text)
			System.out.print(c);
	      
		// byter plats på alla bokstaver
		for (int i = 0; i < text.length/2; i++) {
			temp = text[text.length-1-i];
			text[text.length-1-i] = text[i];
			text[i] = temp;
		}
		// skriver ut stringen
		System.out.print("\n");
		for (char c : text) 
			System.out.print(c);
			
	}
}