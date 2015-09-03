
package Grades;
import java.util.Scanner;

public class Average {
	// private static int test1=75;
	// private static int test2=85;
	private static float test1, test2, test3, test4;
	private static float sum=0;
	private static float avg=0;

	public static float sum() {
		// TODO Auto-generated method stub
		sum=(test1+test2)/2;
		return(sum);
	}
	public static float threenumbers(int a, int b, int c) {
			return ((a+b+c))/3;
	}
	public static float  fourezams()
	{
		return ((test1+test2+test3+test4)/4);
	}
	public static void GetNumbers()
	{
		Scanner input=new Scanner(System.in);
		for(int i=1; i<5; i++)
		{
			System.out.println("Give me a test score");
			if(i==1)
			{
				test1=input.nextInt();
			}
			if(i==2)
			{
				test2=input.nextInt();
			}
			if(i==3)
			{
				test3=input.nextInt();
			}
			if(i==4)
			{
				test4=input.nextInt();
			}
		} // closes the for
//	System.out.println(test1+test2+test3+test4);
	}
}


//	Give me a test score
//	50
//	Give me a test score
//	52
//	Give me a test score
//	54
//	Give me a test score
// 	51
//	51.75
