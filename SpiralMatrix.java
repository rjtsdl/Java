import java.util.*;

public class SpiralMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<Integer>();
		int m = matrix.length;
		if(m == 0) return list;
		int n = matrix[0].length;
		
		int row = 0;
		int col = 0;
		while(2*row < m && 2*col <n)
		{
				for(int i = col ; i<= n-col-1 ; i++)
				{
					list.add(matrix[row][i]);
				}
				
				for(int i = row + 1; i <= m- row-1; i++)
				{
					list.add(matrix[i][n-col-1]);
				}
				for(int i = n-col -2; i>=col&& m-row-1 > row ; i--)
				{
					list.add(matrix[m-row-1][i]);
				}
				for(int i = m-row-2; i>= row+1 && n-col-1>col; i--)
				{
					list.add(matrix[i][col]);
				}
				row++;
				col++;
		}
		
		return list;
        
    }

}
