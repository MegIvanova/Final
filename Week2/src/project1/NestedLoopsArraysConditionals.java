package project1;

public class NestedLoopsArraysConditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This sample code creates a two dimensional array and populates each field 
	       	
			int j=0;  // keeps track of column position
	       	int k=0;  //this variable is what we are populating the array with
	        int[][] multD = new int[5][10];
	        for(int i=0;i<5;i++)
	        {   
	        if(j>0)
	        {k--;
	        }
	           j=0;
	        multD[i][j]=k; //store the value of k inside multidimensional array
	        System.out.println(multD[i][j]);
	        k++;
	        for(j=0;j<10;j++)
	        {
	        multD[i][j]=k;
	        System.out.println(multD[i][j]);
	        k++;
	        } 

	}// closes for loop 
	        
	     //   System.out.println(multD[4][8]); // after everything is finished prints 49 
	     //   System.out.println(multD[5][8]);  // its from 0-4, we requested 5 so error is logical
	        System.out.println(multD[2][8]); // after everything is finished prints 29 
	} // closes static void main
} // closes class


//	result 
//	0 1 .... 10 10 ....... 20 20 ..... 30 30 ........ 40 40 ...... 50
