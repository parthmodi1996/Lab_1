package Poker;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class pokerTest {

	@Test
	public void test() {
		deck answer = new deck();
		System.out.println(Arrays.deepToString(answer.deck())); 		
	}

}
