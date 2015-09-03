package valueofexp32;

public class ExponentialExplosion {

	public static void main (String[] args)
	{
		double value= 32;
		System.out.println("e to the power value: " + Math.exp(value ) );
	}
}

// 	double value = 32; => e to the power value: 7.896296018268069E13
//	double value = 32000; => e to the power value: Infinity
//	double value = 12000000000; => error: The literal 12000000000 of type int is out of range 