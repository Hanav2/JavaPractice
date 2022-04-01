package Loops;


//The main difference between while and do-while loop is, in do while loop condition evaluates after executing the loop.

		//Steps:- Initialization, condition,statement, increment 
		//write a program that will print 1 to 10 using do-while loop
		
public class DoWhileLoop {
	// at least it will get to the condition

	public static void main(String[] args) {
	
		int i =1;
		
		do {
			System.out.println(i);
			i++;//this is saying at each step add one
		
		}
		
		while (i<4);
	 //at list it will print one thing because the condition is after the print statement
	} //the loop will stop when the statement is false. 
	
	
}

