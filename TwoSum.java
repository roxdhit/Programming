package Arrays;
import java.util.*;
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return true;
                }
            }
        }
        return false; // No solution found   
        }

            
public static void main(String[] args) {
	int[] nums = {0, -1, 2, -3, 1};
    int target = -2;
    int[] result = twoSum(nums, target);
    
    System.out.println();
}
	
}


