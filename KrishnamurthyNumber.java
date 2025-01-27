package Numbers;

public class KrishnamurthyNumber {
	public static int factorial(int num) {
		int fact = 1;
		
		for(int i=1; i <= num; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	public static int Krishnamurthy(int num) {
		int res =0;
		while(num == 0) {
			int rem = num%10;
			res = res+ factorial(rem);
			num = num/10;
		}
		return res;
	}

	public static void main(String[] args) {
		int num =145;
		int res = Krishnamurthy(num);
		if (res == num) {
			System.out.println("KrishnamurthyNumber");
		}
		else {
			System.out.println("not");
		}

	}

}
	