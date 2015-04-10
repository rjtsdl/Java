import java.util.*;

public class SimplifyPath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String simplifyPath(String path) {
		String[] paths = path.split("/");
		LinkedList<String> stack = new LinkedList<String>();
		
		for(int i = 0;  i<paths.length ; i++)
		{
			if(paths[i].isEmpty() || paths[i].equals("."))
			{
				continue;
			}
			if(paths[i].equals(".."))
			{
				stack.pollLast();
				continue;
			}
			
			stack.add(paths[i]);
		}
		
		if(stack.size() == 0) return "/";
		
		String fi = "";
		for(int i =0; i<stack.size(); i++)
		{
			fi += "/"+stack.get(i);
		}
		
		return fi;
        
    }
}
