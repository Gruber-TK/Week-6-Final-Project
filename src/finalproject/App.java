package finalproject;

public class App {

	public static void main(String[] args) {
		
		//Instantiating Deck and Players 
		
		Deck deck = new Deck();
		
		
		Player playerOne = new Player("Player 1");
		Player playerTwo = new Player("Player 2");
		
		//Calling on shuffle method to shuffle deck
		
		deck.shuffle();
		
		//Calling on dealCard method to deal cards to Player's Hands
		
		for (int i = 0; i < 52; i++) {
			if  (i % 2 == 0) {
				playerOne.dealCard(deck);
			} else {
				playerTwo.dealCard(deck);
			}
		}
		
		//Playing cards and awarding points to winner of each rounds 
		
		
		for (int i = 0; i < 26; i++) {
			System.out.println("Round: " + (i+1));
			Card cardOne = playerOne.flipCard();
			System.out.print("Player 1 Card: ");
			cardOne.describe();
			Card cardTwo = playerTwo.flipCard();
			System.out.print("Player 2 Card: ");
			cardTwo.describe();
			System.out.println("");
			if (cardOne.getValue() > cardTwo.getValue()) {
				playerOne.incrementScore();
				System.out.println("Round " + (i + 1)  + " Winner: " + playerOne.getName());
			} else if (cardTwo.getValue() > cardOne.getValue()){
				playerTwo.incrementScore();
				System.out.println("Round " + (i + 1)  + " Winner: " + playerTwo.getName());
			} else {
				System.out.println("Round " + (i + 1)  + " Winner: Draw - No Points Awarded");
			}
			System.out.println("Current Scores: \n" + playerOne.getName() + " Points: " + playerOne.getScore() + "\n" + playerTwo.getName() + " Points: " + playerTwo.getScore() );
			System.out.println("");
		}
		
		// Printing out winners and scores 
		
		System.out.println("Final Scores:");
		if (playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("Player 1 Score: " + playerOne.getScore() + "\nPlayer 2 Score: " + playerTwo.getScore() + "\nWinner: " + playerOne.getName());
		} else if (playerTwo.getScore() > playerOne.getScore()) {
			System.out.println("Player 1 Score: " + playerOne.getScore() + "\nPlayer 2 Score: " + playerTwo.getScore() + "\nWinner: " + playerTwo.getName());
		} else {
			System.out.println("Winner: Draw");
		}
		
		
		
		
	}

}
