package Numbers;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 36;
		int hcf =1;
		int smallest = (a<b)?a:b;
		for(int i = 1 ; i <= smallest; i++) {
			if(a %i == 0 && b%i ==0) {
				hcf = i;
			}
			
		}
		

		System.out.println(hcf);
	}

}
	
