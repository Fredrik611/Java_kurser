/**
 * 
 */
package fa222rw_lab1;

import java.util.Random;
/**
 * @author Fredrik
 *
 */
public class Slumpsumma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		int summa = 0;
		
		// tar fram slumpmässiga tal mellan 1-100 och skriver ut det.
		// lägger även ihop det i en summa 
		 for(int i=1; i<6; i++){
			 int random = 1 + rand.nextInt(100);
             System.out.print(random + " ");
             summa += random;
         }
		 System.out.print("\n"+ summa );

	}

}
