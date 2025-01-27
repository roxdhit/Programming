package MergeSort;
import java.util.*;
public class MergeSort_Implementation {
	public static int[] divide(int[] arr) {
		if(arr.length == 1) {
			return arr;
		}
		int mid = arr.length/2;
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];
		for(int i = 0; i < mid ;i++) {
			left[i] = arr[i];
		}
		for(int i = mid; i < arr.length; i++) {
			right[i -mid] = arr[i];
		}
		left = divide(left);
		right = divide(right);
		
		return merge(left, right, arr);
	}

	//merging arrays
	public static int[] merge(int[] arr1, int[] arr2, int[] res) {
		int i =0;
		int  j =0;
		int k =0;
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				res[k] = arr1[i];
				i++;
				k++;
			}
			else {
				res[k] = arr2[j];
				j++;
				k++;
			}
		}
		//when array length is greater than  the length of arr1
		while(i < arr1.length) {
			res[k] = arr1[i];
			i++;
			k++;
		}
		//when array length is greater than the length of arr2
		while(j < arr2.length) {
			res[k] = arr2[j];
			j++;
			k++;
		}
		return res;
		
	}

	public static void main(String[] args) {
		int[] arr = {99, 90, 45, 1, 188, 7, 22, 143};
		int[] res = divide(arr);
		System.out.println(Arrays.toString(res));

	}

}
	
