class Card {
	int value;
	int suit;
	int index;

	public Card(int value, int suit) {
		this.value = value;
		this.suit = suit;
		this.index = 10 * value + suit;
	}
}

class Player {
	String name;
	int balance;

	public Player(String name, int cash) {
		this.name = name;
		this.balance = cash;
	}

}

class Stack {
	final static int NUM_OF_DECKS = 6;	
	Card[] stack;
	int index;

	public Stack() {
		this.index = -1;
		this.stack = New Card[52 * NUM_OF_DECKS]
		this.init();
	}
	
	private void init() {
		for(int n = 0; n < NUM_OF_DECKS; n++) {
			for(int i = 1; i < 14; i++) {
				for(int j = 1; j < 5; j++) {
					this.stack[++this.index] = Card(i, j);
				}
			}
		}
	}

	public int length() {
		return this.index + 1;
	}

	public Card drawCard() {
		return this.stack[this.index--];
	}

	public void pushCard(Card card) {
		this.stack[++this.index] = card;
	}

	public void discard() {
		this.index--;
	}
}