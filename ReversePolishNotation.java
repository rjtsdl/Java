import java.util.*;

public class ReversePolishNotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] input = {"3","-4","+"};
		evalRPN(input);

	}
	
	public static int evalRPN(String[] tokens) {
		
		LinkedList<String> stack = new LinkedList<String>();
		
		for(int i =0 ; i< tokens.length; i++)
		{
			PrintLinkedList(stack);
			if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/"))
			{
				int b = Integer.parseInt(stack.pollFirst());
				int a = Integer.parseInt(stack.pollFirst());
				int c = 0;
				
				if(tokens[i].equals("+"))
				{
					c = a + b;
				}
				
				if(tokens[i].equals("-"))
				{
					c = a - b;
				}
				
				if(tokens[i].equals("*"))
				{
					c = a * b;
				}
				
				if(tokens[i].equals("/"))
				{
					c = a/b;
				}
				
				stack.push(""+c);
			}
			else
			{
				stack.push(tokens[i]);
			}
			
		}
		PrintLinkedList(stack);
		return Integer.parseInt(stack.pollLast());
        
    }
	
	static void PrintLinkedList(LinkedList<String> ll)
	{
		 
		for(int i=0; i<ll.size(); i++)
		{
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
	}

}
