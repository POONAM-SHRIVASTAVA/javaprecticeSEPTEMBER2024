package swapping.string;

public class SwappingString {
	public static void main(String arg[]) {
		String str1="hello";
		String str2="world";
		
		
		System.out.println("Before swapping:");
		System.out.println("str1 is " + str1 + " and str2 is " + str2);
		
		String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("After swapping:");
        System.out.println("str1 is " + str1 + " and str2 is " + str2);
    }

	}


