package Patterns;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= (5 - i); j++) {
                System.out.print(" "+" "); // Two spaces for alignment
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*" +" "); // Star with a space
            }
           System.out.println(); // Move to the next line
		}
	}

}
