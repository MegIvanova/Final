package staticVoidFloat;

public class Floatexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float Average;
        Average=average(50,70);
           if(Average>70)
        { 
        System.out.println("You passed with a grade of" +" " +  Average);
        
        }
              else 
        {
        System.out.println("You failed with a grade of"+ " " +  Average );
        
        }
    
     }
    
    public static float average(int testscore, int testscore2){
    int result;
    result= (testscore+testscore2)/2;
    return result;
        }
	}

//	result
//	You failed with a grade of 60.0
