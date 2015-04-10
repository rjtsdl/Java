
public class PermutationSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String getPermutation(int n, int k) {
		
		int[] arr = new int[n];
		int seq = 1;
		for(int i=0; i<n; i++)
		{
			arr[i] = i+1;
		}
		
		while(seq<k)
		{
			int j= n-1;
			while(j-1>=0 && arr[j]<arr[j-1])
			{
				j--;
			}
			
			if(j==0)
			{
				int i =0;
				int p = n-1;
				while(i<p)
				{
					int temp = arr[i];
					arr[i] = arr[p];
					arr[p] = temp;
					i++;
					p--;
				}
			}
			else
			{
				int i= j-1;
				
				while(j+1<n && arr[j+1] > arr[i])
				{
					j++;
				}
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				int p = n-1;
				while(i<p)
				{
					temp = arr[i];
					arr[i] = arr[p];
					arr[p] = temp;
					i++;
					p--;
				}
			}
			
			seq ++;
			
		}
		
		String ret = "";
		for(int i=0; i<n; i++)
		{
			ret += arr[i];
		}
		return ret;
        
    }

}
