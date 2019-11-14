package fa222rw_assign1;

import java.util.Scanner;

public class PascalMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Which row in pascals triangel: ");
		int n = in.nextInt();
		
		int[] ppt = pascalRow(n);
		in.close();
		
		System.out.println("Row number " + n + " looks like this");
		// prints out the row.
		for (int i : ppt) {
			String temp = i + " ";
			System.out.print(temp);
		}
	}
	
	public static int[] pascalRow(int n) {
		// makes a new a array every new row
		int[] row = new int[n+1];
		
		// base case 
		if (n == 0) {
			row[0] = 1;
			return row;
		}
		
		else {
			// gets last row
			int[] lastRow = pascalRow(n-1);
			
			for (int i = 0; i < row.length; i++) {
				// takes care of the corners cases
				if (i == 0 || i == n) {
					row[i] = 1;
				}
				// otherwise takes the last rows values and adds them
				else {
					row[i] = lastRow[i-1] + lastRow[i];
				}
			}
			// returns the new arrays
			return row;
		}
		
	}
}
