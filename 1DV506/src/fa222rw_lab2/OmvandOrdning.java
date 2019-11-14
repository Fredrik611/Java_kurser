/**
 * 
 */
package fa222rw_lab2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Fredrik
 *
 */
public class OmvandOrdning {

	public static void main(String[] args) {
		boolean neg = true;
		ArrayList <Integer> list = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		System.out.print("Mata in positiva heltal. Avsluta med ett negativt: ");
		
		
		// lägger till tal tills ett tal är negativt
		while (neg) {
			list.add(in.nextInt());
			if (list.get(list.size()-1) < 0 ) {
				list.remove(list.size()-1);
				neg = false;
			}
			
		}
		in.close();
		
		// Sedan skriver ut arrayn baklänges och längden 
		System.out.println("Antal positiva: " + list.size());
		for (int i = list.size()-1 ; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}

}
