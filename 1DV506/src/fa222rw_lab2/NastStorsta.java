/**
 * 
 */
package fa222rw_lab2;

import java.util.Scanner;

/**
 * @author Fredrik
 *
 */
public class NastStorsta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int biggest = 0;
		int nastbiggest = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Skriv in 10 heltal: ");
		//kollar om det är storst eller naststorst
		for (int i = 0; i < 10; i++) {
			int temp = in.nextInt();
			if (temp > biggest) {
				nastbiggest = biggest;
				biggest = temp;
			}
			else if(temp < biggest && temp > nastbiggest) {
				nastbiggest = temp;
			}
		}
		System.out.print("Det näst största talet är: " + nastbiggest);
		in.close();
	}

}
