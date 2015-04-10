import java.util.*;

public class WordLadder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int ladderLength(String start, String end, Set<String> dict) {
        dict.add(start);
        dict.add(end);
        Set<String> curLevel = new HashSet<String>();
        Set<String> nextLevel = new HashSet<String>();
        
        dict.remove(start);
        curLevel.add(start);
        
        int ret = 1;
        
        while(curLevel.size()>0)
        {
        	for(String s: curLevel)
        	{
        		findNextLevel(s, dict, nextLevel);
        	}
        	
        	if(nextLevel.size() == 0)
        	{
        		return 0;
        	}
        	
        	if(nextLevel.contains(end))
        	{
        		return ret + 1;
        	}
        	Set<String> temp;
        	temp = curLevel;
        	curLevel = nextLevel;
        	nextLevel = temp;
        	
        	nextLevel.clear();
        	ret ++;
        }
        
        return 0;
        
    }
	
	public void findNextLevel(String str, Set<String> dict, Set<String> nextLevel)
	{
		char[] cstr = str.toCharArray();
		
		for(int i = 0; i<cstr.length; i++)
		{
			char temp = cstr[i];
			for(char c = 'a'; c <= 'z'; c++)
			{
				cstr[i] = c;
				if(dict.contains(new String(cstr)))
				{
					nextLevel.add(new String(cstr));
					dict.remove(new String(cstr));
				}
				
			}
			cstr[i] = temp;
		}
		
	}
	
	

}
