package Recursion;

public class Reverse {
	public static int rec_rev(int num, int res){
		if(num == 0) {
			return res;
		}
		return rec_rev(num/10, (res*10) + num % 10);
	}

	public static void main(String[] args) {
		int num = 256;
		int res =0;
		System.out.println(rec_rev(num, res));
		

	}

}
