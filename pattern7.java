package Patterns;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k = 1;
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (k % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
                k++;
            }
            System.out.println();

	}
	
	}

}
