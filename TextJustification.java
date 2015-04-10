import java.util.*;

public class TextJustification {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<String> fullJustify(String[] words, int L) {
		
		List<String> list = new ArrayList<String>();
        int i = 0;
        int j = 0;
        while(i < words.length)
        {
        	j = i;
        	int puresum = 0;
        	while(j< words.length)
        	{
        		if(puresum + words[j].length() + (j-i) <= L)
        		{
        			puresum += words[j].length();
        			j++;
        		}
        		else
        		{
        			break;
        		}
        		
        	}
        	String str = "";
        	{
        		
        		
        		
        		int remaining = L-puresum;
        		int k = i;
        		while(k<j)
        		{
        			int numSpace = 0;
        			if(k<j-1)
        			{
        				if(j >= words.length)
        				{
        					numSpace = Math.min(1, remaining);
        				}
        				else if(remaining%(j-k-1) == 0)
        				{
        					numSpace = remaining/(j-k-1);
        				}
        				else
        				{
        					numSpace = remaining/(j-k-1)+1;
        				}
        				remaining -= numSpace;
        				
        				
        			}
        			else
        			{
        				numSpace = remaining;
        			}
        			str += words[k];
    				for(int p = 0; p < numSpace;p++)
    				{
    					str += " ";
    				}
    				
    				k++;
        			
        		}
        	}
        	
        	list.add(str);
        	i = j;
        	
        	
        	
        }
        
        return list;
    }

}
