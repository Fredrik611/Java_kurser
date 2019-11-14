package fa222rw_lab3;

public class Radio {
	private int volume;
	private int channel;
	private boolean turn;

	public Radio() {
		volume = 1;
		channel = 1;
		turn = false;
	}
	
	// s�tt ig�ng radion
	public void turnOn(){
		turn = true;
	}
	
	// st�nger av radion och �terst�ller inst�llningar
	public void turnOff() {
		turn = false;
		volume = 1;
		channel = 1;
	}
	
	// s�tter volumen inom intervallet [0,5]
	public void setVolume(int volume){
		if(turn && volume >= 0 && volume <= 5)
			this.volume = volume; 
		else 
			System.out.println("Radio off ==> No adjustment possible");
	}
	
	// s�tter channel inom intervallet [1,10]
	public void setChannel(int channel) {
		if(turn && channel > 0 && channel <= 10 )
			this.channel = channel;
		else if(!turn)
			System.out.println("Radio off ==> No adjustment possible");
		else 
			System.out.println("out of range");
	}
	
	// h�mta inst�llningarna 
	public String getSettings() {
		String settings = "Settings: On " + turn + ", Channel " + channel + ", Volume " + volume;
		return settings;
	}
	
	// �kar volymen med 1 s�l�nge volume �r mindre eller lika med 5  
	public void volumeUp() {
		if(turn && volume <= 5) 
			volume++;
		else if(!turn) 
			System.out.println("Radio off ==> No adjustment possible");
		else
			System.out.println("out of range");
	}
	
	// s�nker med volymen med 1 s�l�nge volume �r st�rre eller lika med 0
	public void volumeDown() {
		if(turn && volume > 0) 
			volume--;
		else if(!turn) 
			System.out.println("Radio off ==> No adjustment possible");
		else 
			System.out.println("out of range");
	}
	
	// byter kanal upp�t s� l�nge channel �r mindre eller lika med 10 
	public void channelUp() {
		if(turn && channel <= 10) 
			channel++;
		else if(!turn)
			System.out.println("Radio off ==> No adjustment possible");
		else 
			System.out.println("out of range");
	}
	
	// byter kanal ner�t s� l�nge channel �r mindre 0 
	public void channelDown() {
		if(turn && channel > 0) 
			channel--;
		else if(!turn)
			System.out.println("Radio off ==> No adjustment possible");
		else 
			System.out.println("out of range");
	}
	
}
