package MergeSort;

public class MountainArray_UsingBruteForce {

	
		public static void main(String[] args) {
			int[] arr = {4, 6, 8, 20, 24, 10, 30, 5, 1};
			for(int i = 1; i < arr.length-1; i++) {
				if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
					return i;
				}
				
			}
			return -1;
		}

	}
