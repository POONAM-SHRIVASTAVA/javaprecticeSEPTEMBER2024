package com.Amstrong.com;

import java.util.Scanner;

public class Amstrong {
	public static void main(String []arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the check number:");
		int num = sc.nextInt();
		if(isArmstrong(num)) {              
			System.out.print(num+"is an Armstrong number");
			
			
		}else {
			System.out.println(num+"is not an Armstrong number");
			
		}
	sc.close();
}
	

	 static boolean isArmstrong(int num) {
		int sum =0,temp=num;
		int len=String.valueOf(num).length();
		//loop to calculate the sum of digit raised to 
		while(temp!=0){
			int digit = temp%10;
			sum+=Math.pow(digit, len);
			temp/=10;
			
		}
		return num==sum;
	}

}
