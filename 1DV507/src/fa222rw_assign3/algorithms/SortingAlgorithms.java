/**
 * 
 */
package fa222rw_assign3.algorithms;

import java.util.Comparator;

/**
 * @author Fredrik
 *
 */
public class SortingAlgorithms {

	public int[] insertionSort(int[] in) {
		int temp;
		// for-each in the array. It compares from i to zero if j is smaller than the one before is which places with them.  
		for (int i = 0; i < in.length; i++) {
			for (int j = i; j > 0 ; j--) {
				if (in [j] < in[j-1] ) {
					temp = in[j];
					in[j] = in[j-1];
					in[j-1] = temp;
				}
			}
		}
			return in;
	}
	public String[] insertionSort(String[] in, Comparator<String> c) {
		String temp;
		// works the same as with int, except that it uses compare from Comparator.
		for (int i = 0; i < in.length; i++) {
			for (int j = i; j > 0 ; j--) {
				if (c.compare(in[j], in[j-1]) < 0) {
					temp = in[j];
					in[j] = in[j-1];
					in[j-1] = temp;
				}
			}
		}
			return in;
	}
	
	public int[] mergeSort(int[] in) {
		// base case
		if (in.length <= 1) {
			return in;
		}
		// left array
		int[] l = new int[in.length/2];
		// right array
		int[] r = new int[in.length-(in.length/2)];
		// put in half of the array to left array
		for (int i = 0; i < l.length; i++)
            l[i] = in[i];
		// put rest of the array to the right.
        for (int i = 0; i < r.length; i++)
            r[i] = in[i + in.length/2];
       
		return merge(mergeSort(l),mergeSort(r));
	}
	private int[] merge(int[] l, int[] r) {
		// merges the l and r array in a new array.
		int[] res = new int[l.length + r.length];	
		 int i = 0, j = 0;
		 // sorts the arrays into the new array.
	        for (int k = 0; k < res.length; k++) {
	            if (i >= l.length) 
	            	res[k] = r[j++];
	            else if (j >= r.length) 
	            	res[k] = l[i++];
	            else if (l[i] <= r[j]) 
	            	res[k] = l[i++];
	            else                    
	            	res[k] = r[j++];
	        }
		return res;
	}
	
	public String[] mergeSort(String[] in, Comparator<String> c) {
		// nothing to sort. 
		if (in.length <= 1) {
			return in;
		}
		// left array
		String[] l = new String[in.length/2];
		// right array
		String[] r = new String[in.length-(in.length/2)];

		
		// put in half of the array to left array
		for (int i = 0; i < l.length; i++)
            l[i] = in[i];
		// put rest of the array to the right.
        for (int i = 0; i < r.length; i++)
            r[i] = in[i + in.length/2];
       
		return merge(mergeSort(l,c),mergeSort(r,c),c);
	}
	private String[] merge(String[] l, String[] r, Comparator<String> c ) {
		// merges the l and r array in a new array.
		String[] res = new String[l.length + r.length];	
		int i = 0, j = 0;
		// sorts the arrays into the new array.
	        for (int k = 0; k < res.length; k++) {
	            if (i >= l.length) 
	            	res[k] = r[j++];
	            else if (j >= r.length) 
	            	res[k] = l[i++];
	            else if (c.compare(l[i], r[j++]) < 0) 
	            	res[k] = l[i++];
	            else                    
	            	res[k] = r[j++];
	        }
		return res;
	}
}
