package groupC_FormofClass;

public class Box {

	double width =25;
	double height =20;
	double depth =10;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b = new Box();
		System.out.println(b.width);
		System.out.println(b.height);
		System.out.println(b.depth);
	
		Box b1 = new Box();
		
		b1.width =35;
		b1.height = 15;
		
		System.out.println("\n");
		System.out.println(b1.width);
		System.out.println(b1.height);
		System.out.println(b1.depth);
	
	}

}
