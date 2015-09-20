package Poker;

public class card {
	private String[] rank = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
	protected String[] getRank() {
		return rank;
	}
	protected String[] getSuit() {
		return suits;
	}
	protected card() {
	}
}

