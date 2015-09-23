package MainPackage;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	
	Account myTest;
	
	@Before
	public void setUp() throws Exception {
		myTest = new Account(1112, 20000);
	}

	@After
	public void tearDown() throws Exception {
		myTest = null;
	}

	@Test 
	public void test() throws InsufficientFundsException {
		myTest.setAnnualInterestRate(4.5);		
		myTest.withdraw(2500);
		assertEquals("Withdraw Test", (long)myTest.getBalance(), (long)17500.00);
		myTest.deposite(3000);
		assertEquals("Deposit Test", (long)myTest.getBalance(), (long)20500.00);
		Date myDate = myTest.getDateCreated();
		System.out.printf("The monthly interest rate is %.2f%%, current balance is $%.2f, the date account is %s", myTest.getMonthlyInterestRate(), myTest.getBalance(), myDate);
	}	
	
	@Test (expected = InsufficientFundsException.class)
	public final void withdraw_more() throws InsufficientFundsException {
		myTest.withdraw(300000);
	}
}
