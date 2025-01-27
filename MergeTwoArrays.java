package BinarySearch;
import java.util.*;
public class MergeTwoArrays {
	public static int[] sortedarray_merge(int[] arr1, int[] arr2, int[] res) {
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
		//when array length is greater than then the length of arr1
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
		int[] arr1 = {2, 12, 21, 60};
		int[] arr2 = {8, 18, 23, 49, 70, 88};
		int[] res = new int[arr1.length + arr2.length];
		int[] ans = sortedarray_merge(arr1, arr2, res);
		System.out.println(Arrays.toString(ans));

	}

}
	