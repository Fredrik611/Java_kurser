/**
 * 
 */
package fa222rw_assign1;

/**
 * @author Fredrik
 *
 */
public class PrintRecursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String str = "Hello Everyone!";
			
		   print(str, 0);
		   System.out.println(); // Line break
		   printReverse(str, 0);
	}
	
	public static void print(String str, int pos) {
		// base case
		if (str.length()-1 == pos) {
			System.out.print(str.charAt(pos));
		}
		else {
			// print out the letter 
			System.out.print(str.charAt(pos));
			// recursive method call
			print(str, ++pos);
			
		}
	}
	public static void printReverse(String str, int pos) {
		if (str.length()-1 == pos) {
			System.out.print(str.charAt(str.length()-1));
		}
		else {
			// same as before but reversed first calls the recursive method then prints out the char.
			printReverse(str, ++pos);
			System.out.print(str.charAt(pos-1));
		}
	}

}
