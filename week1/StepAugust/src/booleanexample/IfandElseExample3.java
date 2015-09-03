package booleanexample;

public class IfandElseExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testscore=50;
        if(testscore>70)
     { 
     System.out.println("You passed with a grade of" +" " +  testscore);
     
     }
        else if(testscore<=50)
        { System.out.println("You failed with a grade of"+ " " +  testscore + " and   	You need Tutoring" );
        }
        else 
     {
     System.out.println("You failed with a grade of"+ " " +  testscore );
     
     }

	}

}

//	result
// 	You failed with a grade of 50 and   	You need Tutoring
