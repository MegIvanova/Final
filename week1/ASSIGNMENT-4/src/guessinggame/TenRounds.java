package guesssing;
import java.util.Scanner;

public class TenRounds {

		    private static Scanner keyboard;

			public static void main(String[] args) {
		            int secretNumber;
		            secretNumber = (int) (Math.random() * 10 + 1);           
		            keyboard = new Scanner(System.in);
		            int guess;
		            
		            int numberOfrounds = 1; 
		            int numberOfwins = 0;

		            int numberOfTries = 0;
		            boolean win = false; 
		            
		      do {
		            System.out.println("Round " + numberOfrounds);
		           // System.out.println("\n");
		            numberOfrounds++;
		            
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
		            System.out.println("\n");
		      }
		      while(numberOfrounds < 10);
		      System.out.println("You have won " + numberOfwins + " " + "out of" + " " + numberOfrounds + " " + "rounds.");
			}
	}

		         