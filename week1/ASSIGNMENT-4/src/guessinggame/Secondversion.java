package guessinggame;
import java.util.Random;
import java.util.Scanner;

public class Secondversion {


	 private static Scanner keyboard;

		public static void main(String[] args) {
	            int secretNumber;
	            secretNumber = (int) (Math.random() * 10 + 1);           
	            keyboard = new Scanner(System.in);
	            int guess;
	            
	            int numberOfTries = 0;
	            boolean win = false; 
	            
	            do {
	            	System.out.print("Enter a guess (1-10): ");
	                guess = keyboard.nextInt();
	            	numberOfTries++;
	            	
	            	if (guess == secretNumber) {
	                  	  System.out.println("Your guess is correct. Congratulations!");
	                      win = true;
	                }
	            	else {  
	            		
	            		if (numberOfTries > 2) {
		            		System.out.println("GAME OVER! The correct number is: " + secretNumber);
		           	}
	           		else if (guess < secretNumber) {
	            			System.out.println("Your guess is smaller than the secret number.");
	                    }
	                    else {
	                        System.out.println("Your guess is greater than the secret number.");	
	                    }
	            	}
	            }
	            while(!win && numberOfTries < 3);

//while (guess != secretNumber); as many times until the user guess the correct number
//
		}
}