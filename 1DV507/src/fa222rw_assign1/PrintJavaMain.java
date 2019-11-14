/**
 * 
 */
package fa222rw_assign1;

import java.io.File;

/**
 * @author Fredrik
 *
 */
public class PrintJavaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File start = new File("C:\\Users\\Fredrik\\eclipse-workspace\\java_kurser\\1DV507");
		visitSub(start);
	}
	private static int depth = 0;
	
	private static void visitSub(File dir) {
		// If this is instance is a directory then this part of the code runs 
		if (dir.isDirectory()) {
			// prints out the directory name
			print(dir);
			depth++;
			// Makes a array with the sub of the directory
			File[] subs = dir.listFiles();
			// and run this method again for-each file in the directory. 
			for (File s : subs) {
				visitSub(s);
			}
			depth--;
		}
		// base case
		else {
			print(dir);
		}
	}
	// prints out the directory or file. With the right indentation
	private static void print(File dir) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < depth; i++) {
			str.append("   ");
		}
		str.append(dir.getName());
		System.out.println(str.toString());
	}

}
