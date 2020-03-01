package com.kth.dd2459;

public class Main {
	
	public static boolean membership(int[] unSorted_arr, int key)
	{
		Sorting sort = new Sorting();
		BinarySearch bSearch = new BinarySearch();
		
		sort.quick_sort(unSorted_arr, 0, unSorted_arr.length);
		
		int index = bSearch.search(unSorted_arr, key);
		if(index >= 0)
		//if(index > 0) //uncomment this line and comment above line for Error Injection
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,5,7,14,1,6,3,12,9,17,11};
		
		System.out.println(membership(arr, 5));
	}

}
