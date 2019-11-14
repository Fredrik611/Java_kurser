/**
 * 
 */
package fa222rw_lab3;
import java.util.*;

import fa222rw_lab3.Card.Suit;
import fa222rw_lab3.Card.Value;
/**
 * @author Fredrik
 *
 */
public class Deck {
	// array list med kortleken och dem utdelade korten
	private ArrayList<Card> deck = new ArrayList<Card>();
	private ArrayList<Card> dealt = new ArrayList<Card>();
	
	// en konstruktor som gör kortleken
	public Deck() {
		for (Value v : Value.values()) {
			for (Suit s : Suit.values()) {
				deck.add(new Card(s,v));
			}
		}

	}
	
	// blandar korten
	public void Shuffle() {
		// går bara om kortleken är full
		if (deck.size() == 52) {
			Collections.shuffle(deck);
		}
		else {
			System.out.println("Deck must be full if you wish to shuffle");
		}
	}
	
	// take out a card from the deck and put in dealt card array and return the value and suit of the card.
	public Card dealCard() {
		Card card = new Card(deck.get(deck.size()-1).getSuit(), deck.get(deck.size()-1).getValue());
		deck.remove(deck.size()-1);
		dealt.add(card);
		return card;
	}
	
	// returns size of dealt cards 
	public int dealtCard(){
		return dealt.size();
	}
	
	// returns size of deckS
	public int getSize() {
		return deck.size(); 
	}

	
}
