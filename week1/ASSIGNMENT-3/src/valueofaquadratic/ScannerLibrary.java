package valueofaquadratic;
import java.util.Scanner;

public class ScannerLibrary {
	public static void main (String[] args)
	{
		double x = 0;
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a value for x ");
		x = input.nextDouble();
		
		double quad = 0;
		quad = (3*Math.pow(x,2)) - (8*x) + 4;
		System.out.println("At X = " + x + " " + "the value is" + " " + quad);
	}
}


//	Result 
//	Please enter a value for x 
//	and we have to type a number
//	we type 3
//	result
//	At X = 3.0 the value is 7.0
