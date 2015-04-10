import java.util.*;

public class PostOrderTraversalIterative {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> postorderTraversal(TreeNode root) {
		LinkedList<Integer> ret = new LinkedList<Integer>();
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		if(root == null)  return ret;
		stack.push(root);
		
		while(!stack.isEmpty())
		{
			TreeNode top = stack.pop();
			ret.push(top.val);
			if(top.left!= null)
			{
				stack.push(top.left);
			}
			
			if(top.right!= null)
			{
				stack.push(top.right);
			}
		}
		
		return ret;
        
    }
	
	public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		 }

}
