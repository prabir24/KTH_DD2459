package com.kth.dd2459;

public class BinarySearch {

	/*
	 * @requires (\forall int i,j; 
	 * 			 0 <= i & i < j & j < elements.length;
	 * 			 elements[i] <= elements[j]);
	 * 
	 * @ensures true | false
	 */
	public boolean search(int[] sorted_arr, int element) {
		int left = 0;
		int right = sorted_arr.length - 1;
		int loc = (left + right) / 2;

		while (sorted_arr[loc] != element && left < right) {
			if (element > sorted_arr[loc]) {
				left = loc + 1;
				loc = (left + right) / 2;
			} else if (element < sorted_arr[loc]) {
				right = loc - 1;
				loc = (left + right) / 2;
			}
		}
		if (sorted_arr[loc] == element)
			return true;
		else
			return false;
	}
}
