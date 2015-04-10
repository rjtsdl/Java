import java.util.Arrays;


public class multipleN {
	
	public static void main(String[] args){
		
		int[][] A = new int[][]{
				{1,2,3},
				{1,0,1},
				{2,0,0}
		};
		int[][] B = new int[][]{
				{1,2,3},
				{1,0,1},
				{2,0,0}
		};
		
		System.out.println(Arrays.toString(multiple(A,B,3)[0]));
	}
	public static int[][] multiple(int[][] A, int[][] B, int N){
		
		
		
		int[][] C = new int[N][N];
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				C[i][j] = 0;
				for (int k=0; k<N;k++){
					C[i][j]+=A[i][k]*B[k][j];
				}
			}
		}
		return C;
	}

}
