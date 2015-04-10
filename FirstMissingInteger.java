
public class FirstMissingInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int firstMissingPositive(int[] A) {
        for(int i=0; i<A.length; i++)
        {
        	if(A[i] < 0) A[i] = 0;
        }
        
        for(int i=0; i<A.length; i++)
        {
        	int abs = Math.abs(A[i]);
        	if(abs ==0 || abs > A.length || A[abs - 1] < -1*A.length) 
        	{
        		continue;
        	}
        	else
        	{
        		A[abs-1] =  -1*Math.abs(A[abs-1]);
        		if(A[abs-1] ==0)
        		{
        			A[abs-1] = -1*(A.length + 1);
        		}
        	}	
        }
        
        for(int i=0; i<A.length; i++)
        {
        	if(A[i]>=0)
        	{
        		return i+1;
        	}
        }
        
        return A.length+1;
        
    }

}
