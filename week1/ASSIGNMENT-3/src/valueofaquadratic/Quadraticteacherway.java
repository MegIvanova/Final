package valueofaquadratic;


public class Quadraticteacherway {
	public static void main (String[] args)
	{

		double quad = 0;
		double x =2.0/3;
		quad = (3*x*x) - (8*x) + 4;
		System.out.println("At X = " + x + " " + "the value is" + " " + quad);
	}
}


//	Result 
//	At X = 0.0 the value is 4.0
//	At x = 4.0 the value is 20.0
//	we can re-write this (3*x*x) with (3*Math.pow(x,2))
//	2/3 can be written as 2.0/3 and it will work