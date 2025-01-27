package Recursion;

public class HCF {
	public static void euclid(int a, int b) {
		while(a != b) {
		if(a>b) {
			a = a - b;
		}
		else {
			b = b - a;
		}
	}
	System.out.println(a);
}
	public static void main(String[] args) {
		//O(max(a, b))
		int a  = 25;
		int b = 245;
		euclid(a, b);

	}

}


//worst case time complexity:
//a = 100;
//b = 1;
//time complexity : O(max(a, b))
// logic: replace max value with max  - min value till both no becomes same
	