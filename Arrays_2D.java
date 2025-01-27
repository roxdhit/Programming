package Arrays;

public class Arrays_2D {
	public static void main(String[] args) {
		
	
	int rows = 3;
	int cols = 4;
	int k = 20;
	int[][] arr = new int[rows][cols];
	for(int i =0; i < rows; i++) {
		for(int j = 0; j <cols; j++) {
			arr[i][j] =k;
			k++;
		}
	}
	for(int i = 0; i < rows; i++) {
		for(int j = 0; j < cols; j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}

}

}

