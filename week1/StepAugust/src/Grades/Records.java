package Grades;

public class Records {

	private static float savegrade;
	private static float exams;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Average.GetNumbers();
		System.out.println(Average.fourezams()); 
		
		
		/* savegrade=Average.sum();
		System.out.println(savegrade);
		exams=Average.threenumbers(50, 75, 100);
		System.out.println(exams);
	*/	
	}

}
