package assignment6;
import java.util.Scanner;

public class OrderChecker {

	private static Scanner input;
	private static Scanner input1;
	private static Scanner input2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Order Checker 
	
		double bolts = 0;
		input = new Scanner (System.in);
		System.out.println("Please enter the number of bolts: ");
		bolts = input.nextDouble();
		
		double nuts = 0;
		input1 = new Scanner (System.in);
		System.out.println("Please enter the number of nuts: ");
		nuts = input1.nextDouble();
		
		double washers = 0;
		input2 = new Scanner (System.in);
		System.out.println("Please enter the number of washers: ");
		washers = input2.nextDouble();
		
		int pricebolts = 5;
		int pricenuts = 3;
		int pricewashers = 1;
		
		int totalbolt = (int) (bolts*pricebolts);
		int totalnuts = (int) (nuts*pricenuts);
		int totalwashers = (int) (washers*pricewashers);

		boolean result = false; 	
		
		if( (nuts >= bolts) && (washers >= (2*bolts)) ) {
			result = true;
			System.out.println("Order is OK!"); 
			}	
			else if (washers < (2*bolts) ) {
				result = false;
				System.out.println("Check the Order: too few washers!");	
			}
			else if (nuts < bolts) {
				result = false;
				System.out.println("Check the Order: too few nuts!");
			}
		else  {
				result = true;
				System.out.print("Check the Order: too few washers!" + "Check the Order: too few nuts!");	
			}
					
		
		System.out.println("Total cost: " + (totalbolt + totalnuts + totalwashers) );
	}
}
// if ( washers < (2*bolts) && (nuts < bolts))

