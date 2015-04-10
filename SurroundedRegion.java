import java.util.*;

public class SurroundedRegion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void solve(char[][] board) {
		
        if(board.length ==0) return;
        
        int m = board.length;
        int n = board[0].length;
        
        for(int i = 0; i<m; i++)
        {
        	for(int j=0; j<n; j++)
        	{
        		if(i==0||i==m-1||j==0||j==n-1){
        			dfs(board, i, j, m, n);
        		}
        	}
        }
        
        for(int i=0; i<m; i++)
        {
        	for(int j=0; j<n; j++)
        	{
        		if(board[i][j] == 'o')
        		{
        			board[i][j] = 'O';
        		}
        		else
        		{
        			board[i][j] = 'X';
        		}
        	}
        }
    }
	
	public void dfs(char board[][], int i, int j, int m, int n)
	{
		
		LinkedList<point> stack = new LinkedList<point>();
		stack.push(new point(i,j));
		
		while(stack.size()!=0)
		{
			point p = stack.pop();
			if(board[p.x][p.y] == 'O')
			{
				board[p.x][p.y] = 'o';
				if(p.x -1 >=0 && board[p.x-1][p.y] == 'O')
				{
					stack.push(new point(p.x-1, p.y));
				}
				
				if(p.y -1 >=0 && board[p.x][p.y-1] == 'O')
				{
					stack.push(new point(p.x, p.y-1));
				}
				
				if(p.x +1 <m && board[p.x+1][p.y] == 'O')
				{
					stack.push(new point(p.x+1, p.y));
				}
				
				if(p.y +1 <n && board[p.x][p.y+1] == 'O')
				{
					stack.push(new point(p.x, p.y+1));
				}
			}
		}
	}
	
	
	class point
	{
		public int x;
		public int y;
		
		public point(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}


}
