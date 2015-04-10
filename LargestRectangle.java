import java.util.*;

public class LargestRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int largestRectangleArea(int[] height) {
        
		LinkedList<Integer> stack = new LinkedList<Integer>();
		int index = 0;
		int maxArea = 0;
		while(index < height.length)
		{
			if(stack.isEmpty() || height[index] > height[stack.peek()])
			{
				stack.push(index);
				index++;
			}
			else
			{
				int highOne = stack.pop();
				if(stack.isEmpty())
				{
					maxArea = Math.max(maxArea, height[highOne]*(index));
				}
				else
				{
					maxArea = Math.max(maxArea, height[highOne]*(index - stack.peek() -1));
				}
			}
		}
		
		while(!stack.isEmpty())
		{
			int highOne = stack.pop();
			if(stack.isEmpty())
			{
				maxArea = Math.max(maxArea, height[highOne]*(height.length));
			}
			else
			{
				maxArea = Math.max(maxArea, height[highOne]*(height.length - stack.peek() -1));
			}
		}
		
		return maxArea;
    }

}
