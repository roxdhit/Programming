package MergeSort;

public class maxSubarrayOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1, -1, -1, -1, -1, -1};
		int k = 3;
		int max =0;
		int sum1 = 0;
		for(int i =0; i < k; i++) {
			sum1 += arr[i];
			
		}
		max = sum1;
		for(int i = 0; i <= arr.length-k; i++) {
			int sum = 0;
			for(int j = i; j < i+k; j++) {
				sum += arr[j];
			}
			if(sum > max) {
				max = sum;
			}
		}
		System.out.println(max);

	}

}