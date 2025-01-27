package Recursion;

public class ArmstrongNumber {
	public static int count_digit(int num,  int count) {
		if(num == 0) {
			return count;
		}
		return count_digit(num/10, count += 1);
	}

	public static int check_arm(int num, int digit, int res) {
		if(num == 0) {
			return res;

		}
		return check_arm(num/10, digit, res + (int)Math.pow((num % 10), digit));
	}
	
	public static void main(String[] args) {
		int num = 153;
		int digit = count_digit(num, 0);
		int res = check_arm(num, digit, 0);
		if(num == res) {
			System.out.println("arm");
		}
		else {
			System.out.println("not");
		}

	}

}
	
