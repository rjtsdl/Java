
public class GroupofOnes {
	
	public static void main(String[] args){
		
		int[][] mat ={
				{0,0,0,0,0,0,0,1,1,1,1},
				{0,0,0,0,0,0,0,1,0,1,1},
				{0,0,1,0,0,0,0,0,0,0,0},
				{0,0,1,0,0,0,0,1,0,1,1},
				{0,0,0,0,0,0,0,1,1,1,1}
				
		};
		
		System.out.print("Number of Group is "+ NumberGroups(mat));
	}
	
	public static int NumberGroups(int[][] mat){
		
		int record = 1;
		if(mat.length==0) return 0;
		for(int i = 0; i<mat.length; i++){
			for(int j=0; j<mat[0].length; j++){
				if(mat[i][j] == 1){
					DFS(mat, i,j, record+1);
					record++;
				}
			}
		}
		for(int i = 0; i<mat.length; i++){
			for(int j=0; j<mat[0].length; j++){
				System.out.print(mat[i][j]+ " ");
			}
			System.out.print('\n');
		}
		return record-1;
	}
	
	
	public static void DFS(int[][] mat, int posx, int posy, int val){
		
		mat[posx][posy] = val;
		if(posx-1>=0&&mat[posx-1][posy]==1){
			DFS(mat, posx-1, posy, val);
		}
		if(posy-1>=0&&mat[posx][posy-1]==1){
			DFS(mat, posx, posy-1, val);
		}
		if(posx+1<mat.length&&mat[posx+1][posy]==1){
			DFS(mat, posx+1, posy, val);
		}
		if(posy+1<mat[0].length&&mat[posx][posy+1]==1){
			DFS(mat, posx, posy+1, val);
		}
	}

}
