package assignment6;
import java.util.Scanner;

public class CentsToDollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		This reads number of cents. The program will write out a number of dollars and cents, like this 324 is 3 dollars and 24 cents 

		double x = 0;
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the cents: ");
		x = input.nextDouble();
		  
		int dollars;
		int cents;
		
	    dollars = (int) (x / 100); // converting to string
	    cents = (int) (x % 100); 
		
		System.out.println("This is: $"+ dollars +"."+ cents + " " + "cents");
	}
}

//	result 
//	Please enter the cents: 324
//	This is $3.24 cents.
