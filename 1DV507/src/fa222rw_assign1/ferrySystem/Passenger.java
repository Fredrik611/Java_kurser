/**
 * 
 */
package fa222rw_assign1.ferrySystem;

/**
 * @author Fredrik
 *
 */
public class Passenger {
	private int price;
	private boolean embarked;
	
	public Passenger() {
		price = 25;
		embarked = false;
	}
	
	public void embark() {
		embarked = true;
	}
	public void disembark() {
		embarked = false;
	}
	public int getPrice() {return price;}
	
	public boolean getEmbarked() {return embarked;}
}
