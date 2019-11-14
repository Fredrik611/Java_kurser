/**
 * 
 */
package fa222rw_lab2;

import java.util.Random;

/**
 * @author Fredrik
 *
 */
public class TvåTarningar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] tal = new int[11]; 
		
		Random rand = new Random();
		int tarning1 = 0;
		int tarning2 = 0;
		int sum = 0;
		// simulerar 20000 tärningskasten
		for (int i = 0; i < 10000; i++) {
			tarning1 = 1 + rand.nextInt(6);
			tarning2 = 1 + rand.nextInt(6);
			
			sum = tarning1 + tarning2;
			tal[sum-2]++;
		}
		
		System.out.println("Frequency table (sum,count) for rolling two dices 10000 times");
		for (int i = 0; i < tal.length; i++ ) {
			System.out.println(i+2 + "\t" + tal[i]);
		}
	}

}
