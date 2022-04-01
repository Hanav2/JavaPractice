package Operators;

public class Ternary_conditionalOperator {

	public static void main(String[] args) {
		
		int a,b,c;
		
		a=30;
		b=20;
		c=(a==1)? 25: 50;
		System.out.println("Value of c is: " + c);
		
		c =(a==30)? 25:50;
		System.out.println("Value of c is: " + c);
		
		c=(b==20)? 25:60;
		System.out.println("Value of c is: " + c);
		
		// If Else statement by Ternary
		
		int d  =120;
		if  (d>100 && d<=150) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
		
		int e = 120;
		String result;
		result = (b>150)? "even number":"odd number";
		System.out.println("number " + result);
		
	}
}



