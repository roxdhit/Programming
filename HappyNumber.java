package Numbers;

public class HappyNumber {
	public static int happy(int num) {
		int res = 0;
		while(num != 0) {
			int rem = num%10;
			res = res+(int)Math.pow(rem, 2);
			num = num/10;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		int res = happy(num);
		while(res != 1 && res != 4) {
			res = happy(res);
		}
		if(res == 1) {
			System.out.println("happy number");
		}
		else {
			System.out.println("not happy");
		}

	}
}