/**
 * 
 */
package fa222rw_lab3;

/**
 * @author Fredrik
 *
 */
public class DeckMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deck deck = new Deck();
		//blandar kortleken
		deck.Shuffle();
		
		System.out.println("Dealing out cards");
		System.out.println("____________________");
		
		// delar ut kort
		for (int i = 0; i < 10; i++) {
			System.out.println(deck.dealCard().toString());
		}
		System.out.println("____________________");
		System.out.println("Dealt cards: " + deck.dealtCard());
		System.out.println("Cards left in the deck: " + deck.getSize());
		
	}

}
