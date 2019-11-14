package fa222rw_lab3;

public class Play123Main {
	public static void main(String[] args) {
		// Håller koll på hur många som har vunnit 
		int wins = 0;
		// spelar spelet 10000
		for (int i = 0; i < 10000; i++) {
			// true om en har vunnit spelet 
			if (play123()) {
				wins++;
			}
		}
		
		// räknar hur många procent som har vunnit 
		double winProcent = (double) wins/100;
		System.out.print(winProcent + "% av 10000 vann!! ");
	}
	
	public static boolean play123() {
		// skapar ett deck och blandar det
		Deck deck = new Deck();
		deck.Shuffle();
		int cnt = 1;
		// drar kort tills det har dragits 52 kort.
		while (deck.dealtCard() != 52 ) {
			// dra ett kort
			Card card = deck.dealCard();
			// om cnt är samma som kortets valör så är det en förlust
			if (cnt == 1 && card.getValue() == Card.Value.Ace) {
				return false;
			}
			if (cnt == 2 && card.getValue() == Card.Value.Two) {
				return false;
			}
			if (cnt == 3 && card.getValue() == Card.Value.Three) {
				return false;
			}
			// om cnt är 3 återställ cnt till ett
			if (cnt == 3) 
				cnt = 1;
			else
				cnt++;
		}
		// kommer den igenom alla 52 kort så är det en vinst.
		return true;
	}
}
