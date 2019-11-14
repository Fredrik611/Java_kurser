/**
 * 
 */
package fa222rw_lab3;

/**
 * @author Fredrik
 *
 */
public class Card {
	// två enum med de olika värdena
	public static enum Suit{Clubs , Diamond, Hearts, Spades};
	public static enum Value{Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King};
	
	private Suit suit;
	private Value value;
	
	// en konstruktor som sätter värdena 
	public Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}

	// Skriver ut en string
	public String toString() {
		String str = value + " of " + suit;
		return str;
		
	}
	// hämta värdena på korten
	public Value getValue() {return value;}
	public Suit getSuit() {return suit;}
}
