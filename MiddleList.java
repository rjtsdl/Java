
public class MiddleList {
	
	public static void main(String[] args){
		Node head = new Node(1);
		Node second1 = new Node(2);
		Node second2 = new Node(3);
		Node second3 = new Node(4);
		Node second4 = new Node(5);
		Node second5 = new Node(6);
		Node second6 = new Node(7);
		
		head.next = second1;
		second1.next = second2;
		second2.next = second3;
		second3.next = second4;
		second4.next = second5;
		second5.next = second6;

		
		System.out.println(getMiddle(null));
		
	}
	
	public static Node getMiddle(Node head){
		
		if ((head ==null)||(head.next == null)){
			return head;
		}
		
		Node a = head;
		Node b = head;
		while(a.next != null){
			a=a.next.next;
			
			
			if(a == null){
				break;
			}
			b=b.next;
		}
		return b;
	}
}

class Node{
	Node next;
	int value;
	
	Node(int a){
		this.value = a;
		this.next = null;
	}
} 
