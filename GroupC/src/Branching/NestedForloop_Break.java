package Branching;

public class NestedForloop_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0; i<=4; i++) {  //the effect of the parent loop is on the repetition of the loop 
			
			for (int j=0; j<=4; j++) {
				
				if (j==3)
				break;
				System.out.print(j);
			
			}
		
		}

	}

}
