public class Pocketgems {
	
	public static void main(String[] args){
		
		for(int i=1;i<10; i++){
			System.out.println(""+i+" :"+RobertReach(i));
		}
	}
	
	public static boolean isLegal(int x, int y, int K){
		int sum =0;
		while(x!=0){
			sum += x%10;
			x = x/10;
		}
		while(y!=0){
			sum += y%10;
			y = y/10;
		}
		return sum<=K;
	}
	
	public static void dfs(boolean[][] visited, int x, int y, int K, int[] count){
		visited[x][y] = true;
		count[0]++;
		if(x-1>=0&&visited[x-1][y]==false&&isLegal(x-1,y,K)){
			dfs(visited,x-1,y,K, count);
		}
		if(y-1>=0&&visited[x][y-1]==false&&isLegal(x,y-1,K)){
			dfs(visited,x,y-1,K, count);
		}
		if(x+1<visited[0].length&&visited[x+1][y]==false&&isLegal(x+1,y,K)){
			dfs(visited,x+1,y,K, count);
		}
		if(y+1<visited.length&&visited[x][y+1]==false&&isLegal(x,y+1,K)){
			dfs(visited,x,y+1,K, count);
		}
		
	}
	
	public static int RobertReach(int K){
		int[] count = new int[1];
		count[0] = 0;
		if(K == 0) return 0;
		int bound = getbound(K);
		boolean[][] visited = new boolean[bound][bound];
		for(int i=0; i<visited.length;i++){
			for(int j=0; j<visited[0].length;j++){
				visited[i][j] = false;
			}
		}
		
		dfs(visited,0,0,K,count);
		return count[0];
	}
	
	public static int getbound(int K){
		int digit = 1;
		int sum = 0;
		while(K>9){
			sum+=9*digit;
			digit*=10;
			K -= 9;
		}
		sum+=K;
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	public int maxMyShare(int [] slices){
		
		if (slices.length == 0) return 0;
		int [] dp = new [slices.length+1][slices.length];
		//i lenght, j start place
		for(int i=0; i<slices.length; i++){
			dp[0][i] = 0;
			dp[1][i] = slices[i];
		}
		for(int i=2; i<dp.length; i++){
			for(int j=0; j<slices.length;j++){
				dp[i][j] = Math.max(sumofslices(slice,i,j)-dp[i-1][j+1], sumofslices(slice,i,j)-dp[i-1][j]);
				
			}
		}
		
	}
	*/
	
}



































	
	
