package finalproject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//Fields 

	private String name;
	
	private int score = 0;

	private List<Card> hand = new ArrayList<Card>();
	
	// Constructor for Players
	
	public Player(String name){
		this.name = name;
	}
	
	// Methods to print out Player and cards in hand 
	
	public void describePlayer() {
		System.out.println(name + ": Cards in hand");
		for (Card card : hand) {
			card.describe();
		}
	}
		
	// Method for Player to flip card from their hand and play it 
	
	public Card flipCard() {
		return hand.remove(0);
}
	
	// Method to draw card from deck and add it to Player's hand
	
	public void dealCard(Deck deck) {
		Card card = deck.drawnCard();
		hand.add(card);
	} 
	
	// Method to award point to Player who wins round 
	
	public void incrementScore() {
		score += 1;
	} 

	//Getters and Setters for fields  
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}



	
}
