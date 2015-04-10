
public class LongestSubstringWithoutRepeatingCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int lengthOfLongestSubstring(String s) {
		int[] map = new int[256];
		for(int i=0; i<map.length; i++)
		{
			map[i] = 0;
		}
		
		if(s.length() == 0) return 0;
		
		int start =0, end =1;
		int max = 1;
		map[s.charAt(0)] = 1;
		
		while(end < s.length())
		{
			int index = s.charAt(end);
			
			while(start<end&&map[index]>0)
			{
				map[s.charAt(start)]--;
				start++;
			}
			map[index]++;
			end++;
			
			if(end-start>max)
			{
				max = end - start;
			}
			
		}
		
		return max;
        
    }

}
