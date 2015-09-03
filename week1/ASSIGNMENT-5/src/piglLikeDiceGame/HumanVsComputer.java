package piglLikeDiceGame;
import java.util.*;

public class HumanVsComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	 
		    
		         
		        Random rand = new Random();
		        Scanner scan = new Scanner(System.in);
		         
		        System.out.println("WELCOME to the PIG-like DICE Game! HUMAN vs COMPUTER");
		        System.out.println("Both players start off with zero points.");
		        System.out.println("In each round, the computer rolls first, followed by the human player.");
		        System.out.println("The computer rolls three dice and the sum of spots is added to its score.");
		        System.out.println("First player to 100 points or more wins");
		        System.out.println("How many rounds?");
		        int numOfRounds = scan.nextInt();
		         
		        int round = 1;
		        int compScore = 0;
		        int playerScore = 0;
		        int compToss = 0;
		        int playerToss = 0;
		        int pRound = 0;
		        int cRound = 0;
		         
		        while(round <= numOfRounds){
		            compScore = 0;
		            playerScore = 0;
		            compToss = 0;
		            playerToss = 0;
		             
		            while(!(compScore >= 100 || playerScore >= 100)){
		                System.out.println("Computers turn");
		             
		                int roll1 = rand.nextInt(6)+1;
		                int roll2 = rand.nextInt(6)+1;
		                int roll3 = rand.nextInt(6)+1;
		                compToss = roll1 + roll2 + roll3;
		                compScore = compScore + compToss;
		             
		                System.out.println("Computer rolled a " +roll1+ ", " +roll2+ ", and " + roll3);
		                System.out.println("Computer score is now: " + compScore);
		                 
		                 
		                System.out.println("Players turn");
		                System.out.print("Press any button to roll: ");
		                String x = scan.next();
		                 
		                if(x.equals("x")){
		                    playerToss = rand.nextInt(6)+1;
		                }
		                System.out.println("Player rolled a " + playerToss);
		                 
		                while(playerToss != 1){
		                    playerScore = playerScore + playerToss;
		                    System.out.println("Player score is now: " + playerScore);
		                     
		                    System.out.print("Press any button to roll or \'end\' to end turn: ");
		                    x = scan.next();
		                    if(x.equals("end")){
		                        break;
		                    }else{
		                        playerToss = rand.nextInt(6)+1;
		                    }
		                    System.out.println("Player rolled a " + playerToss);
		                }
		                 
		                if(playerToss == 1){
		                    playerScore = 0;
		                    System.out.println("Player got a 1. Score reset to 0");
		                }
		                 
		                System.out.println("Players turn is over. Computers turn");
		            }
		             
		            if(compScore > playerScore){
		                System.out.println("Computer is the winner!");
		                cRound++;
		            }else{
		                System.out.println("Player is the winner!");
		                pRound++;
		            }
		            round++;
		        }
		        System.out.println("---- Final Score ----");
		        System.out.println("Computer:  " + cRound + "   Player:  " + pRound);
		    }
}
