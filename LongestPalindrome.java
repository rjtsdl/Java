
public class LongestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public String longestPalindrome(String s) {
        
		// i, j, from i to j inclusive. this is a palindrome
		
		int len = s.length();
		if(len <=1) return s;
		boolean[][] dp = new boolean[len][len];
		
		int start = 0;
		int end = 0;
		for(int i = len-1; i>=0; i--)
		{
			for(int j =i; j<len;j++)
			{
				dp[i][j] = false;
				if(j==i)
				{
					dp[i][j] = true;
				}
				else if(j-i==1)
				{
					dp[i][j] = (s.charAt(i) == s.charAt(j));
				}
				else if(j-i>=2)
				{
					dp[i][j] = dp[i+1][j-1]&&(s.charAt(i) == s.charAt(j));
				}
				
				if(dp[i][j]&&j-i>end -start)
				{
					start = i;
					end = j;
				}
			}
		}
		
		return s.substring(start, end+1);
		
		
    }

}
