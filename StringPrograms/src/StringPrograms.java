
//public class StringPrograms {
//
//	public static void main(String[] args) {
//		String original ="Hello,world";
//		String reversed=ReverseString(original);
//		System.out.println("original:"+original);
//		System.out.println("Reversed:"+reversed);
//		
//		
//	}
//
//	private static String ReverseString(String str) {
//		StringBuilder sb = new StringBuilder(str);
//		sb.reverse();
//		return sb.toString();
//	}
//
//}
public class StringPrograms  {
	public static void main(String [] args) {
		String original="hello";
		String reversed=reverseString(original);
		 System.out.println("Original: " + original);
	        System.out.println("Reversed: " + reversed);
	}

	private static String reverseString(String str) {
		String reversed="";
		for(int i=str.length()-1;i>=0;i--) {
			reversed+=str.charAt(i);
		}
		return reversed;
	}
	
}