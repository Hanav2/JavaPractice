package GroupC_Polymorphism;

public class MultiplyClass {
	
	public int multiply (int a, int b) {
		return a*b;
	}
	
	public double multiply (double a, double b) {
		return a*b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiplyClass m = new  MultiplyClass();
		
		int result1 = m.multiply(25, 25);
		
		int result2 = m.multiply(25, 10);
		
		System.out.println("Total value1 " + result1);
		
		System.out.println("Total value2 " + result2);
		
		System.out.println("\n " );
		
		System.out.println("Total value1 " + m.multiply(25, 10));
		
		System.out.println("Total vlaue2 " + m.multiply(25, 25));
		
		

	}

}
