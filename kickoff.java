import java.util.Arrays;


public class kickoff {
	
	public static void main(String[] args){
		
		int[][] winner = new int[][]{
				{0,1,2,3,4,5,6,7},
				{1,0,2,3,4,5,6,7},
				{2,2,0,3,4,5,6,7},
				{3,3,3,0,4,5,6,7},
				{4,4,4,4,0,5,6,7},
				{5,5,5,5,5,0,6,7},
				{6,6,6,6,6,6,6,7},
				{7,7,7,7,7,7,7,7}
		};
		int [] order = new int[]{2,3,4,1,0,6,5,7};
		int [] result = new int[8];
		
		fun(winner, order,result);
		System.out.println(Arrays.toString(result));
		
	}
	
	
	
	public static void fun(int [][] winner, int [] order, int[] result){
		doit(winner, order, order.length, result);
	}

	public static void doit(int [][] winner, int [] order, int len, int[] result){
		if (len == 1) {
			result[0] = order[0];
			return;
		}
		for(int i = 0; i<len/2; i++){
			if( winner[order[2*i]][order[2*i+1]] == order[2*i]){
				result[i+len/2] = order[2*i+1];
				order[i] = order[2*i];
			}
			else{
				result[i+len/2] = order[2*i];
				order[i] = order[2*i+1];
			}
		}
		
		doit(winner, order, len/2, result);
	}
	
}
