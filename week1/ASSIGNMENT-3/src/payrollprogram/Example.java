package payrollprogram;

public class Example {
	public static void main (String[] args)
	{
		long hoursWorked = 40;
		double payRate = 10.0, taxRate = 0.10;
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("pay Amount: " + (hoursWorked * payRate) );
		System.out.println("tax Amount: " + (hoursWorked * payRate * taxRate) );
	}
}


//	Hours Worked: 40
//	pay Amount: 400.0
//	tax Amount: 40.0
//	The program is working perfectly 

//	Modify it so that each variable is declared by itself and is not initialized. 
//	Results: 
// 	The local variable payRate may not have been initialized
//	The local variable hoursWorked may not have been initialized
//	The local variable payRate may not have been initialized
//	The local variable taxRate may not have been initialized

//	Remove one of the declarations from the program. What is the result?
//	For example, delete "long hourseWorked = 40;".
//	Result:
//	hoursWorked cannot be resolved to a variable

//	Remove one of the initializations from the correct program. 
//	For example, delete the characters "= 40" from the 1st declaration. 
//	Result: 
//	The problem is detected in the beginning of running the program.  
//	The local variable hoursWorked may not have been initialized

