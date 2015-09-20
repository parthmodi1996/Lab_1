package MainPackage;

import java.util.ArrayList;

public class deck extends card {
	public static ArrayList<String> Deck;
	protected deck() {
		ArrayList<String>  Deck = new ArrayList<String>();
		String[] rankof = getRank();
		String[] suitof = getSuit();
		for (int i = 0; i < rankof.length; i++) {
			for (int j=0; j< suitof.length; j++) {
				String elem = rankof[i] + " of " + suitof[j];
				Deck.add(elem);
			}
		}
		for (int j = 0; j< Deck.size(); j++) {
			int index = RandomInt.randInt(0, 51);
			String temp = Deck.get(j);
			Deck.set(j, Deck.get(index));
			Deck.set(index, temp);
			
		}
		System.out.print(Deck);
	}
}
