package Numbers;

public class First15Palindrome {
	public static int reverse(int n){
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
		int count = 0;
		for(int i =1; ;i++) { //infinite loop
			int n = i;
			int res = reverse(n);
			if(n==res) {
				System.out.println(n);
				count++;
}
			if(count == 15) {
				break;
			}
		}
	}

}
