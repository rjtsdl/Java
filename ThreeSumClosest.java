import java.util.*;

public class ThreeSumClosest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int threeSumClosest(int[] num, int target) {
		
		if (num.length <3) return target;
		int closest = num[0] + num[1] + num[2];
		
		Arrays.sort(num);
		int first = 0;
		int middle = 1;
		int end = num.length-1;
		
		while(first < num.length)
		{
			middle = first + 1;
			end = num.length -1;
			
			while(middle < end)
			{
				int sum = num[first] + num[middle] + num[end];
				if(Math.abs(sum - target) < Math.abs(closest - target))
				{
					closest = sum;
				}
				
				if(sum == target)
				{
					return target;
				}
				if(sum > target)
				{
					end -=1;
				}
				if(sum < target)
				{
					middle += 1;
				}
			}
			first++;
		}
		
		return closest;
        
    }

}
