package If_Statements;

public class Nested_If {

	public static void main(String[] args) {
		
		int age = 30;
		int weight =85;
		
		if (age >=25) {   //Eg: of nested if with two conditions
			
			if (weight <= 50) {
				System.out.println("qualified");
			}
		
		else if (age>=25 && weight>=80) {   //If we put the else if block inside the parent if it will print the else if result
			System.out.println("second ");
		}
		}
		else {
			System.out.println("not q");
		}
	}

}
