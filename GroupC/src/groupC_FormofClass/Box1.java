package groupC_FormofClass;

public class Box1 {
	
	double width =25;
	double height =20;
	double depth =10;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box1 b = new Box1();
		
		b.width = 400;
		b.height = 20;
		b.depth = 10;

		double volume; //it must be in the main method
		volume = b.width * b.height * b.depth;  //we use volume if we want to calculate different values. 
		
		System.out.println("Total Volume: " + volume); //we can use different algorithm 
	}

}
