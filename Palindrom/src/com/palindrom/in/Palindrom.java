package com.palindrom.in;

import java.util.Scanner;

public class Palindrom {
public static void main(String arg[]) {
	Scanner sc = new Scanner(System.in) ;
		System.out.print("enter a number a check if its a number:");
		
	
		int num = sc.nextInt();
	
	 int reverse=0,rem,temp;
	 temp=num;
	 while(temp!=0) {
		 rem=temp%10;
		 reverse = reverse*10+rem;
		 temp/=10;
	 };
		 
		 if(num==reverse)
			 System.out.println(num+"is palindrom");
		 else
			 System.out.println(num+"is not Palindrom");
		 
		
		 
	 }
	}


