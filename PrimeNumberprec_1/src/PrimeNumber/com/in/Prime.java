package PrimeNumber.com.in;

import java.util.Scanner;

public class Prime {
	public static void main(String arg[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any Number:");
		int n= sc.nextInt();
		System.out.println("prime number between 1to n"+n);
		for(int i=1;i<n;i++)
		{
			boolean isPrime =true;
			for(int j=2;j<i;j++) {
				if(i%j==0)
				{
					isPrime =false;
					break;
					
				}
			}
				if(isPrime)
					System.out.print(i+" ");
			}
		}
	}


