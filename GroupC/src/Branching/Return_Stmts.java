package Branching;

public class Return_Stmts {
	public static void main(String[] args) {

		for (int i=26; i<34; i++) {
			
			new Return_Stmts().checkEven(i);
		}
	}
		
	public boolean checkEven(int a) {
		
		if (a%2 == 0) {
			
			System.out.println("Even Number" + a);
			return true;
		}
		System.out.println("Odd Number"+ a);
		return false;
	}


}
// Question please explain this for us