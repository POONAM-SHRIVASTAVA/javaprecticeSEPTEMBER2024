package com.Amstrng.in;

public class Amst {
public static void main(String []args) {
	int num = 407;
	if(isArmstrong(num)) {
		System.out.println(num+"is an Armstrong ");
		
		
	}else {
		System.out.println(num+"is not an Armstrong");
		
	}
}

 static boolean isArmstrong(int num) {
	int originalNum=num;
	int sum=0;
	
	
	while(num>0) {
		int digit =num%10;
		sum+= digit*digit*digit;
		num/=10;
		
	}
	return sum == originalNum;                                                                                       v  c;
	
}
}
