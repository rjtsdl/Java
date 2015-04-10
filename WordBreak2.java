import java.util.*;

public class WordBreak2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<String> wordBreak(String s, Set<String> dict) {
		
		List<String> retList = new ArrayList<String>();
		List<String> changingList = new ArrayList<String>();
		
		worker(retList, changingList, dict, s);
		
		return retList;
		
		
        
    }
	
	public void worker(List<String> retList, List<String> changingList, Set<String> dict, String pendingString)
	{
		for(int i = 1; i<= pendingString.length(); i++ )
		{
			String ss = pendingString.substring(0, i);
			if(dict.contains(ss))
			{
				changingList.add(ss);
				dict.remove(ss);
				if(i == pendingString.length())
				{
					retList.add(generateString(changingList));
				}
				else
				{
					worker(retList, changingList, dict, pendingString.substring(i));
				}
				dict.add(ss);
				changingList.remove(ss);
			}
		}
	}
	
	public String generateString(List<String> changingList)
	{
		if(changingList.size() == 0) return "";
		String ret = "";
		for(int i=0; i<changingList.size() ; i++)
		{
			ret += changingList.get(i) + " ";
		}
		
		return ret.substring(0, ret.length()-1);
		
	}

}
