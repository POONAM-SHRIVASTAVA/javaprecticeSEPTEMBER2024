package com.missing.num;

public class MissingNum {
	public static void main(String arg[]) {
		int a[]= {1,2,3,4,5,7,8,9};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
		int sum1=0;
		for(int j=1;j<10; j++) {
			sum1=sum1+j;
			
		}
		System.out.println(sum1);
		System.out.println("missing num:"+(sum1-sum));
	}

}
