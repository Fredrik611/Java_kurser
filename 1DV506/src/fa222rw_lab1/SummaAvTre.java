/**
 * 
 */
package fa222rw_lab1;
import java.util.Scanner;
/**
 * @author Fredrik
 *
 */
public class SummaAvTre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// läser in ett tresifferigt tal
		System.out.print("Skriv in ett tresiffrigt tal");
		int tal = in.nextInt();
		
		
		// tar ut det tal med vikt hundra
		int hundra = tal /100;
		tal -= hundra *100;
		
		// tar ut det tal med vikt tio
		int tio = tal / 10;
		tal -= tio*10;
		
		// resten blir talet med vikten ett
		// Skriver ut summan av de tre talen
		System.out.println("Summan äv de tre talen är "+ (tal+hundra + tio));
		in.close();
	}

}
