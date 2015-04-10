import java.util.List;
import java.util.*;


public class RestoreIPAddress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<String> restoreIpAddresses(String s) {
		
		List<String> ret= new ArrayList<String>();
		
		if(s.length() > 12 || s.length() < 4) return ret;
		
		int firstEnd = 1;
		int secondEnd = 2;
		int thirdEnd = 3;
		
		while(firstEnd <=3)
		{
			secondEnd = firstEnd + 1;
			while(secondEnd <= firstEnd + 3)
			{
				thirdEnd = secondEnd + 1;
				while(thirdEnd <= secondEnd + 3)
				{
					if(Check(s, thirdEnd, s.length()) && Check(s,0,firstEnd) && Check(s, firstEnd, secondEnd) && Check(s, secondEnd, thirdEnd))
					{
						ret.add(s.substring(0, firstEnd) + "." + s.substring(firstEnd, secondEnd) + "." + s.substring(secondEnd, thirdEnd) + "." +s.substring(thirdEnd, s.length()));
					}
					thirdEnd ++;
				}
				secondEnd++;
			}
			
			firstEnd++;
		}
		
		return ret;
        
    }
	
	public boolean Check(String s, int begin, int end) //not include end
	{	
		if(end - begin == 1 && Integer.parseInt(s.substring(begin, end)) < 10)
		{
			return true;
		}
		
		
		if(end - begin == 2 && Integer.parseInt(s.substring(begin, end)) < 100 && Integer.parseInt(s.substring(begin, end)) >= 10)
		{
			return true;
		}
		
		if(end - begin == 3 && Integer.parseInt(s.substring(begin, end)) < 256 && Integer.parseInt(s.substring(begin, end)) >= 100)
		{
			return true;
		}
		
		return false;
	}
	

}
