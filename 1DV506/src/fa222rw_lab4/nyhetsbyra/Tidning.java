package fa222rw_lab4.nyhetsbyra;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class Tidning {
	private final int id;
	private static int cnt = 0;
	private ArrayList<Nyhet> nyheter = new ArrayList<Nyhet>(); 
	private String namn;
	
	
	public Tidning(String namn){
		cnt++;
		id = cnt;
		this.namn = namn;
	}
	
	// sends back the id of the paper 
	public int getId() {
		return id;
	}
	public String getNamn() {
		return namn;
	}
	// when the paper publish a new story i gets sent out to the nyhetsbyra och saved in it's own arraylist
	public Nyhet skapaNyhet(File filepath) {
		Nyhet news = new Nyhet(filepath,id);
		sparaEgenNyhet(news);
		return news;
	}
	
	// saves the own news story
	private void sparaEgenNyhet(Nyhet nyhet) {
		nyheter.add(nyhet);
	}
	
	// saves the news that the paper get sent
	public void addNyhet(Nyhet news) {
		nyheter.add(news);
	}
	
	// makes an iterator for the news array
	public Iterator<Nyhet> iteratorNyheter(){
		return new NyhetsIterator(nyheter);
	}
	
	
	
	
}
