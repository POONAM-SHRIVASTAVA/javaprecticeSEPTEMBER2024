package palindrom.in;

public class PalindromCheck {
	public static boolean checkPalindromString(String input) {
		int left=0;
		int right=input.length()-1;
		 while(left<right) {
			 if(input.charAt(left)!=input.charAt(right)) {
		 
		
		return false;
		
	}
		 left++;
		 right--;
	}
	return true;
}

	public static void main(String[] args) {
		String test="rader";
		if(checkPalindromString(test)) {
			System.out.println(test+"is a palindrom");
		}
		else {
			System.out.println(test+"is not a palindrom");

	}

	}

}
