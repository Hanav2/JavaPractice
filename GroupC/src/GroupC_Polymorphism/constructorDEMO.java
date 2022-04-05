package GroupC_Polymorphism;

public class constructorDEMO {
	
	double width;
	double height;
	double depth;
	

	  constructorDEMO(){
		width=5;
		height =10;
		depth =3;
		
	}

	 constructorDEMO(double w, double h, double d){
		width = w;
		height = h;
		depth= d;
		
	}

	double volume () {
		return width * height* depth;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorDEMO b1 = new constructorDEMO ();
		constructorDEMO  b2 = new constructorDEMO (15,25,10);
		
		//double c = b1.constructorDEMO(15,13,12);
		System.out.println(b1.volume());
		System.out.println(b2.volume());
		
	}

}
