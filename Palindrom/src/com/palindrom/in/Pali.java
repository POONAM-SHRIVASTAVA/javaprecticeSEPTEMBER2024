package com.palindrom.in;

public class Pali {
	public static boolean checkPalindromString(String input) {
		
	
int length = input.length();
for(int i=0;i<=length/2;i++) {
	if(input.charAt(i)!=input.charAt(length-i-1)) {
		return false;
	}
}
	return true;
	}
	public static void main(String[] args) {
		String test="madam";
		boolean isPalindrom=checkPalindromString(test);
		System.out.println(test+"is a palindrome :"+isPalindrom);
	}

	}


