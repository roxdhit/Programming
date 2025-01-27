package Patterns;

public class pattern20 {

	
		public static void main(String[] args) {
	        printPattern();
	    }

	    public static void printPattern() {
	        
	        int[][] pattern = {
	            {1},
	            {2, 3},
	            {4, 5, 6},
	            {7, 8, 9, 11},
	            {22, 33, 44, 55, 66},
	            {77, 88, 99, 101, 111, 121}
	        };

	        
	        for (int i = 0; i < pattern.length; i++) {
	            for (int j = 0; j < pattern[i].length; j++) {
	                System.out.print(pattern[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
	