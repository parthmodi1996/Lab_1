package Poker;
import java.util.Random;

final class RandomInt {
	protected static int randInt(int min, int max) {
		Random someRandomNum = new Random();
		int myNum = someRandomNum.nextInt((max-min)+ 1)+ min;
		return myNum;
	}
}
