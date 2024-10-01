package com.animal.in;

abstract class Animal1{
	Animal1(){// this is a abstract class constractor it is use for all sub class constratutor 
		System.out.println("All animals");
	}
	public abstract void sound();
	
	
}
class Dog extends Animal1{
	Dog()
	{
		super();
		
	}
	public void sound() {
		System.out.println("Dog is barking");
	}
}

class Lion extends Animal1
{
	Lion(){
		super();
		
	}
	public void sound() {
		System.out.println("lion is Raor");
	}
}

public  class Animal {
	public static void main(String arg[]){
		Dog d= new Dog();
		Lion l= new Lion();
		d.sound();
		l.sound();
		
	}

}
