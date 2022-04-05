package GroupC_Polymorphism;

public class Polymorphism {

	public static double calcArea(int length, int width) {
		
		double rect = length * width;
		return rect; //it will return back to the value and give the result
		}
	
		public double calcArea (int radius) {
			double circleArea = 3.14 * radius * radius;
			return radius;
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism sofi = new Polymorphism();
		
		double rArea = sofi.calcArea(25, 26);
		System.out.println(" Rectangle Area " + rArea);
	
		double cArea = sofi.calcArea(6);
		System.out.println("Circle Area " + cArea);
		
		// System.out.println("Rectangle " + sofi.calcArea(25, 26));
		// System.out.println("Circle " + sofi.calcArea(25));
	
	}

}
