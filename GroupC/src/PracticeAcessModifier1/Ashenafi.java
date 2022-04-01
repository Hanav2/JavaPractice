package PracticeAcessModifier1;

public class Ashenafi {  // This is private access modifier we can call it in the class but it's private for outside
	
	private int age = 24;       //If we try to create an object in another class but the same package it doesn't work because it is private
	private int salary= 170000;
	private double bonus= 60000;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ashenafi a = new Ashenafi();
		
		System.out.println(a.age);   //to print we have to add the reference variable (a.age)
		System.out.println(a.salary);
		System.out.println(a.bonus);
		
		
		System.out.println("\n");
		
		Ruth r = new Ruth();   //since ruth is public she can be accessed to all classes in the same package 
		System.out.println(r.age);   
		System.out.println(r.salary);
		System.out.println(r.bonus);
	}

}
