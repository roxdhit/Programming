package LinearSearch;

public class Linear_Search {
	public static int linearSearch(int[] arr, int key) {
		for(int i = 0; i < arr.length; i++ ) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {12, 34, 45, 65, 76, 68, 89};
		int key =45;
		int index = linearSearch(arr, key);
		System.out.println(index);

	}

}
	
