package Recursion;

public class Count {
	public static int rec_digit(int num, int count) {
		if(num == 0) {
			return count;
		}
		return rec_digit(num/10, count += 1);
			
	}
	
	public static void main(String[] args) {
		int num = 256;
		int count =0;
		int digit = rec_digit(num, count += 1);
		System.out.println(digit);
	// TODO Auto-generated method stub

	}

}
