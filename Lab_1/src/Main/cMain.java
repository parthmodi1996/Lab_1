/* Parth Modi 
 * Section-030L
 * Lab-1  */

package Main;

/*Import the required libraries */
import org.apache.poi.ss.formula.functions.FinanceLib;
import java.util.Scanner;

public class cMain {
	public static void main(String[] args) {
		/*Defining the required variables */
		double rate_p;
		double years_r;
		double income;
		double ssi;
		double r_w;
		double n_r;
		double y_r;
		double f;
		boolean t;
		// Instantiate the Scanner class to prompt the user for input //
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Enter the percentage of rate of interest for payback: ");
		rate_p = user_input.nextDouble();
		// While the rate of interest in not in range [0, 3], prompt the user for input again//
		while (rate_p > 3) {
			System.out.println("The rate of interest of payback must be in range [0, 3]");
			System.out.print("Enter the percentage of rate of interest for payback: ");
			rate_p = user_input.nextDouble();
		}
		// Calculate the value needed to put in PV method// 
		r_w = rate_p/(100*12);
		// Prompt the user for input of the required value to calculate PV //
		System.out.print("Enter the years of retirement: ");
		years_r = user_input.nextDouble();
		n_r = years_r*12;
		System.out.print("Enter the amount of required income: ");
		income = user_input.nextDouble();
		System.out.print("Enter the amount of monthly SSI: ");
		ssi = user_input.nextDouble();
		// Calculate the values to enter in PV method //
		y_r = income - ssi;
		f = 0;
		t = false;
		
		double PV;
		//Calculate PV using FinanceLib.pv //
		PV = FinanceLib.pv(r_w, n_r, y_r, f, t);
		System.out.printf("The amount of money you need to save is $%,.2f", (PV*-1));
		
		// Create variables to calculate PMT //
		double rate_i;
		double r_i;
		double years_w;
		double n_w;
		double p;
		
		System.out.print("\nEnter the percentage of rate of interest for investment: ");
		rate_i = user_input.nextDouble();		
		// Keep prompting user for input until the rate of interest is in range [0, 20] //
		while (rate_i >20) {
			System.out.println("The rate of interest of investment must be in range [0, 20]");
			System.out.print("Enter the percentage of rate of interest for investment: ");
			rate_i = user_input.nextDouble();
		}
		
		r_i = rate_i/(100*12);
		
		// Prompt the user for remaining required values to calculate PMT //
		System.out.print("Enter the years of work: ");
		years_w = user_input.nextDouble();
		n_w = years_w*12;
		p = 0;
		
		double PMT;
		// Calculate PMT using FinanceLib.pmt //
		PMT = FinanceLib.pmt(r_i, n_w, p, PV, t);
		System.out.printf("The payment value is $%,.2f", PMT);
		
	}
}