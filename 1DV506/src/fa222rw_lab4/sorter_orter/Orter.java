package fa222rw_lab4.sorter_orter;

public class Orter implements Comparable<Orter>{
	int postkod;
	String ort;
	
	public Orter(int postkod, String ort) {
		this.postkod = postkod;
		this.ort = ort;
	}
	public int getPostKod() {return postkod;}
	public String getOrt() {return ort;}
	
	public String toString() {
		return postkod + " " + ort;
		
	}
	public int compareTo(Orter o) {
		
		return postkod - o.postkod;
	}
	
	
}
