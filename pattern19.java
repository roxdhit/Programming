package Patterns;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows =5;
		//above horizontal line
		for(int i =1; i<=rows; i++) { //top space
			for(int j =1; j>=rows-i; j++) {
				System.out.print(" "+" ");
			}
			for(int j =5; j>=rows+1-i; j--) {//top left
				System.out.print(j+" ");
			}
			for(int j=rows+1-i; j<=5; j++) {//top right
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//below horizontal line
		for(int i=1; i<=rows;i++) {//bottom space
			for(int j=1; j<=i; j++) {
				System.out.print(" "+" ");
			}
			for(int j= 5; j>=i+1; j--) { //bottom left
				System.out.print(j+" ");
			}
			for(int j =i+2; j<=5; j++) { //bottom right
				System.out.print(j+" ");
			}
			System.out.println();


	}
	}

}
