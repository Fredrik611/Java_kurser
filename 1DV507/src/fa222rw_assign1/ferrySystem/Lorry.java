/**
 * 
 */
package fa222rw_assign1.ferrySystem;

import java.util.ArrayList;

/**
 * @author Fredrik
 *
 */
//check buss for comments
public class Lorry extends Vehicle{
	public Lorry(int quantityOfPassengers) throws RuntimeException {
		if (quantityOfPassengers <= 2 && quantityOfPassengers > 0) {
			price = 100;
			size = 8;
			embarked = false;
			passengers = new ArrayList<Passenger>();
			for (int i = 0; i < quantityOfPassengers; i++) {
				passengers.add(new Passenger());
			}
		}
		else{
			throw new RuntimeException("Max passanger is 2");
		}
	}
	
	public void changePassengers(int quantityOfPassengers) {
		if (quantityOfPassengers <= 2 && quantityOfPassengers > 0) {
			if (quantityOfPassengers > passengers.size()) {
				passengers.add(new Passenger());
			}
			if (quantityOfPassengers < passengers.size()) {
				int temp = passengers.size() - quantityOfPassengers;
				while (temp > 0) {
					passengers.remove(passengers.size());
				}
			}
		}
		else{
			throw new RuntimeException("Max passanger is 2");
		}
	}
	
}
