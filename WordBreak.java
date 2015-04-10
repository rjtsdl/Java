import java.util.*;

public class WordBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean wordBreak(String s, Set<String> dict) {
		if(s.length() == 0)
		{
			return true;
		}
		
		
		boolean dp[] = new boolean[s.length()+1];
		
		dp[0] = true;
		
			for(int j=1; j < s.length()+1; j++)
			{
				dp[j] = false;
				
				for(int k =0; k<j;k++)
				{
					if(dp[k] && dict.contains(s.substring(k,j)))
					{
						dp[j] = true;
						break;
					}
				}
			}
			
		return dp[s.length()];
        
    }

}
