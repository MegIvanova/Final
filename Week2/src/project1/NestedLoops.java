package project1;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<11;i++)
		{
		System.out.println(i);
		for(int j=0;j<10;j=j+2)
			{
	  System.out.println(j);
			}
		}
	}

}


//	result
// 0 0 2 4 6 8 1 0 2 4 6 8 2 0 2 4 6 8 3 0 2 4 6 8 4 0 2 4 6 8 5 0 2 4 6 8 6 0 2 4 6 8 7 0 
// error because it keeps initializing 2 4 6 8 8 0 2 4 6 8 9 0 2 4 6 8 10 0 2 4 6 8

// it keeps repeating starting from 0, 1, 2, 3, 4, 5 , 6, 7, 8, 9, 10 
