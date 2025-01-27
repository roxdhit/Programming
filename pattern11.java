package Patterns;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= (5 - i); j++) {
                System.out.print(" "+" "); // Two spaces for alignment
            }
            for(int j = 6-i; j <= 5; j++) {
                System.out.print(j +" "); // Star with a space
            }
           System.out.println(); // Move to the next line

	}
	}

}
