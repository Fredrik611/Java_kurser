package fa222rw_lab3;

public class AlarmClock {
	/* Current time */
	private int hours = 0;
	private int minutes = 0;
	/* Alarm Properties */
	private int alarmHour = 0;
	private int alarmMinute = 0;
	private boolean alarmOn = false;
	
	// Construktur
	public AlarmClock(int h, int m) {
		hours = h;
		minutes = m;
	}
	
	// Skriver ut tiden
	public void displayTime() {
		System.out.println("Time: "+hours+" hours, "+minutes+" minutes");
	}
	
	// Sätter ett larm 
	public void setAlarm(int h, int m) {
		alarmHour = h;
		alarmMinute = m;
		alarmOn = true;
	}
	
	// Skriver ut den satta larm tiden
	public void displayAlarmTime() {
		System.out.println("Alarm Time: "+alarmHour+" hours, "+alarmMinute+" minutes");
	}
	
	// Simulerar en minut 
	public void timeTick() {
		minutes = minutes + 1;
		
		// minuter blir 60 har det gått en timme. 
		if (minutes == 60) {
			hours = hours + 1;
			minutes = 0;
		}
		
		// om det har gått 24 timmar börjar timmarna om
		if (hours == 24) {
			hours = 0;
		}
		
		checkAlarm();
	}
	
	// kollar ifall larmet ska gå 
	private void checkAlarm() {
		if (alarmOn && minutes==alarmMinute && hours==alarmHour)
			System.out.println("Wake up! Time to go!");
	}
	
	
}