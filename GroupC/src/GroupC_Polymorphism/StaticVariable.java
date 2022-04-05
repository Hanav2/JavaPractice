package GroupC_Polymorphism;

public class StaticVariable {
	
	public static String city= "DC";
	String name = "Hana";
	int age= 27;
	

	public static void main(String[] args) {
		
		// Referring to variable without creating object
		//System.out.println("city: " + city);
		//System.out.println("name: " + name);
		
		// If the variable is not a static variable we need to create an object and call it.
		
		StaticVariable s = new StaticVariable();
		
		s.city= "LA";
		s.name= "Eyobe";
		s.age=30;
		
		System.out.println("name " + s.city);
		System.out.println("name " + s.name);
		System.out.println("name " + s.age);
		
		
		System.out.println("\n");
		
		StaticVariable h = new StaticVariable();
		System.out.println("name " + h.city);
		System.out.println("name " + h.name);
		System.out.println("name " + h.age);
		
	}

}
