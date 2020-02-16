package com.kth.dd2459;

import java.util.Random;

public class Main {
	
	public int[] randomNo()
	{
		int[] arr = null ;
		Random rn = new Random();
		int value = rn.nextInt(100);
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = {10,5,7,14,1,6,3,12,9,17,11};
		
		Sorting sort = new Sorting();
		BinarySearch bSearch = new BinarySearch();
		
		sort.quick_sort(arr, 0, arr.length);
		System.out.println(bSearch.search(arr, 5));
	}

}
