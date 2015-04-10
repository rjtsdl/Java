import java.util.*;

public class BTInorderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
		
		List<Integer> ret = new LinkedList<Integer>();
		TreeNode iter = root;
		if(iter.left!= null)
		{
			iter = ToVeryLeft(iter);
			ret.add(iter.val);
		}
		while(iter!= null)
		{
			iter = GoUp(iter);
			if(iter!= null)
			{
				ret.add(iter.val);
			}
			
			if(iter.right!= null)
			{
				iter = iter.right;
			}
			
			if(iter.left!= null)
			{
				iter = ToVeryLeft(iter);
				ret.add(iter.val);
			}
		}
		
		return ret;
        
    }
	
	public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode parent;
		     TreeNode(int x) { val = x; }
	 }
	
	public TreeNode ToVeryLeft(TreeNode root)
	{
		TreeNode temp = root;
		while(temp.left!= null)
		{
			temp = temp.left;
		}
		return temp;
	}
	
	public TreeNode GoUp(TreeNode root)
	{
		TreeNode temp = root;
		while(temp.parent!= null && temp == temp.parent.right)
		{
			temp = temp.parent;
		}
		temp = temp.parent;
		return temp;
	}

}
