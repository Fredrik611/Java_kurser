/**
 * 
 */
package fa222rw_lab3;

/**
 * @author Fredrik
 *
 */
public class Point {
	private int x;
	
	private int y;
	
	// konstruktor
	public Point() {
		x = 0; 
		y = 0;
	}

	// konstruktor med parametrar
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// skickar tillbaka som en sträng
	public String toString() {
		String str = "(" + x + "," + y + ")";
		return str;
	}
	
	// på de punkterna på samma plats return true
	public boolean isEqualTo( Point p) {
		if (x == p.x && y == p.y) {
			return true;
		}
		return false;
	}
	// hur långt är det mellan punkterna 
	public double distanceTo(Point p) {
		double dist = Math.pow((x-p.x), 2) ;
		dist += Math.pow((y-p.y), 2);
		dist = Math.sqrt(dist);
		return dist;
	}
	// flytta punkten med x och y steg
	public void move(int x , int y) {
		this.x += x;
		this.y += y;
	}
	//flytta det till x och y kordinaten
	public void moveToXY(int x , int y ) {
		this.x = x;
		this.y = y;
	}

}
