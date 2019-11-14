/**
 * FunctionPointers.java
 * 13 jan 2017
 */
package fa222rw_assign1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author jlnmsi
 *
 */
public class FunctionPointers {

	public static void main(String[] args) {
		System.out.println("Part 1: Apply predicates");
		List<Integer> list = Arrays.asList(45, 3, 24, 16, 1, 1, 3, 8, 7, 6, 10, 12, 17, 22, 30);

		System.out.print("Print all numbers: ");
		Predicate<Integer> all = n -> true;
		selectAndPrint(list, all);               

		System.out.print("\nPrint all odd numbers: ");
		Predicate<Integer> odd = n -> {
			// if it's odd it will return true otherwise it should return false
			if (n % 2 == 0) {
				return false;
			}
			return true;
		};      // Must be updated
		selectAndPrint(list, odd);

		System.out.print("\nPrint all numbers greater than 10: ");
		Predicate<Integer> aboveTen = n -> {
			// for all bigger numbers that 10 returns to the predicate.
			if (n > 10) {
				return true;
			}
			return false;
		};   // Must be updated
		selectAndPrint(list, aboveTen);

		System.out.println("\n\nPart 2: Apply functions");
		List<Double> numbers = Arrays.asList(1.0, 16.0, 25.0, 81.0);
		System.out.println("Original: "+numbers);
		System.out.println("Square root: "+applyFunction(numbers, Math::sqrt));
		System.out.println("Power of two: " + applyFunction(numbers, FunctionPointers::powerOfTwo));
	}


	// Prints all elements in the list where predicate evaluates to true
	public static void selectAndPrint(List<Integer> list, Predicate<Integer> predicate) {
		// the predicate array is filled with boolean that determines what should be pushed in to the stream
		Stream<Integer> output = list.stream().filter(predicate);
		// prints out the steam.
		output.forEach(value -> System.out.print(value + " "));
		
	}

	// Returns a new list containing the numbers resulting from applying fx 
	// on the input list numbers
	private static List<Double> applyFunction(List<Double> numbers, Function<Double, Double> fx) {
		List<Double> copyNumbers = new ArrayList<Double>();
		// for-each of the doubles in the array take it and squarerot it and put it in a new array. 
		for (Double n : numbers) {
			copyNumbers.add(fx.apply(n));
		}
		// returns the new array.
		return copyNumbers;
	}

	private static Double powerOfTwo(Double d) {
		return Math.pow(d, 2);    
	}
}
