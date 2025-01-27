package Numbers;

public class PrimeUpto10000 {
	public static int count_fact(int num) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i =1; i <=num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int c = count_fact(num);
		if(c == 2) {
		System.out.println("Prime");
	}
		else {
			System.out.println("not prime");
		}
	}
}
	
