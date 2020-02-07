
public class BinarySearch {
	
	public static int search(int[] sorted_arr, int element)
	{
		int loc = sorted_arr.length / 2;
		
		while(sorted_arr[loc] != element)
		{
			if(element > sorted_arr[loc])
				loc = (loc + sorted_arr.length )/ 2;
			else if(element < sorted_arr[loc])
				loc = (loc )/ 2;
		}
		return loc;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println(search(arr, 13));

	}

}
