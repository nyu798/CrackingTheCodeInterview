import java.util.Arrays;

public class MatrixRotation{
	public static void main(String args[]){
			
			//int[][] matrix = new int[4][4];
			int[][] matrix = {	{ 1, 2, 3, 4},
								{ 5, 6, 7, 8},
								{ 9, 10, 11, 12},
								{ 13, 14, 15, 16}
								};
			for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					System.out.print(matrix[i][j] + "\t");
				}
				System.out.println("\n");
			}	
			
			matrixRotate(matrix,4);
	}
	
	public static void matrixRotate(int[][] matr, int n){
			int[][] new_matrix= new int[n][n];
			for(int i=0; i<n;i++){
				for(int j=0;j<n;j++){
					new_matrix[i][n-1-j]=matr[j][i];
				}
			}
		for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					System.out.print(new_matrix[i][j] + "\t");
				}
				System.out.println("\n");
			}
	}

}