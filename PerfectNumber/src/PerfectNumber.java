import java.util.Scanner;

public class PerfectNumber {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int sum=1;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				sum=sum+i;
			
		}
		if(sum==num)
		{
			System.out.println(num+"is a perfect");
			
		}else
			System.out.println(num+"is not aperfect number");
		
	}

}
