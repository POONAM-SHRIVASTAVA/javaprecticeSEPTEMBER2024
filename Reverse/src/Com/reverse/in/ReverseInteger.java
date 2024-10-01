package Com.reverse.in;

import java.util.Scanner;

public class ReverseInteger {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("enter a num:"+num);
		int  rev= 0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
			
		}
		
		System.out.println("reverse is :"+rev);
	}

}
