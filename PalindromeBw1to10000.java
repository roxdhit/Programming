package Numbers;

public class PalindromeBw1to10000 {

	
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
			for(int i =1; i <= 10000;i++) {
				int n = i;
				int res = reverse(n);
				if(n==res) {
					System.out.println(n);
	}

}
		}
}
