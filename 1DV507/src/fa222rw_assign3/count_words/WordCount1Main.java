package fa222rw_assign3.count_words;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class WordCount1Main {

	public static void main(String[] args) {
		HashSet<Word> hashWords = new HashSet<Word>();
		TreeSet<Word> treeWords = new TreeSet<Word>();
		
		try {
			// set's up a scanner on the file words.txt
			Scanner in = new Scanner(new File("C:\\Temp\\Words.txt"));
			// adds all the words to hashWords and treeWords
			while (in.hasNext()) {
				Word temp = new Word(in.next());
				hashWords.add(temp);
				treeWords.add(temp);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// prints out both of the size.
		System.out.println("HashSet size " + hashWords.size());
		System.out.println("TreeSet size " + treeWords.size());
		
		// iterates the out all the words in the hash and tree.
		Iterator<Word> hash = hashWords.iterator();
		while (hash.hasNext()) {
			System.out.println(hash.next());
		}
		Iterator<Word> tree = treeWords.iterator();
		while (tree.hasNext()) {
			System.out.println(tree.next());
			
		}
	}

}
