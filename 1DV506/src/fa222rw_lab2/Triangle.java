/**
 *
 */
package fa222rw_lab2;

import java.util.Scanner;

/**
 * @author Fredrik
 *
 */
public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		Scanner in = new Scanner(System.in);
		System.out.print("Mata in ett udda heltal: ");
		int bas = in.nextInt();
		// s�tter l�ngden p� str till basen l�ngd
		str.setLength(bas);
		in.close();

		//  r�tvinklig tirangel
		if (bas % 2 != 0 && bas > 0) {
			System.out.println("R�tvinklig triangel:");
			for (int i = 0; i < bas; i++) {
				if (i == 0) {
					for (int j = 0; j < bas; j++) {
						str.setCharAt(j, '*');
					}
				}
				else {
				str.setCharAt(i-1, ' ');

				}
				System.out.println(str);

			}
			System.out.println("Likbent triangel:");
			for (int i = 0; i < bas; i++) {
				str.setCharAt(i, ' ');
			}
			for (int i = 0; i < (bas/2)+1; i++) {
				str.setCharAt((bas/2)-i, '*');
				str.setCharAt((bas/2)+i, '*');
				System.out.println(str);
				System.out.println("hej");
			}



		}

		else {
			System.out.print("Inte ett udda tal ");
		}

	}

}
