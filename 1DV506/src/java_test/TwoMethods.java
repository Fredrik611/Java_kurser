/**
 * 
 */
package java_test;

import java.util.ArrayList;

/**
 * @author Fredrik
 *
 */
public class TwoMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,9999,-33};

		System.out.print(allOddNumbers(numbers).toString());
		
		String str = "aXX";
		System.out.print(hasTwoX(str));
		
	}
	
	public static ArrayList<Integer> allOddNumbers(int[] a){
	ArrayList<Integer> oddNumber = new ArrayList<Integer>(); 
	for (int i = 0; i < a.length ; i++) {
		if (a[i] % 2 != 0) {
			oddNumber.add(a[i]);
		}
	}
		
		
	return oddNumber;
	}
	
	public static boolean hasTwoX(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'X') {
				cnt++;
				if (cnt> 2) {
					return false;
				}
			}
		}
		if (cnt == 2) {
			return true;
		}
		return false;
	}

}
