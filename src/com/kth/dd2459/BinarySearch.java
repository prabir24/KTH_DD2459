package com.kth.dd2459;

public class BinarySearch {

	public int search(int[] sorted_arr, int element) {
		int left = 0;
		int right = sorted_arr.length - 1;
		//int right = sorted_arr.length - 2; // Uncomment this and comment above line fr error injection 
		int loc = (left + right) / 2;

		while (sorted_arr[loc] != element && left < right) {
			if (element > sorted_arr[loc]) {
				left = loc + 1;
				//left = loc + 2; // Uncomment this and comment above line fr error injection
				loc = (left + right) / 2;
			} else if (element < sorted_arr[loc]) {
				right = loc - 1;
				loc = (left + right) / 2;
			}
		}
		if (sorted_arr[loc] == element)
			return loc;
		else
			return -1;
	}
	
	public boolean membership(int[] sorted_arr, int key)
	{
		int index = search(sorted_arr, key);
		if(index >= 0)
		//if(index > 0) //uncomment this line and comment above line for Error Injection
			return true;
		else
			return false;
	}
}
