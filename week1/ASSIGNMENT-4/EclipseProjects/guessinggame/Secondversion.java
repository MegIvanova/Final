package guessinggame;
import java.util.Random;
import java.util.Scanner;

public class Secondversion {


	public static void main(String[] args) {
		
		
		Scanner newscanner = new Scanner(System.in); // creates Scanner
		boolean check = false; // boolean value for while loop
		int number, counter = 0; // number will be input, counter keeps track of white loop iterations
		int rng = (int)(Math.random()*10+1); // generates a random number from 1-10
		System.out.println(rng); // prints out the number, used for testing
		
		while(check==false)
		{
			
		if (counter>2) {
			System.out.println("You are out of guesses, you Lose!");
			break; // break exits the while loop
		}
		
			System.out.println("Please pick a number from 1-10");
		number=newscanner.nextInt();
		
		if(number==rng) // if the input number manages random number you win 
		{
			System.out.println("RIGHT! You won the game!");
			check=true;
		}
		
		else if ((number+1==rng) || (number-1==rng)) // if you are 1 number below or above random number you are hot  
		{
			System.out.println("Hot! Try again!");
		}
		else if ((number+2==rng) || (number-2==rng)) // if you are 2 number below or above random number you are worm 
		{
			System.out.println("Warm! Try again!");
		}
		
		else {
			System.out.println("Cold!!"); // if you are any of the above you are cold
		}
		
		counter++; // increments the time through the loop 
		} // closes main
	}
}
