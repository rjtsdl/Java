
public class LongestCommonString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String longestCommonPrefix(String[] strs) {
        
		if(strs.length <=0 ) return "";
        String partialCommon = strs[0];
        int commonLength = partialCommon.length();
        
        for(int i = 1;  i<strs.length; i++)
        {
        	int index = 0;
        	
        	while(index < commonLength && index < strs[i].length())
        	{
        		if(partialCommon.charAt(index) == strs[i].charAt(index))
        		{
        			index ++;
        		}
        		else
        		{
        			break;
        		}
        	}
        	
        	index = Math.min(index, strs[i].length());
        	while(index > 0)
        	{
        		if(partialCommon.charAt(index - 1) == strs[i].charAt(index-1))
        		{
        			break;
        		}
        		else{
        			index --;
        		}
        	}
        	commonLength = index;	
        }
        
        return partialCommon.substring(0,commonLength);
        
    }

}
