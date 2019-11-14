/**
 * 
 */
package fa222rw_assign4.Time;

import java.util.ArrayList;
import java.util.Random;


import fa222rw_assign3.algorithms.SortingAlgorithms;

/**
 * @author Fredrik
 *
 */
public class InsertionSortInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size = 85000;
		int runs = 10;
		
		SortingAlgorithms sort = new SortingAlgorithms();
		
		ArrayList<int[]> randIntArr = randomArr(size, runs);
		Runtime mem = Runtime.getRuntime();
		mem.gc();
		long start = System.currentTimeMillis();
		for (int i = 0; i < runs; i++) {
			sort.insertionSort(randIntArr.get(i));
			
		}
		long stop = (System.currentTimeMillis()- start)/runs;
		long freemem = mem.maxMemory() - mem.freeMemory();
		System.out.print("memory: " + freemem + " time: " + stop);

	}
	
	private static ArrayList<int[]> randomArr(int size, int runs){
		Random rand = new Random();
		ArrayList<int[]> tmp = new ArrayList<int[]>();
		int[] a = new int[size];
		
		for (int i = 0; i < runs; i++) {
			for (int j = 0; j < size; j++) {
				a[j] = rand.nextInt(20000);
				
			}
			tmp.add(a);
			
		}
		return tmp;
	}

}
