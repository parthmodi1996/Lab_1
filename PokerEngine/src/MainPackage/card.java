package MainPackage;


public class card {
	private static String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private static String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
	protected static String[] getRank() {
		return rank;
	}
	protected static String[] getSuit() {
		return suits;
	}
	protected card() {
	}
}

