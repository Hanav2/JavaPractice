package PracticeAcessModifier2;

import PracticeAcessModifier1.Kedru; // we import kedro because it is in diffrent package and we are using inheritance because it is public.

import PracticeAcessModifier1.Ruth;// we need to import class Ruth because ruth is in different package 

public class CraftStudents extends Kedru { //inheritance 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CraftStudents cra = new CraftStudents(); //since we inherited from kedro we create an object using Craftstudents. 
		
		System.out.println(cra.age);
		System.out.println(cra.salary);
		System.out.println(cra.bonus);
		
		System.out.println("\n");
		
		Ruth c = new Ruth();
		System.out.println(c.age);
		System.out.println(c.salary);
		System.out.println(c.bonus);
	
	}

}
