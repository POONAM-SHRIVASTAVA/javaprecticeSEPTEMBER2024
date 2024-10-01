package RemoveWhiteSpaces.in;

import java.util.Scanner;

public class RemoveWhiteSpaces {
public static String removeWhiteSpaces(String input) {
	String output="";
	char [] charArray=input.toCharArray();
	for(char c:charArray) {
		if(!Character.isWhitespace(c)) {
			output +=c;
			
		}
	}
	return output;
}
	public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine(); // Reading input from user

	        String result = removeWhiteSpaces(input);
	        System.out.println("Original: \"" + input + "\"");
	        System.out.println("Without spaces: \"" + result + "\"");

	        sc.close(); // Close the scanner
	    }
	
}

