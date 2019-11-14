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
	
	// sätt igång radion
	public void turnOn(){
		turn = true;
	}
	
	// stänger av radion och återställer inställningar
	public void turnOff() {
		turn = false;
		volume = 1;
		channel = 1;
	}
	
	// sätter volumen inom intervallet [0,5]
	public void setVolume(int volume){
		if(turn && volume >= 0 && volume <= 5)
			this.volume = volume; 
		else 
			System.out.println("Radio off ==> No adjustment possible");
	}
	
	// sätter channel inom intervallet [1,10]
	public void setChannel(int channel) {
		if(turn && channel > 0 && channel <= 10 )
			this.channel = channel;
		else if(!turn)
			System.out.println("Radio off ==> No adjustment possible");
		else 
			System.out.println("out of range");
	}
	
	// hämta inställningarna 
	public String getSettings() {
		String settings = "Settings: On " + turn + ", Channel " + channel + ", Volume " + volume;
		return settings;
	}
	
	// ökar volymen med 1 sålänge volume är mindre eller lika med 5  
	public void volumeUp() {
		if(turn && volume <= 5) 
			volume++;
		else if(!turn) 
			System.out.println("Radio off ==> No adjustment possible");
		else
			System.out.println("out of range");
	}
	
	// sänker med volymen med 1 sålänge volume är större eller lika med 0
	public void volumeDown() {
		if(turn && volume > 0) 
			volume--;
		else if(!turn) 
			System.out.println("Radio off ==> No adjustment possible");
		else 
			System.out.println("out of range");
	}
	
	// byter kanal uppåt så länge channel är mindre eller lika med 10 
	public void channelUp() {
		if(turn && channel <= 10) 
			channel++;
		else if(!turn)
			System.out.println("Radio off ==> No adjustment possible");
		else 
			System.out.println("out of range");
	}
	
	// byter kanal neråt så länge channel är mindre 0 
	public void channelDown() {
		if(turn && channel > 0) 
			channel--;
		else if(!turn)
			System.out.println("Radio off ==> No adjustment possible");
		else 
			System.out.println("out of range");
	}
	
}
