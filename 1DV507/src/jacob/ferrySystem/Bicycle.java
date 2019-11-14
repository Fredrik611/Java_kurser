package fa222rw_assign1.ferrySystem;

import java.util.ArrayList;

public class Bicycle extends Vehicle{
	public Bicycle() throws RuntimeException {
		// adds only one passenger to the ArrayList
			passengers = new ArrayList<Passenger>();
			passengers.add(new Passenger());
			size = 1/5;
			price = 40;
			embarked = false;
	}
	// get the price of the ticket
	public int getPrice() {
		 return price;
	 }
}
