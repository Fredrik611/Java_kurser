package fa222rw_lab1;

/** g�r om Fahrenheit till Celsius
 * @author Fredrik
 *
 */
import java.util.Scanner;

public class Fahrenheit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		// l�ser in grader i fahrenheit och g�r om de till celsius
		System.out.println("skriv in grader in Fahrenheit: ");
		float Fahrenheit = user_input.nextFloat();
		float celsius = ((Fahrenheit -32)/1.80000f);
		
		System.out.println("Motsvarande temperatur i Celsius �r " + celsius);
		user_input.close();
	}

}
