package finalproject;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	// Constructors for Deck
	
	public ArrayList<Card> deck;
	
	public Deck() {
		deck = new ArrayList<Card>();
		for (int i = 2; i < 15; i++) {
			Card card = new Card(i, "Diamonds");
			deck.add(card);
		}
		for (int i = 2; i < 15; i++) {
			Card card = new Card(i, "Hearts");
			deck.add(card);
		}
		for (int i = 2; i < 15; i++) {
			Card card = new Card(i, "Spades");
			deck.add(card);
		}
		for (int i = 2; i < 15; i++) {
			Card card = new Card(i, "Clubs");
			deck.add(card);
		}
	}
	
	// Methods to draw card from deck, shuffle deck, and print out each card in deck
	
	public Card drawnCard() {
		Card card = deck.get(0);
		deck.remove(deck.get(0));
		return card;
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public void describe() {
		for (Card card : deck) {
			card.describe();
		}
	}
}