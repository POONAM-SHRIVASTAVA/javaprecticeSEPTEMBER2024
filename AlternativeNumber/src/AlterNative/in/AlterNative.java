package AlterNative.in;

public class AlterNative {
public static void AlterNativeNumber(int [] arr) {
	System.out.println("Alternate numbers in the array:");
	
	for(int i=0;i<arr.length;i+=2) {
		System.out.println(arr[i]+" ");
		}
}
public static void main(String [] arg) {
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	AlterNativeNumber(arr);

}
}
