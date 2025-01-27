package Recursion;

//public class Factors {
	//factor prog reference
	//public class Factors {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int count =0;
		//int num=24;
		//for(int i = 1; i<=num; i++) {
			//if(num %i == 0){
			//	System.out.print(i+" ");;
			//}
		//}
		//System.out.println("the factors of num is:"+ count);
	//}
	//}

	public class Factors {
		public static void Print_factors(int num, int i) {
			if (i > num) {
				return;
			}
			if(num % i == 0) {
				System.out.println(i);
			}
			Print_factors(num, i += 1);
		}

		public static void main(String[] args) {
			int num = 24;
			int i = 1;
			Print_factors(num, i);

		}

	}
	