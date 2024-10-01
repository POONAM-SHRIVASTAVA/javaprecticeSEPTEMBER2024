package com.animal.in;

abstract class Subject1 {
Subject1(){//constractor
	System.out.println("Learning Subjects");
	
	
}

abstract void syllabus();//abstract method

void Learn() {//non abstract method
	System.out.println("preparing right now");
	
}
	
}

class It extends Subject1{
	void syllabus() {
		System.out.println("c,java,c++");
		
	}
}

class Cs extends Subject1{
	void syllabus() {
		System.out.println("java ,spring boot");
		
		
	}
	
	
}
class Subject{
	public static void main(String []args) {
		Subject1 x= new It();
		Subject1 v= new Cs();
		x.syllabus();
		x.Learn();
		v.syllabus();
		v.Learn();
	}
}

