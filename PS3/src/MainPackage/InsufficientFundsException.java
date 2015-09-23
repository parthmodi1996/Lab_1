package MainPackage;

import java.io.*;

public class InsufficientFundsException extends Exception {
	private double account;
	   
	   public InsufficientFundsException(double account)
	   {
	      this.account = account;
	   } 
	   public double getAccount()
	   {
	      return account;
	   }
}
