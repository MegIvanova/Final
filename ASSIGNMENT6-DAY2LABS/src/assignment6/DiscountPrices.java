package assignment6;
import java.util.Scanner;

public class DiscountPrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 10% discount is applied to purchases over $10. int x that asks for the amount of purchase, then the program calculates the discount price. 
		// display the price in cents as an integer
		
		double x = 0;
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the amount of purchases: ");
		x = input.nextDouble();

		int newprice;
		int discount;
		
		discount = (int) ((x*10)/100);
		newprice = (int)(x-discount);
	  
		
		System.out.println("Discountted price is: "+ newprice + " " + "cents");
		
	}

}
