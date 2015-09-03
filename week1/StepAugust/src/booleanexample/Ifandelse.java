package booleanexample;

public class Ifandelse {
	public static void main(String[] args) {
		
		boolean rain = true;
		boolean snow = true;
		
		if (rain == true) {
			System.out.println("I need a raincoat.");
		}
		else if (snow == true) 
			System.out.println("I need a winter coat.");
		
		else {
			System.out.println("Sunny.");
		}
	} // closes main
} // closes class


//	if there is ONLY 1 line we DON'T need { } 
// 	result
//	I need a raincoat. 
//	if we change rain=false => result is I need a winter coat.
//	if we change rain=false and snow=false => result is Sunny.
