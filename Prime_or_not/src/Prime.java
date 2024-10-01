import java.util.Scanner;

public class Prime {
public static void main(String arg[]) {
	
	System.out.println("enter number");
	Scanner sc = new Scanner(System.in) ;
	int n= sc.nextInt();
	int i;
	if(n==1) {
		System.out.println("prime starts from 2");
		
	}
		for(i=2;i<n;i++) {
			if(n%i==0)
				System.out.println("not a prime");
			break;
			
				
		
			if (n==i) 
			System.out.println("prime");
		
	
}
}
