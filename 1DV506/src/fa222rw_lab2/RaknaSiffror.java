/**
 * 
 */
package fa222rw_lab2;

import java.util.Scanner;

/**
 * @author Fredrik
 *
 */
public class RaknaSiffror {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int temp = 0;
		int nollor = 0;
		int jamn = 0;
		int udda = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Skriv in ett positivt heltal");
		int talet = in.nextInt();
		in.close();
		
		//Får längden av talet.
		int length = String.valueOf(talet).length();
		System.out.print(length);
		
		// kollar varje tal om det är jämnt eller ojämnt 
		for (int i = length; i > 0; i--) {
			int delare = (int) Math.pow(10, i-1);
			temp = talet/delare;
			if (temp == 0) {
				nollor++;
			}
			else if(temp % 2 == 0){
				jamn++;
			}
			else {
				udda++;
			}
			talet -= delare*temp;
		}
		System.out.print("\n Nollor: " + nollor + "\n Jämna: " + jamn + "\n Udda: " + udda);
		
	}

}
