package fa222rw_lab3;

public class MultiDisplay {
	
	private String msg;
	private int cnt;
	private int temp;
	
	// Konsturktor 
	public MultiDisplay() {
		msg = "";
		cnt = 0;
	}
	
	// bestäm meddelande och hur många gånger meddelandet ska skrivas ut
	public void setDisplayMessage(String msg){this.msg = msg;}
	public void setDisplayCount(int cnt) {this.cnt = cnt;}
	
	// får tillbaka displplay message
	public String getDisplayMessage() { return msg;}
	
	// skriv ut meddelandet i consolen
	public void display() {
		temp = cnt;
		while(temp > 0){
		System.out.println(msg);
		temp--;
		}
	}
	
	// samma som föregående fast skriver ut med parametrarna 
	public void display(String msg, int cnt) {
		this.msg = msg;
		this.cnt = cnt;
		while(cnt > 0){
			System.out.println(msg);
			cnt--;
		}
	}
}
