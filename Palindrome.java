package Numbers;

public class Palindrome {

	public static int reverse(int num) {
		// TODO Auto-generated method stub
		int n =153;
		int res = 0;
		while(n != 0) {
			int rem = n%10;
			res=(res*10)+rem;
			n=n/10;
	}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =153;
		int res = reverse(num);
		if(num==res) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");

	}
	}
}
