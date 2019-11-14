/**
 * 
 */
package fa222rw_lab4.sorter_orter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Fredrik
 *
 */
public class SorteraOrter {

	public static void main(String[] args) {
		ArrayList<Orter> orter= new ArrayList<Orter>();
		try {
			File fil = new File(args[0]);
			Scanner in = new Scanner(fil);
			while (in.hasNextLine()) {
				String str = in.nextLine();
				String[] strpart = str.split(";");
				Orter temp = new Orter(Integer.parseInt(strpart[0]),strpart[1]);
				orter.add(temp);
			}
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Collections.sort(orter);
		
		System.out.println("Läser orter från filen: " + args[0]);
		System.out.println("Antal funna orter " + orter.size());
		for (Orter i : orter) {
			System.out.println(i.toString());
		}
		
			
		
	}

}
