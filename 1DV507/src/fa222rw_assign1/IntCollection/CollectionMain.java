/**
 * 
 */
package fa222rw_assign1.IntCollection;

import java.util.Iterator;

/**
 * @author Fredrik
 *
 */
public class CollectionMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// testing ArrayIntList 
		int sum = 0;
		ArrayIntList arr = new ArrayIntList();
		
		System.out.println("The size of the array: " + arr.size());
		
		for (int i = 0; i < 10; i++) {
			arr.add(i);
		}
		
		System.out.println("The size of array: "+ arr.size());
		try {
			
		
		// adding 99 to position 5
		arr.addAt(99,11);
		
		System.out.println(arr.get(5));
		
		System.out.println("Getting position 2 in array: " + arr.get(2));
		arr.remove(2);
		System.out.println("Getting position two in array after removing the last one in position 2: " + arr.get(2));
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(arr.toString());
		
		System.out.println("Getting the last int in array: " + arr.get(arr.size()));
		
		Iterator<Integer> iterator = arr.iterator();
		
		// iterationg the array and calculating the sum of all the numbers 
		while (iterator.hasNext()) {
			 sum += iterator.next();
		}
		System.out.println("Sum of all the numbers in the array: " + sum);
		
		// testing ArrayIntStack
		ArrayIntStack stack = new ArrayIntStack();
		
		stack.push(10);
		
		// pushing in 20 elements in to the stack
		for (int i = 0; i < 20; i++) {
			stack.push(i);
		}
		
		System.out.println("getting size of StackArray: " + stack.size());
		System.out.println("-------");
		int limit = stack.size();
		try {
			
		
		// popping all integers int the array.
		for (int i = 0; i < limit ; i++) {
			System.out.println(stack.pop());
		}
		
		System.out.println("Peeking in the stack it is empty:" + stack.peek());
		} catch (IndexOutOfBoundsException e) {
			System.out.print(e.getMessage());
		}

	}
	

}
