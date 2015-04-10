import java.util.*;

public class CloneGraph {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        return Worker(node, map);
    }
    
    public UndirectedGraphNode Worker(UndirectedGraphNode node, HashMap<UndirectedGraphNode, UndirectedGraphNode> map)
    {
       if(map.containsKey(node))
       {
           return map.get(node);
       }
       
       UndirectedGraphNode copy = new UndirectedGraphNode(node.label);
       map.put(node, copy);
       for(UndirectedGraphNode aneighbor : node.neighbors)
       {
           copy.neighbors.add(Worker(aneighbor, map));
       }
       return copy;
    }
    
    class UndirectedGraphNode {
    	     int label;
    	     List<UndirectedGraphNode> neighbors;
    	     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
     };

}
