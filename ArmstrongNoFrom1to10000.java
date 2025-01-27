package Numbers;

public class ArmstrongNoFrom1to10000 {
	public static int count_digit(int num) {
		int count = 0;
		while(num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public static int arm(int num) {
		int count = count_digit(num);
		int res = 0;
		while(num != 0) {
			int rem = num % 10;
			res = (int) Math.pow(rem, count) + res;
			num = num / 10;
		}
		return res;
	}
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10000; i++) {
			int num = i;
			int res = arm(num);
	
		if(num == res) {
			System.out.println("armstrong" +num);

	}
		}
	}
}
	