package Poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class deck {
	protected static String[][] deck() {
		card cardList = new card();
		final String[] rankof = cardList.getRank(); // Using getter//;
		final String[] suitof = cardList.getSuit(); // Using Getter//;
		String[][] masterList = new String[rankof.length][suitof.length];
		for (int i = 0; i < rankof.length; i++) {
			for (int j = 0; j < suitof.length; j++) {
				String elem = rankof[i] + " of " + suitof[j];
				masterList[i][j] = elem;
			}
		}
		int i, j;
		i = RandomInt.randInt(0, masterList.length-1);
		j = RandomInt.randInt(0, masterList[i].length-1);
		while (masterList[i][j] == "") {
			i = RandomInt.randInt(0, masterList.length-1);
			j = RandomInt.randInt(0, masterList[i].length-1);
		}
		System.out.println("The lucky card is: " + masterList[i][j]);
		masterList[i][j] = masterList[i][j].replace(masterList[i][j], "");
		return masterList;
		//System.out.print(Arrays.deepToString(masterList));//
	}
	static String[][] newList = deck();
	protected static String[][] draw() {
		System.out.println(Arrays.deepToString(newList));
		return newList;	
	}
/*	protected static String[][] cardList() {
		for (int i = 0; i < rankof.length; i++) {
			for (int j = 0; j < suitof.length; j++) {
				String elem = rankof[i] + " of " + suitof[j];
				masterList[i][j] = elem;
			}
		}
		System.out.print(Arrays.deepToString(masterList));
		return masterList;
	}	*/

}
