/**
 * 
 */
package fa222rw_lab4.nyhetsbyra;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Fredrik
 *
 */
public class NyhetsByra {
	private ArrayList<Nyhet> nyheter; 
	private ArrayList<Tidning> tidningar;
	
	public NyhetsByra() {
		nyheter = new ArrayList<Nyhet>();
		tidningar = new ArrayList<Tidning>();
	}
	
	// adds a paper to the arraylist
	public void AddTidning(Tidning tidning) {
		tidningar.add(tidning);
	}
	// adds a story to the arraylist from the paper
	public void AddNyhet(Nyhet news) {
		nyheter.add(news);
		SkickaNyhet(news);
	}
	
	// sends out the new story to all papers except the one who made it.
	public void SkickaNyhet(Nyhet news) {
		for (int i = 0; i < tidningar.size(); i++) {

			if (news.getTidningid() != tidningar.get(i).getId()) {
				
				tidningar.get(i).addNyhet(news);
			}
		}
	}
	
	// makes an iterator for the paper arraylist
	public Iterator<Tidning> iteratorTidning(){
		return new TidningIterator(tidningar);
	}
	
	// makes an iterator for the news arraylist
	public Iterator<Nyhet> iteratorNyheter(){
		return new NyhetsIterator(nyheter);
	}
	
	
	
}
