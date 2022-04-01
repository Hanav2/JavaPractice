package GroupC_Method;

public class Methods {

	double width;
	double height;
	double depth; 

		int a= 10;
		int b =15;
		int c =20;
		
		
	public double calcVolume(double w, double h, double d) {
		double volume;
		volume =width * height * depth;
		return volume;
		
	}
		public void calcVolume() {
			
			int val = a * b* c;
			System.out.println(val);
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods m = new Methods();
		m.calcVolume();
		
		
		double width =50;
		double height =10;
		double depth =5;
		
		double volume = width * height * depth;
		System.out.println(volume);
		
		
		}
	}


