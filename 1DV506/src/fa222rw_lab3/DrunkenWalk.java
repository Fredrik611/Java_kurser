/**
 * 
 */
package fa222rw_lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Fredrik
 *
 */
public class DrunkenWalk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// tar emot alla v�rdena
		Scanner in = new Scanner(System.in);
		System.out.print("Ange storlek: ");
		int k = in.nextInt();
		System.out.print("Ange max steg: ");
		int steg = in.nextInt();
		System.out.print("Ange slumpvandringar");
		int antal = in.nextInt();
		in.close();

		int cnt = 1;
		int swim = 0;
		// k�rs till cnt blir antal
		while (antal >= cnt) {
			// simulerar en walk
			RandomWalk walk = new RandomWalk(steg, k);
			walk.walk();
			// Om den g�r utanf�r s� �ker den i vatten och swim + 1 
			if (!walk.isBounds()) {
				swim++;
			}
			cnt++;
		}
		// R�knar ut procenten och formatera den till tre decimaler
		DecimalFormat dec = new DecimalFormat("0.##");
		double swimprc = (double) swim*100/antal;
		String str = dec.format(swimprc);
		System.out.print("Av " + antal + " onyktra personer, f�ll " +  swim + "(" + str + "%) i vattnet.");
	}

}
