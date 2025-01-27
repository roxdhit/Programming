package Operators;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 30;
		int c = 60;
		
		int maximum = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println(maximum);
		}
	}
	
