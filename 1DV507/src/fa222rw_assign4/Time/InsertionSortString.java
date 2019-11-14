package fa222rw_assign4.Time;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import fa222rw_assign3.algorithms.SortingAlgorithms;

public class InsertionSortString {

	public static void main(String[] args) {
		Comparator<String> comp = new Comparator<String>(){
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		int size = 19000;
		int runs = 10;
		
		SortingAlgorithms sort = new SortingAlgorithms();
		
		ArrayList<String[]> randStringArr = randomStringArr(size, runs);
		Runtime mem = Runtime.getRuntime();
		mem.gc();
		long start = System.currentTimeMillis();
		for (int i = 0; i < runs; i++) {
			randStringArr.get(i);
			sort.insertionSort(randStringArr.get(i),comp);
		}
		long stop = (System.currentTimeMillis()- start)/runs;
		long freemem = mem.maxMemory() - mem.freeMemory();
		System.out.print("memory: " + freemem + " time: " + stop);


	}
	private static ArrayList<String[]> randomStringArr(int size, int runs){
		Random rand = new Random();
		ArrayList<String[]> tmp = new ArrayList<String[]>();
		String[] s = new String[size];
		for (int i = 0; i < runs; i++) {
			for (int j = 0; j < size; j++) {
				for (int j2 = 0; j2 < 10; j2++) {
					s[j] += (char) 32 + rand.nextInt(94);
				}
			}
			tmp.add(s);	
		}
		return tmp;
		
	}
}
