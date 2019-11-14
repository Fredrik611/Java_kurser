/**
 * 
 */
package fa222rw_lab1;

import java.util.Scanner;

/**
 * @author Fredrik
 * Programmet kommer att ta en kostnad och ett ehållet belopp och ge tillbaka hur många sedlar kunden ska få tillbaka. 
 */
public class VaxlaPengar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// läser in belopp
		System.out.print("Ange belopp");
		double belopp = in.nextDouble();
		
		// läser in ehållet belopp
		System.out.print("Ange ehållet belopp");
		int ehallet = in.nextInt();
		
		// tar fram hur mycket kunden ska ha tillbaka 
		int tillbaka = (int) ( ehallet - (Math.round(belopp)));
		System.out.println("tillbaka: "+tillbaka);
		
		// delar upp hur många tusen lappar de ska ha sen skriver ut det
		int tusen  = tillbaka/ 1000;
		tillbaka = tillbaka - tusen *1000;
		System.out.println("tusen-kronor: " + tusen);
		
		// gör samma som ovan 
		int femhundra  = tillbaka/ 500;
		tillbaka -= femhundra * 500;
		System.out.println("500-kronor: " + femhundra);
		
		int tvahundra  = tillbaka/ 200;
		tillbaka -= tvahundra * 200;
		System.out.println("200-kronor: " + tvahundra);
		
		int hundra  = tillbaka/ 100;
		tillbaka -= hundra *100;
		System.out.println("100-kronor: " + hundra);
		
		int femtio = tillbaka/ 50;
		tillbaka -= femtio *50;
		System.out.println("50-kronor: " + femtio);
		
		int tjugo  = tillbaka/20;
		tillbaka -= tjugo *20;
		System.out.println("20-kronor: "  + tjugo);
		
		int tio = tillbaka/ 10;
		tillbaka -= tio *10;
		System.out.println("10-kronor: " + tio);
		
		int fem  = tillbaka/ 5;
		tillbaka -= fem * 5;
		System.out.println("5-kronor: " + fem);
		
		int tva = tillbaka/ 2;
		tillbaka -= tva *2;
		System.out.println("2-kronor: "  + tva);
		
		System.out.println("1-kronor: "  + tillbaka);
		in.close();
	}

}
