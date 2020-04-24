package fa222rw_assign1.ferrySystem;

import java.util.ArrayList;
import java.util.Iterator;

public class FerrySystem implements Ferry{
	private int money = 0;
	private int vehicleSpace = 40;
	private int bicycleCnt = 0;
	private int passengerSpace = 200;
	private ArrayList<Passenger> passengers = new ArrayList<Passenger>();
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	// counts all the passengers left
	@Override
	public int countPassengers() {
		return passengerSpace;
		
	}

	// counts all the vehicle space
	@Override
	public int countVehicleSpace() {
		return vehicleSpace;
	}

	// counts the money the earned
	@Override
	public int countMoney() {
		return money;
	}
	
	private void pay(int m) {
		money += m;
	}

	// iterator of all vehicle
	@Override
	public Iterator<Vehicle> iterator() {
		
		return new VehicleIterator();
	}
	
	// embark a vehicle.
	@Override
	public void embark(Vehicle v){
		if (hasSpaceFor(v)) {
			if (v instanceof Bicycle) {
				bicycleCnt++;
				if (bicycleCnt == 1) {
					vehicleSpace--;
				}
				if (bicycleCnt == 5) {
					bicycleCnt = 0;
				}
			}
			v.embark();
			vehicleSpace -= v.getSize();
			vehicles.add(v);
			pay(v.getPrice());
			Iterator<Passenger> iterator = v.iterator();
			while (iterator.hasNext()) {
				embark(iterator.next());
			}
		}
		else {
			System.err.println("Not enough room for vehicle");
		}
	}

	// embark a passenger
	@Override
	public void embark(Passenger p) {
		if (hasRoomFor(p)) {
			p.embark();
			passengerSpace -= 1;
			passengers.add(p);
			pay(p.getPrice());
		}
		else {
			System.err.println("Not enough room for passenger");
		}
	}

	// dissembark all the passenger and vehicle
	@Override
	public void disembark() {
		disembarkVehicle();
		disembarkPassengers();
	}
	
	private void disembarkVehicle() {
		for (int i = vehicles.size()-1; i > 0; i--) {
			vehicles.get(i).disembark();
		}
		vehicles.clear();
		vehicleSpace = 40;
	}
	
	private void disembarkPassengers() {
		for (int i =  passengers.size()-1; i > 0; i--) {
			passengers.get(i).disembark();
		}
		passengers.clear();
		passengerSpace = 200;
	}
	
	// checks if the ferry has space for one more vehicle
	@Override
	public boolean hasSpaceFor(Vehicle v) {
		if (vehicleSpace - v.getSize() >= 0) {
			return true;
		}
		return false;
	}

	// checks if the ferry has space for a passenger
	@Override
	public boolean hasRoomFor(Passenger p) {
		if (passengerSpace - 1 >= 0) {
			return true;
		}
		return false;
	}
	
	// returns a nice string. 
	@Override
	public String toString() {
		String str = "The ferry has room for " + vehicleSpace + " cars left and room for " + passengerSpace + " passangers. Ferry has earned " + countMoney() + " kr!";
		return str;
	}
	// Vehicle iterator.
	class VehicleIterator implements Iterator<Vehicle> {
		private int count = 0;
		public Vehicle next() {return vehicles.get(count++);}
		
		public boolean hasNext() {return count<vehicles.size();}
		
		public void remove() {
			throw new RuntimeException("remove() is not implemented");
		}
	}
}
