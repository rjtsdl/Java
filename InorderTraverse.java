import java.util.ArrayList;


public class InorderTraverse {
	
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> all = new ArrayList<Integer>();
        if(root == null){
            return all;
            
        }
        
        ArrayList<Integer> left = inorderTraversal(root.left);
        all.addAll(left);
        all.add(new Integer(root.val));
        ArrayList<Integer> right = inorderTraversal(root.right);
        all.addAll(right);
        
        return all;
        
        
        
    }

}

class TreeNode {
	 int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
     }
