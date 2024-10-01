package com.array.in;

import java.util.ArrayList;
import java.util.Collections;

public class Smallest {
	public static void main(String arg[]) {
		int[] arr1= {3,5,1,0,2,7,6,10};
		int[] arr2 = {1,2,3};
		int result =find3rdSmallest(arr1,arr2);
		
		if(result !=-1) {
			System.out.println("the 3rd element is :"+result);
			
		}else {
			System.out.println("there are not enough element");
			
		}
	}

	 static int find3rdSmallest(int[] arr1, int[] arr2) {
		ArrayList<Integer>filteredList = new ArrayList<>();
		for(int value:arr1) {
			if(!isInArray(arr2,value)) {
				filteredList.add(value);
				
				
			}
		}
		
		Collections.sort(filteredList);
		if(filteredList.size()>=3) {
			return filteredList.get(2);
			
		}else {
			return -1;
		}
	}

	static boolean isInArray(int[] arr, int value) {
		
		for(int v:arr) {
			if(v==value) {
				return true;
			}
		}
		return false;
	}

}
