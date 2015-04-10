
public class MergeList {
	
	public static void main(String[] args){
		
		MyNode A = new MyNode(1);
		MyNode A1 = new MyNode(3);
		MyNode A2 = new MyNode(4);
		MyNode A3 = new MyNode(6);
		A.next = A1;
		A1.next = A2;
		A2.next = A3;
		
		MyNode B = new MyNode(2);
		MyNode B1 = new MyNode(5);
		MyNode B2 = new MyNode(7);
		MyNode B3 = new MyNode(9);
		B.next = B1;
		B1.next = B2;
		B2.next = B3;
		
		
		MyNode C = merge(A,B);
		while (C.next!= null){
			
			System.out.print(C.value);
			C=C.next;
		}
		
		
		
	}
	

	public static MyNode merge(MyNode A, MyNode B){
		if (A.next == null) return B;
		if (B.next == null) return A;
		
		MyNode Head = new MyNode();
		MyNode C = Head;
		while(A.next!=null&&B.next!=null){
			if (A.value < B.value){
				C.next = A;
				A= A.next;
			}
			else{
				C.next = B;
				B = B.next;
				
			}
			C = C.next;
			
		}
		
		if(A.next !=null){
			C.next = A;
		}
		if(B.next != null){
			C.next = B;
		}
		
		Head = Head.next;
		return Head;
		
	}
}

class MyNode{
	int value;
	MyNode next;
	
	public MyNode(){
		this.next = null;
		this.value = 0;
	}
	
	public MyNode(int a){
		this.next = null;
		this.value = a;
	}
}
