
public class Sorting {

	public static void bubble_sort(int[] elements) {
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

	public static int quick_sort_1(int[] elements, int low, int high) {
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

	public static void quick_sort(int[] elements, int low, int high) {
		if (low < high) {
			int pivot = quick_sort_1(elements, low, high);

			quick_sort(elements, low, pivot - 1);
			quick_sort(elements, pivot + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] elements = { 10, 16, 8, 12, 1, 15, 6, 3, 9, 5 };
		bubble_sort(elements);
		//quick_sort(elements, 0, elements.length - 1);
		for (int i = 0; i < elements.length; i++)
			System.out.print(elements[i] + " ");
	}
}
