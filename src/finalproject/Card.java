package finalproject;

public class Card {

	// Fields 
	
	private int value;
	private String name;
	
	//Constructor for Card 
	
	public Card(int value, String suit) {
		switch (value) {
		case 2:
			setName("Two");
			break;
		case 3:
			setName("Three");
			break;
		case 4:
			setName("Four");
			break;
		case 5:
			setName("Five");
			break;
		case 6:
			setName("Six");
			break;
		case 7:
			setName("Seven");
			break;
		case 8:
			setName("Eight");
			break;
		case 9:
			setName("Nine");
			break;
		case 10:
			setName("Ten");
			break;
		case 11:
			setName("Jack");
			break;
		case 12:
			setName("Queen");
			break;
		case 13:
			setName("King");
			break;
		case 14:
			setName("Ace");
			break;
		}
		setName(getName() + " of " + suit);
		this.value = value;
	}

	//Describe Card Method 
	
	public void describe() {
		System.out.println("Card name: " + name + "," + " Card value: " + value);
	}

	
	//Getters and Setters 

	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	

	
	
}
