package Branching;

public class Break_DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		
		do {
			if (i==15) {
				i++;
				
				break;
			}
			System.out.println(i);
			i++;  // on do while this increment plays great role
			
		} while (i<20);
		System.out.println(i);
		
	}

}
// QUESTION FOR SORESA 27