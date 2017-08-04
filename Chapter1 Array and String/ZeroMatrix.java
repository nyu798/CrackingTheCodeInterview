import java.util.Arrays;

public class ZeroMatrix{
	public static void main(String args[]){
			
			//int[][] matrix = new int[4][4];
			int[][] matrix = {	{ 1, 2, 3, 4},
								{ 5, 6, 0, 8},
								{ 9, 10, 11, 12},
								{ 13, 14, 15, 16}
								};
			for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					System.out.print(matrix[i][j] + "\t");
				}
				System.out.println("\n");
			}	
			
			matrixRotate(matrix,4,4);
			for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					System.out.print(matrix[i][j] + "\t");
				}
				System.out.println("\n");
			}
			
	}
	
	public static void matrixRotate(int[][] matr, int m, int n){
		int[] row_zero=new int[m];
		int[] col_zero= new int[n];
		int zero_count=0;
		for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					if(matr[i][j]==0){
							row_zero[zero_count]=i+1;
							col_zero[zero_count++]=j+1;
					}	
				}	
		}
		
	if(zero_count!=0){
		for(int t:row_zero){
			if(t!=0){
					for(int x=0;x<n;x++){
							matr[t-1][x]=0;
					}
			}
		}
		
		for(int w:col_zero){
			if(w!=0){
					for(int y=0;y<m;y++){
							matr[y][w-1]=0;
					}
			}
			
		}	
		
	}		
				
	}

}