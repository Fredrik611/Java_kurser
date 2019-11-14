/**
 * 
 */
package fa222rw_assign1.ferrySystem;

/**
 * @author Fredrik
 *
 */
public class FerryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		var SSBylund = new FerrySystem();
		
		System.out.println(SSBylund.toString());
		
		for (int i = 0; i < 1; i++) {
			SSBylund.embark(new Car(4));
		}
		System.out.println(SSBylund.toString());
		for (int i = 0; i < 6; i++) {
			SSBylund.embark(new Bicycle());
		}
		Passenger p = new Passenger();
		if (SSBylund.hasRoomFor(p) ){
			SSBylund.embark(p);
		}
		System.out.println(SSBylund.toString());
		SSBylund.disembark();
		System.out.println(SSBylund.toString());
		for (int i = 0; i < 250; i++) {
			SSBylund.embark(new Passenger());
		}
		
	}

}
