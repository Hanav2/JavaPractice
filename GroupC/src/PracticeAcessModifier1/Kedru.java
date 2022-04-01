package PracticeAcessModifier1;


public class Kedru { //Kedro is protected that means it can be access in class and can be inherited in different package 

	protected int age =28;
	protected int salary=160000;
	protected double bonus =1600;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kedru K1 = new Kedru();
		
		System.out.println(K1.age);
		System.out.println(K1.salary);
		System.out.println(K1.bonus);
		
		Hana K = new Hana();
		System.out.println(K.age);
		System.out.println(K.bonus);
		System.out.println(K.salary);
	}

}
