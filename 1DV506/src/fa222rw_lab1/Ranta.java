package fa222rw_lab1;
import java.util.Scanner;
  
public class Ranta {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// läser in sparade pengar
		System.out.println("Besparingar år noll: ");
		int S = in.nextInt();
		
		// läser in rentan			
		System.out.println("Årsränta (i procent): ");
		double r = in.nextInt();
		
		//räknar pengarna efter 5 år
		double y = 5;
		r = (r*0.01) + 1;
		int Fem = (int) Math.round(S*(Math.pow(r,y)));
		
		//skriver ut antalet efter 5 år 
		System.out.println("Värdet på besparingarna efter fem år är " + Fem);
		in.close();
	}
}
