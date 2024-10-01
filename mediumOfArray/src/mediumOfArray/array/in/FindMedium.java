package mediumOfArray.array.in;

import java.util.Arrays;

public class FindMedium {
	public static double findMedium(int [] arr)
	{	Arrays.sort(arr);
	
	if(arr.length%2!=0)

	{
		return arr[arr.length / 2];

	}else  
	{
		int mid1=arr[arr.length/2];
		int mid2=arr[(arr.length/2)-1];
		return (mid1+mid2)/2.0;
		
	}

}



public static void main(String arf[]) {
	int [] arr= {1,2,3,4,5,6,7,8};
	double medium =findMedium(arr);
	System.out.println("The median is: " + medium);
}
}