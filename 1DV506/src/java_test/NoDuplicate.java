/**
 * 
 */
package java_test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Fredrik
 *
 */
public class NoDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> hej = new ArrayList<Integer>();
		boolean duplicate = true;
		int temp = 0;
		
		while (duplicate) {
			System.out.print("Number " + (hej.size() + 1) + ": ");
			temp = in.nextInt();
			hej.add(temp);
			for (int i = 0; i < hej.size() - 1; i++) {
				if (temp == hej.get(i)) {
					duplicate = false;
					hej.remove(hej.size() - 1 );
					System.out.println("Identified duplicate element " + temp);
				}
			}
			
			
		}
		in.close();
		System.out.println("All numbers: " + hej.toString());
		
		
	}

}
