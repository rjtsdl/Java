import java.util.*;

public class BinaryTreeZigZagLevelTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		
		List<List<Integer>> ret = new LinkedList<List<Integer>>();
		if(root ==  null) return ret;
		
		LinkedList<TreeNode> forward = new LinkedList<TreeNode>();
		LinkedList<TreeNode> backward = new LinkedList<TreeNode>();
		forward.add(root);
		boolean isForward = true;
		
		while(true)
		{
			if(isForward)
			{
				if(forward.isEmpty())
				{
					break;
				}
				backward.clear();
				LinkedList<Integer> temp = new LinkedList<Integer>();
				
				while(!forward.isEmpty())
				{
					TreeNode head = forward.pop();
					temp.add(head.val);
					if(head.left!= null)
					{
						backward.push(head.left);
					}
					if(head.right!= null)
					{
						backward.push(head.right);
					}
				}
				isForward = false;
				ret.add(temp);
			}
			else
			{
				if(backward.isEmpty())
				{
					break;
				}
				forward.clear();
				LinkedList<Integer> temp = new LinkedList<Integer>();
				
				while(!backward.isEmpty())
				{
					TreeNode head = backward.pop();
					temp.add(head.val);
					if(head.right!= null)
					{
						forward.push(head.right);
					}
					if(head.left!= null)
					{
						forward.push(head.left);
					}
				}
				isForward = true;
				ret.add(temp);
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
