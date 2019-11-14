/**
 * 
 */
package fa222rw_lab3;

import java.util.Random;

/**
 * @author Fredrik
 *
 */
public class RandomWalk {
	// kMax kommer vara positiv och kMin kommer vara negativt
	private int kMax;
	private	int kMin;
	// nuvarande poistion
	private int x;
	private int y;
	// antal steg som har tagits och stegMax antal steg walker f�r ta
	private int step;
	private int stepMax;

	public RandomWalk(int max, int edge) {
		// s�tter alla variabler till r�tta v�rdena 
		this.step = 0;
		// kommer att starta i mitten
		this.x = 0;
		this.y = 0;
		// G�r det till r�tta v�rden. kMax == +, kMin == -
		if (max > 0) {
			this.kMax = edge;
			this.kMin = -1*edge;
		}
		// kan vara noll d� blir det bara ett steg som kommer kunna tas innan det �r utanf�r planet.
		else {
			this.kMax = -1*edge;
			this.kMin = edge;
		}
		//max antal steg kan bara vara positivt 
		if (max > 0) {
			this.stepMax = max;
		}
		else {
			System.err.println("Max must be bigger than 0.");
		}
	}
	// G�r om talet till en str�ng 
	public String toString() {
		String str = "Position (" + x + "," + y  +") after " + step + " steps has been taken.";
		return str;
	}
	// ta ett steg
	public void takeStep() {
		// ifall Walker �r utanf�r eller har tagit maxSteg s� hoppar den �ver denna koden.
		// kan inte g� l�ngre
		if (moreSteps() && isBounds()) {
			Random rand = new Random();
			int temp = 1+rand.nextInt(4);
			//	2
			//  _		(Ske efterlikna en rektangel )
			//1|_|3 	(1 v�nster, 2 upp, 3 h�ger, 4 ner)
			//  4
			
			if (temp == 1 ) {
				x--;
			}
			if (temp == 2 ) {
				y++;
			}
			if (temp == 3) {
				x++;
			}
			if (temp == 4) {
				y--;
			}
			step++;
		}
		else {
			System.out.println("can't take more steps");
		}
	}
	
	public boolean isBounds() {
		// x eller y �r utanf�r ramen s� �r walker utanf�r planet.
		if (x > kMax || x < kMin || y > kMax || y < kMin) {
			return false;
		}
		return true;
	}
	public boolean moreSteps() {
		// Om maxSteg har uppn�ts ska inte walker g� mer
		if (stepMax == step) {
			return false;
		}
		return true;
	}
	public void walk() {
		// tar steg tills det inte g�r mer
		while (moreSteps() && isBounds()) {
			takeStep();
		}
	}
}
