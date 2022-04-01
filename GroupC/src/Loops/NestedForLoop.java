package Loops;

//Nested loops are used to iterate tabular data. It's a loop that is created inside the loop.
public class NestedForLoop {

	public static void main(String[] args) {
		
for (int i=1; i<=5; i++) {
	
	for (int j=1; j<=i; j++) {
		
		System.out.print(j);
	}
	System.out.println(i); //if we take the i out it will take out i and print j value.
}
	}

}
