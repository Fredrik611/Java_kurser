/**
 * 
 */
package fa222rw_lab3;

/**
 * @author Fredrik
 *
 */
public class AlarmClockMain {

	public static void main(String[] args) {
		// s�tt en klocka till klockan 23:48
		AlarmClock clock = new AlarmClock(23,48);
		
		// skriver ut nuvarande tid
		clock.displayTime();
		
		// s�tter ett larm p� 6:15
		clock.setAlarm(6, 15);
		
		// simulera 500 minuter
		for (int i = 0; i < 500; i++) {
			clock.timeTick();
		}
		// skriv ut tiden
		clock.displayTime();
		

	}

}
