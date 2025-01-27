package BinarySearch;

public class Binary_Search {
	public static int binary_search(int[] arr, int key) {
		int low =0;
		int high = arr.length-1;
		while(low <= high) {
			int mid = (low+high)/2;
			if(arr[mid] == key) {
				return mid;
			}
			else if(key > arr[mid]) {
				low = mid + 1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}


public static void main(String [] args) {
	int[] arr = {12, 23, 43, 54, 46, 657, 546};
	int key = 46;
	binary_search(arr, key);
	
}
}
	