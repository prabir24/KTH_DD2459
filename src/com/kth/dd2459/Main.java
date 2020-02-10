package com.kth.dd2459;

public class Main {
	
	

	public static void main(String[] args) {
		
		int[] arr = {10,5,7,14,1,6,3,12,9,17,11};
		
		Sorting sort = new Sorting();
		BinarySearch bSearch = new BinarySearch();
		
		sort.quick_sort(arr, 0, arr.length);
		System.out.println(bSearch.search(arr, 5));
	}

}
