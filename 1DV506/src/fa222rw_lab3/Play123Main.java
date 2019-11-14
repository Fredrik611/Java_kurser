package fa222rw_lab3;

public class Play123Main {
	public static void main(String[] args) {
		// H�ller koll p� hur m�nga som har vunnit 
		int wins = 0;
		// spelar spelet 10000
		for (int i = 0; i < 10000; i++) {
			// true om en har vunnit spelet 
			if (play123()) {
				wins++;
			}
		}
		
		// r�knar hur m�nga procent som har vunnit 
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
			// om cnt �r samma som kortets val�r s� �r det en f�rlust
			if (cnt == 1 && card.getValue() == Card.Value.Ace) {
				return false;
			}
			if (cnt == 2 && card.getValue() == Card.Value.Two) {
				return false;
			}
			if (cnt == 3 && card.getValue() == Card.Value.Three) {
				return false;
			}
			// om cnt �r 3 �terst�ll cnt till ett
			if (cnt == 3) 
				cnt = 1;
			else
				cnt++;
		}
		// kommer den igenom alla 52 kort s� �r det en vinst.
		return true;
	}
}
