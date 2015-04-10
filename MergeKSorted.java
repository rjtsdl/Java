import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;


public class MergeKSorted {
	
public ListNode mergeKLists(ArrayList<ListNode> lists) {
        
		if(lists.size() == 0) return null;
        Comparator<ListNode> comparator = new Comparator<ListNode>(){
            
            public int compare(ListNode x, ListNode y)
            {
        // Assume neither string is null. Real code should
        // probably be more robust
                if (x.val < y.val)
                {
                    return -1;
                }
                if (x.val > y.val)
                {
                    return 1;
                }
                return 0;
            }
        };
        
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.size(), comparator);
        
        for(int i =0; i<lists.size(); i++){
            ListNode node = lists.get(i);
            if(node == null) continue;
            
            queue.add(node);
            lists.set(i, node.next);
            
        }
        
        ListNode all;
        if (queue.size() == 0) return null;
        
        all = queue.poll();
        if(all.next != null) queue.add(all.next);
        
        ListNode current = all;
        
        while(queue.size()!= 0){
        	current.next = queue.poll();
        	current = current.next;
        	if(current.next!= null){
        		queue.add(current.next);
        	}
        }
        return all;
        
        
        
        
        
        // Start typing your Java solution below
        
        // DO NOT write main() function
        
    }

}


class ListNode {
   int val;
   ListNode next;
   ListNode(int x) {
	   val = x;
	   next = null;
	 
   }
	 
}











