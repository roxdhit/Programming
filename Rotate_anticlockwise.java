package BinarySearch;
import java.util.*;
public class Rotate_anticlockwise {
	public static void r_anti(int[] arr) {
		int temp = arr[0];
		for(int i = 1; i < arr.length; i++ ) {
			arr[i -1] = arr[i];
		}
		arr[arr.length - 1] = temp;

	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 43, 54, 67};
		for(int i =1; i <= 4500; i++) {
		r_anti(arr);
	}
	System.out.println(Arrays.toString(arr));

}
}