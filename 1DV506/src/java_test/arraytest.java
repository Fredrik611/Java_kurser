package java_test;

import java.util.ArrayList;

public class arraytest {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			arr.add(i);
		}
		System.out.println(arr.get(2));
		arr.remove(2);
		System.out.print(arr.get(2));
		
	}
	
}
