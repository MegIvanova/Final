package booleanexample;

public class IfandElseComplexConditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testscore=90;
        int attendance=50;
           if(testscore>70 && attendance>=90 )
        { 
        System.out.println("You passed with a grade of" +" " +  testscore);
        
        }
           else if(testscore>70 && attendance <90)
           { System.out.println("You passed the test with a grade of"+ " " +  testscore + " However you missed to many classes, you fail the class." );
           }

	}

}


//	Result 
// 	You passed the test with a grade of 90 However you missed to many classes, you fail the class.