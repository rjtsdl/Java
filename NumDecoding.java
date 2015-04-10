
public class NumDecoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int numDecodings(String s) {
		
		int len = s.length();
		
		if(len == 0) return 0;
		int[] dp = new int[len+1];
		dp[0] = 1;
		for(int i=1; i<len+1; i++)
		{
			dp[i] = 0;
			if(i-1>=0 && Integer.parseInt(s.substring(i-1, i)) > 0)
			{
				dp[i] += dp[i-1];
			}
			if(i-2>=0 && Integer.parseInt(s.substring(i-2, i)) < 27 &&Integer.parseInt(s.substring(i-2, i))>9)
			{
				dp[i] += dp[i-2];
			}
		}
		
		return dp[len];
        
    }

}
