/**
 * 
 */
package fa222rw_lab3;

/**
 * @author Fredrik
 *
 */
public class Arrays {

	public static void main(String[] args) {
		int[] n = {3,4,5,6,7};
		
		//1
		System.out.println("Sum= " + sum(n));
		
		//2
		System.out.println("n= " + toString(n));
		
		//3
		System.out.println("n + 5: " + toString(addN(copyArray(n), 5)));
		
		//4
		System.out.println("n reversed: " + toString(reverse(copyArray(n))));
		
		//5
		System.out.println("Is 2 in array: " + hasN(n, 2));
		
		//6 
		replaceAll(n, 5 , 2);
		System.out.println("Replaced 5 with 2 in arr: " +toString( n));
		
		//7
		System.out.println("sorted array: " + toString(sort(copyArray(n))));
		
		//8
		int[] sub = {2,6,7};
		System.out.println("Arr has sub?: " + hasSubsequence(n,sub));
		
		//9 
		int[] n2 = {3,4,5,6,7};
		System.out.println(isLarger(n,n2));
	}
	
	//1
	private static int sum(int[] arr) {
		// plusar ihop arrayn och skickar tillbaka den som en int
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	//2
	// Gör om arrayn till en sträng
	private static String toString(int[] arr) {
		String str = "";
		for (int i : arr) {
			str += i + " ";
		}
		return str;
	}
	
	//3
	// kopierar arrayn och skickar tillbaka den 
	private static int[] copyArray(int[]arr)
	{
		int[] newarr = new int[arr.length];
		System.arraycopy(arr, 0, newarr, 0, arr.length);
		return newarr;
	}
	// plusar på fem till alla väderna i arryn
	private static int[] addN(int[] arr , int n) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += n;
		}
		return arr;
	}
	
	//4
	// Tar alla värdena och slänger i en bakvänd ordning
	private static int[] reverse(int[] arr) {
		
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1 -i];
			 arr[arr.length-1 -i] = temp;
			 }
		return arr;
	}
	
	//5	
	// kollar ifall det finns  tal n, isåfall retunera true. Annars false
	private static boolean hasN(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n ) {
				return true;
			}
		}
		return false;
	}
	
	//6 
	// Bytar ut alla värdena old till new i arryn.
	private static void replaceAll(int[] arr, int old , int nw){
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == old) {
				arr[i] = nw;
			}
		}
	}
	
	//7
	// Soterar efter storlek. Har gjort en bubblesort.
	private static int[] sort(int[] arr) {
		int temp = 0;
	
		for(int i=0; i < arr.length; i++){  
            for(int j=1; j < (arr.length-i); j++){  
                     if(arr[j-1] > arr[j]){  
                            //swap elements  
                            temp = arr[j-1];  
                            arr[j-1] = arr[j];  
                            arr[j] = temp;  
                    }        
            }  
		}
		return arr;
	}	
	
	//8
	// kollar ifall det finns en subsekvensen i arryn. 
	private static boolean hasSubsequence(int[] arr, int[] sub)
	{
		for (int i = 0; i < arr.length; i++) {
			// ifall värdet finns i arryn och det finns tillräckligt långt kvar i arryn. Så uför den nästa for-sats 
			if (arr[i] == sub[0] && arr.length - i >= sub.length) {
				for (int j = 0; j < sub.length; j++) {
					if (arr[i+j] != sub[j]) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}
	
	//9
	private static boolean isLarger(int[] a1, int[] a2) {
		int n = 0;
		//kollar vilken arry är längst och använd den som max i for-loopen
		if (a1.length > a2.length) {
			n = a2.length;
		}
		else {
			n = a1.length;
		}
		
		// om en det ena talet i a1 är större a2 i arrayn return true och om det är tvärtom return false.
		// annars fortsätter det bara att jämnföra.
		for (int i = 0; i < n; i++) {
			if (a1[i] > a2[i]) {
				return true;
			}
			else if (a2[i] > a1[i]) {
				return false;
			} 
		}
		
		// tal följden är samma går den på längden i arryerna.		
		if (n == a2.length) {
			return true;
		}
		else {
			return false;
		}
	}
}
