/**
 * 
 */
package fa222rw_lab2;

import java.util.*;
import java.util.Scanner;

/**
 * @author Fredrik
 *
 */
public class Lonerevision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList <Integer> loner = new ArrayList<Integer>();
		int median = 0;
		int medel = 0;
		int spridning = 0;
		
		System.out.print("Mata in löner (och avsluta med 'X'): ");
		while (in.hasNextInt()) {
			loner.add(in.nextInt());
			
		}
		in.close();

		Collections.sort(loner);
		
		//medianlon
		if (loner.size() % 2 == 0 ) {
			median = (loner.get(loner.size() / 2) + loner.get((loner.size() / 2) - 1))/2;
		}
		else{
			median = loner.get((loner.size()/2));
		}
		System.out.println("Medianlon: " + median);
		
		//medellon
		for (int i = 0; i < loner.size(); i++) {
			medel += loner.get(i);
		}

		
		medel = medel / loner.size();
		
		System.out.println("Medellon: " + medel);
		
		//Lonespridning
		spridning = loner.get(loner.size() -1 ) - loner.get(0);
		System.out.println("Spridning: " + spridning);
		
	}

}
