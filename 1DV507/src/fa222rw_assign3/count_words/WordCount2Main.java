package fa222rw_assign3.count_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class WordCount2Main {

	public static void main(String[] args) {
		HashWordSet hashWord =  new HashWordSet();
		TreeWordSet treeWord = new TreeWordSet();
		try {
			// set's up a scanner on the file words.txt
			Scanner in = new Scanner(new File("C:\\Temp\\Words.txt"));
			// adds all the words to hashWords and treeWords
			while (in.hasNext()) {
				Word temp = new Word(in.next());
				hashWord.add(temp);	
				treeWord.add(temp);
			}
			in.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// prints out both the sizes.
		System.out.println("HashSet size: "+hashWord.size());
		System.out.println("TreeSet size: " + treeWord.size());
		// iterates out both the sets.
		Iterator<Word> hashIt = hashWord.iterator();
		while (hashIt.hasNext()) {
			System.out.println(hashIt.next());	
		}
		Iterator<Word> treeIt = treeWord.iterator();
		while (treeIt.hasNext()) {
			System.out.println(treeIt.next());
		}
	}

}
