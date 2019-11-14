package fa222rw_assign3.count_words;

public class Word implements Comparable<Word> {
	   private String word;

	   public Word(String str) { 
		   word = str;
	   }
	   // returns word
	   public String toString() { return word; }

	   @Override
	   public int hashCode() {
		   // if the word is not empty the code runs
		   if (word.length() != 0) {
			   	// start with a prime number so the chance is larger that the hash code is unique 
			   	int hc = 7;
			   	// makes the word is in lower case. So all the word that are spelt the same have the same hash code 
			   	String tempword = word.toLowerCase();
			   	// adds up all the ascii values of the word and times it by 13. 
		   		for (int i = 0; i < tempword.length(); i++) {
			   		hc = hc * 13 + tempword.charAt(i);
		   		}
		   		return hc;
		   	}
		   // just return 0 if the word is empty
		   return 0;
		}
	   @Override
	   public boolean equals(Object other) { 
		   // the object is null it's not a the same
		   if (other == null)
			   return false;
		   // if the object is not a instance of word it not equal.
		    if (!(other instanceof Word))
		        return false;
		    // the object is this one. it's equal.
		    if (other == this)
		        return true;
		    // compares the object. Ignores capital letters.
		    return this.toString().equalsIgnoreCase(other.toString());
	   }

	   /* Implement Comparable */
	   public int compareTo(Word w) {
		   int cnt = 0;
		   // makes the both words to lower case.
		   String tempWord = word.toLowerCase();
		   String otherWord = w.toString();
		   otherWord = otherWord.toLowerCase();
		   
		   while (tempWord.length() != cnt && otherWord.length() != cnt) {
			   // checks if the if condition is not met the word is not the same.
		   		if (tempWord.charAt(cnt) - otherWord.charAt(cnt) != 0) {
					return tempWord.charAt(cnt) - otherWord.charAt(cnt);
				}
		   		cnt++;
			}
		   	return tempWord.length() - otherWord.length();
	   }
}
