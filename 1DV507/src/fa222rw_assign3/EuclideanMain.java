package fa222rw_assign3;

import java.util.Scanner;

public class EuclideanMain {
	public static void main(String[] args) {
		// take in user input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter integer 1: ");
		int m = in.nextInt();
		System.out.println("Enter integer 2: ");
		int n = in.nextInt();
		
		System.out.println("GCD("+m+","+n+") = "+GCD(m,n) );
	}
	private static int GCD(int m, int n) {
		int commonDivider = 0;
		// Determines the greatest divider. 
		if (m>n) 
			commonDivider = n;
		else 
			commonDivider = m;
		if (m != 0 && n != 0) {
			// when both of the conditions are 0 it has found the greatestdivider.
			while(m % commonDivider != 0 || n % commonDivider != 0) {
				commonDivider--;
			}
		return commonDivider;
		}
		else
			throw new IllegalArgumentException("One of the arguments is 0");
	}
}
