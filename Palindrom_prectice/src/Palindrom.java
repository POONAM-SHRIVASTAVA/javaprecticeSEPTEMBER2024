import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n =sc.nextInt();
		int t=n;
		int rev=0;
		while(n!=0) {
			rev=rev*10+(n%10);
			n=n/10;
			
		}
		if(rev==t)
			System.out.println(t+"is a palindrom");
		else 
			System.out.println(t+"is  not a palindrom");
	}

	}


