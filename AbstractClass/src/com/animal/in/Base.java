package com.animal.in;

abstract class Sunstar{
	abstract void  printInfro(); 
		
	}
class Employee extends Sunstar{
	void printInfro()
	{
		String name="hello";
		int age=21;
		float salary=222.2f;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
}
public class Base  {
	public static void main(String arg[]) {
		Sunstar s = new Employee();
		s.printInfro();
	}

}
