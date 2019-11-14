/**
 * 
 */
package fa222rw_lab4.stack;

import java.util.Iterator;

/**
 * @author Fredrik
 *
 */
public class StackMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectStack stack = new ObjectStack();
		
		System.out.println("size: " + stack.size());
		System.out.println("Is there elements: " +stack.isEmpty());
		
		
		stack.push("Hej ");
		stack.push("Bjorne!");
		System.out.println(stack.peek() + " ");
		
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		System.out.println("-------------------");
		Iterator<Object> iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		System.out.println("-------------------");
		System.out.println("size: " + stack.size());
		System.out.println("Is there elements: " + stack.isEmpty());
		int size = stack.size();
		
		for (int i = 0; i < size; i++) {
			System.out.println(stack.pop());
				
		}
		
		System.out.println(stack.pop());
		stack.peek();
		
		System.out.println("-------------------");
		System.out.println("size: " + stack.size());
		System.out.println("Is there elements: " +stack.isEmpty());
	}

}
