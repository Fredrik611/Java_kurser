package fa222rw_lab1;

/** gör om Fahrenheit till Celsius
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
		
		// läser in grader i fahrenheit och gör om de till celsius
		System.out.println("skriv in grader in Fahrenheit: ");
		float Fahrenheit = user_input.nextFloat();
		float celsius = ((Fahrenheit -32)/1.80000f);
		
		System.out.println("Motsvarande temperatur i Celsius är " + celsius);
		user_input.close();
	}

}
