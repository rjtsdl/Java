
public class RegularExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//Succeed in the second shot, good job
	public boolean isMatch(String s, String p) 
	{
		if(s.length() == 0)
		{
			if(p.length() == 0){
				return true;
			}
			else if(p.length()>1 && p.charAt(1) == '*')
			{
				return isMatch(s, p.substring(2));
			}
			else
			{
				return false;
			}
		}
		
		
		boolean match = false;
		if(p.length()>1 && p.charAt(1) == '*')
		{
			match = match|isMatch(s, p.substring(2));
			if(match)
			{
				return true;
			}
			if(s.length() >0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'))
			{
				match = match|isMatch(s.substring(1), p);
				if(match)
				{
					return true;
				}
			}
		}
		else if(p.length() > 0)
		{
			if(s.length()>0 && (p.charAt(0) == '.' || p.charAt(0) == s.charAt(0)))
			{
				match = match | isMatch(s.substring(1), p.substring(1));
				if(match)
				{
					return true;
				}
			}
		}
		else
		{
			return false;
		}
		
		return match;
    }
}
