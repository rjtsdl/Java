import java.util.*;

public class UniqueBSTII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<TreeNode> generateTrees(int n) {
        
		return generateTrees(n,1);
    }
	
	public List<TreeNode> generateTrees(int n, int start)
	{
		List<TreeNode> list = new LinkedList<TreeNode>();
		if(n==0)
		{
			list.add(null);
			return list;
		}
		else if(n == 1){
			TreeNode head = new TreeNode(start);
			list.add(head);
		}
		else{
			for(int i = start; i< start+n; i++)
			{
				List<TreeNode> leftList = generateTrees(i-start, start);
				List<TreeNode> rightList = generateTrees(n+start -1 - i, i+1);
				
				
					for(TreeNode left : leftList)
					{
						for(TreeNode right : rightList)
						{
							TreeNode head = new TreeNode(i);
							head.left = left;
							head.right = right;
							list.add(head);
						}
					}
				
			}
		}
		
		return list;
	}
	
	public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; left = null; right = null; }
	}

}
