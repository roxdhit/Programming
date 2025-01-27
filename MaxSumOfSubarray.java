package MergeSort;

public class MaxSumOfSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-9, -6, 8, 5, -6, -8, 7};
		int max = arr[0];
		int start = 0;
		int end =0;
		for(int i = 0; i < arr.length; i++ ) {
			int sum = 0;
			for(int j = i; j < arr.length; j++) {
				sum += arr[j];
				if(sum > max) {
					max = sum;
					start = i;
					end = j;
				}
			}
		}
		for(int i = start; i <= end; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		System.out.println(max);
		
	}
	}


