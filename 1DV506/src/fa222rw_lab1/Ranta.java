package fa222rw_lab1;
import java.util.Scanner;
  
public class Ranta {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// l�ser in sparade pengar
		System.out.println("Besparingar �r noll: ");
		int S = in.nextInt();
		
		// l�ser in rentan			
		System.out.println("�rsr�nta (i procent): ");
		double r = in.nextInt();
		
		//r�knar pengarna efter 5 �r
		double y = 5;
		r = (r*0.01) + 1;
		int Fem = (int) Math.round(S*(Math.pow(r,y)));
		
		//skriver ut antalet efter 5 �r 
		System.out.println("V�rdet p� besparingarna efter fem �r �r " + Fem);
		in.close();
	}
}
