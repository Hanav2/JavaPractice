package Loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( " for simple statement");
		
		
		for (int x=1; x<=10; x++) {
			System.out.println(x);
		}
		
		System.out.println( " for with arthimetic operators");
		
		
		int n, i;
		n=3;  // for this case n is constant but i keep increasing by one and multiply with n to get the result.
		for (i=1; i<=10; i++) {
			System.out.println("total value: " + n*i);
			
		}
		
		System.out.println( " For loop Even Number");
		
	for (int a=0; a<=30; a++) {
		if (a%2 ==0) { //this will print even number
			System.out.println(a);
		}
	}
		System.out.println( " For loop Odd Number");
		
		
		for (int b=0; b<=30; b++) {
			if (b%2 ==1) { //this will print odd number
				System.out.println(b);
			}
		
	}
	}
}
