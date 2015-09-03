package assignment6;
import java.util.Scanner;

public class AreaOfACircle {
	
			     public static void main(String[] args) {
//	This Calculate Circle Area using Java Example shows how to calculate area of circle using it's radius.

		double radius = 0;
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the radius of the circle: ");
		radius = input.nextDouble();
		
        double area = Math.PI * radius * radius;
		System.out.println("Area of the circle with radius "+radius+" is: "+ area);
	}
}

//	result 
//	Please enter the radius of the circle: 3
//	Area of the circle with radius 3.0 is: 28.274333882308138
