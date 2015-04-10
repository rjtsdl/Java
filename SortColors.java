
public class SortColors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void sortColors(int[] A) {
		int lower = 0;
		int higher = A.length-1;
		int index = 0;
		
		while(index <= higher)
		{
			if(A[index] < 1)
			{
				int temp = A[index];
				A[index] = A[lower];
				A[lower] = temp;
				lower ++;
				index++;
			}
			else if(A[index] > 1)
			{
				int temp = A[index];
				A[index] = A[higher];
				A[higher] = temp;
				higher --;
			}
			else
			{
				index++;
			}
			
			
		}
    }

}
