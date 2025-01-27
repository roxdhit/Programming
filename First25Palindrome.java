package Numbers;

public class First25Palindrome {
	public static boolean isPalindrome(int n){
		int original = n;
		int res = 0;
		while(n != 0) {
			int rem = n%10;
			res=(res*10)+rem;
			n=n/10;
	}
	return res == original;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;;
		int count = 0;
		int n =1;
		while(count < 25) {
			if(isPalindrome(n)) {
				sum = +n;
			count ++;
		}
			n++;
		}
		double average = (double)sum/25;
		System.out.println("the average of palindrome is:"+average);
}

}
	
