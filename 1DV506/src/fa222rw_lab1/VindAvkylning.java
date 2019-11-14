package fa222rw_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Fredrik
 *
 */

public class VindAvkylning {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Läser in temperaturen
		System.out.print("Ange temperatur (C): ");
		double T = in.nextDouble();
		
		//läser in vindhastigheten i m/s och gör om det till Km/h
		System.out.print("Ange vindhastigheten (m/s): ");
		double V = 3.6 * in.nextDouble();
		
		//räknar ut det upplevda temperaturen och skriver ut det med en decimals noggrannhet
		double twc = 13.12 + (0.6215*T) - (11.37*Math.pow(V , 0.16)) + (0.3965*T*Math.pow(V,0.16));
		DecimalFormat dec = new DecimalFormat("0.#");
		
		String kyla = dec.format(twc);
		System.out.print(kyla);
		
		in.close();	
	}

}
