package com.kth.dd2459;

public class Sorting {

	public void bubble_sort(int[] elements) {
		int temp;
		int arr_size = elements.length;

		for (int incr_1 = 0; incr_1 < (arr_size - 1); incr_1++) {
			for (int incr_2 = 0; incr_2 < (arr_size - incr_1 - 1); incr_2++) {
				if (elements[incr_2] > elements[incr_2 + 1]) {
					temp = elements[incr_2];
					elements[incr_2] = elements[incr_2 + 1];
					elements[incr_2 + 1] = temp;
				}
			}
		}
	}

	public int quick_sort_1(int[] elements, int low, int high) {
		int pivot, temp;
		int var_1, var_2;

		pivot = elements[high];

		var_1 = (low - 1);
		for (var_2 = low; var_2 < high; var_2++) {

			if (elements[var_2] <= pivot) {
				var_1++;

				temp = elements[var_1];
				elements[var_1] = elements[var_2];
				elements[var_2] = temp;
			}
		}

		temp = elements[var_1 + 1];
		elements[var_1 + 1] = elements[high];
		elements[high] = temp;

		return var_1 + 1;
	}

	/*
	 * @requires true
	 * 
	 * @ensures (\forall int i,j; 
	 * 			0 <= i & i < j & j < elements.length; 
	 * 			elements[i] <= elements[j]);
	 */
	
	/* \requires A != null
	 * \ensures \forall int i; 0<= i < A.length; \forall int j; 0<= j < A.length; 
	 * 			i <= j => A[i] <= A[j]
	 * 
	 * \ensures \forall int i; 0<= i < A.length-1; A[i] <= A[i+1];
	 * 
	 * & A.length == \old (A).length
	 * \exists permutation : [0 ... A.length-1] -bij-> [0 ... A.length - 1] s.t. A[i] = \old(A) [permutation (i)]
	 */
	public void quick_sort(int[] elements, int low, int high) {
		if (low < high) {
			int pivot = quick_sort_1(elements, low, high);

			quick_sort(elements, low, pivot - 1);
			quick_sort(elements, pivot + 1, high);
		}
	}
	
	public void sort(int[] elements)
	{
		if(elements == null)
			throw new IllegalArgumentException("Array to be sorted can not be null");
			
		quick_sort(elements, 0, elements.length - 1);
	}
	
	public boolean checkSort(int[] elements)
	{
		int i = 0;
		for( i = 0; i < elements.length - 1; i++)
		{
			if(elements[i] <= elements[i+1])
				continue;
			else
				break;
		}
		if(i == elements.length - 1)
			return true;
		else
			return false;
	}
}
