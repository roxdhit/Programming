package MergeSort;
import java.util.*;
public class TwoSameArrays {
	public static boolean check_Arrays(int[] arr1, int[] arr2) {
        // check if both arrays are of the same length
        if (arr1.length != arr2.length) {
            return false;
        }

        // Compare elements of both arrays one by one
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        // If all elements are same, return true
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
       

        System.out.println(Arrays.equals(arr1,  arr2)); //will give true value
        
    }
}
	