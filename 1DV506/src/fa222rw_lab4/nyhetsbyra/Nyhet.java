package fa222rw_lab4.nyhetsbyra;

import java.io.File;

public class Nyhet {
	private File nyhet;
	private int tidningid;
	private final int id;
	private static int cnt = 0;
	
	
	public Nyhet(File filepath, int tidningid ) {	
		cnt++;
		id = cnt;
		nyhet = filepath;
		this.tidningid = tidningid;
	}
	
	// sends the storys makers id back
	public int getTidningid() {
		return tidningid;
	}
	
	// sends the file path to the news story
	public File getNyhet() {
		return nyhet;
	}
	
	// sends back the id of the story
	public int getId() {
		return id;
	}
}
