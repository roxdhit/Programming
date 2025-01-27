package Numbers;

public class Factors {
	public static void main(String[] args) {
		
	
	int count =0;
	int num=24;
	for(int i = 1; i<=num; i++) {
		if(num %i == 0){
			System.out.print(i+" ");;
		}
	}
	System.out.println("the factors of num is:"+ count);
	}
}
