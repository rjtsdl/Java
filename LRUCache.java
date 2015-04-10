import java.util.*;


public class LRUCache {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int m_capacity;
	private Node m_head;
	private Map<Integer, Node> m_map;
	
	public LRUCache(int capacity) {
		m_capacity = capacity;
		m_head = new Node(0,0);
		m_map = new HashMap<Integer, Node>();
    }
    
    public int get(int key) {
    	if(m_map.containsKey(key))
    	{
    		Node n = m_map.get(key);
    		
    		Node prev = n.prev;
    		Node next = n.next;
    		
    		prev.next = next;
    		next.prev = prev;
    		
    		Node hNext = m_head.next;
    		m_head.next = n;
    		hNext.prev = n;
    		
    		n.prev = m_head;
    		n.next = hNext;
    		
    		return n.value;
    		
    	}
    	else
    	{
    		return -1;
    	}
        
    }
    
    public void set(int key, int value) {
    	Node n;
    	if(m_map.containsKey(key))
    	{
    		n = m_map.get(key);
    		n.value = value;
    		
    		Node prev = n.prev;
    		Node next = n.next;
    		
    		prev.next = next;
    		next.prev = prev;
    	}
    	else
    	{
    		n = new Node(key, value);
    		m_map.put(key, n);
    		
    	}
    	
    	Node hNext = m_head.next;
		m_head.next = n;
		hNext.prev = n;
		
		n.prev = m_head;
		n.next = hNext;
		
		if(m_map.size() > m_capacity)
		{
			Node hPrev = m_head.prev;
			int k = hPrev.key;
			
			hPrev.prev.next = m_head;
			m_head.prev = hPrev.prev;
			
			m_map.remove(k);
		}
        
    }
    
    class Node
    {
    	int key;
    	int value;
    	public Node prev;
    	public Node next;
    	
    	Node(int k, int v)
    	{
    		key = k;
    		value = v;
    		prev = this;
    		next = this;
    	}
    }

}
