package fa222rw_assign1.ferrySystem;

import java.util.ArrayList;

public class Buss extends Vehicle{
	public Buss(int quantityOfPassengers) throws RuntimeException {
		if (quantityOfPassengers <= 20 && quantityOfPassengers > 0) {
			// price of the buss
			price = 100;
			// size of the buss
			size = 4;
			// not embarked when registered
			embarked = false;
			// array with the passengers in the buss Max 20
			passengers = new ArrayList<Passenger>();
			for (int i = 0; i < quantityOfPassengers; i++) {
				passengers.add(new Passenger());
			}
		}
		else{
			throw new RuntimeException("Max passanger is 20");
		}
	}
	// a chance to change the passegers in the buss
	public void changePassengers(int quantityOfPassengers) {
		if (quantityOfPassengers <= 20 && quantityOfPassengers > 0) {
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
			throw new RuntimeException("Max passanger is 20");
		}
	}
}
