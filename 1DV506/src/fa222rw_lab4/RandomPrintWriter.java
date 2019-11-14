/**
 * 
 */
package fa222rw_lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * @author Fredrik
 *
 */
public class RandomPrintWriter {

	// puts a bunch of random integers in the file helTal.txt
	public static void main(String[] args) {
		String str = "";
		try {
		File fil = new File("C:\\\\Temp\\\\helTal.txt");
		Random rand = new Random();
		
		PrintWriter out = new PrintWriter(fil);
		for (int i = 0; i < 100; i++) {
			str = rand.nextInt(150) + "";
		out.println(str);
		
		}
		out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
