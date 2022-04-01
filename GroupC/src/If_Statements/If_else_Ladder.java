package If_Statements;

public class If_else_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks =55;
		if (marks >= 60 && marks<=70) {
			
			System.out.println("grade D");
			
		}
		else if (marks>= 70 && marks<=80) {
			System.out.println("grade C");
		}
		else if (marks >= 80 && marks<=790) {
			System.out.println("grade B");
		}
		else if (marks >= 90 && marks<=100) {
			System.out.println("grade A");
		}
		else {
			System.out.println("Fail");
		}
	}

}
