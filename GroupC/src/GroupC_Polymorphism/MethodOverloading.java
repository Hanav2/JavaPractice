package GroupC_Polymorphism;



public class MethodOverloading {

	
	public double MethodOverloading(int length, int width) {
		double rectArea = length*width;
		return rectArea;
	}
	public double MethodOverloading(int radius) {
		double circleArea=3.14*radius*radius;
		return circleArea;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading m = new MethodOverloading();
		
		double rArea = m.MethodOverloading(25, 26);
		System.out.println("This is rectangle area: " + rArea);
		
		double cArea = m.MethodOverloading(25);
		System.out.println("This is circle area: " + cArea);

	}

}
