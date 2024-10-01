package com.FirstNonRepeatingCharacter.in;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String input =sc.nextLine();
		 
		
		 char  result =FirstNonRepeatingCharacter(input);
		 
		 if(result!='\0') {
			 System.out.println("the first non-repeating charchter"+result);
			 
		 }else {
			 System.out.println("No -non repeatative charchter found");
			 
		 }
	}

	public static char FirstNonRepeatingCharacter(String str) {
		
		for(int i=0;i<str.length();i++) {
			char currentChar=str.charAt(i);
			boolean isRepeated =false;
			
			for(int j=0;j<str.length();j++) {
				
				if(i!=j && str.charAt(i)==str.charAt(i)) {
					isRepeated =true;
					break;
					
				}
			}
			if(!isRepeated) {
				return currentChar;
				
			}
			
		}
		return '\0';
	}

}
