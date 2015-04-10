import java.util.*;
import java.util.Map.Entry;


public class SubSetII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> subsetsWithDup(int[] num) {

		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i=0; i<num.length; i++)
		{
			if(!map.containsKey(num[i]))
			{
				map.put(num[i], 1);
			}
			else
			{
				map.put(num[i], map.get(num[i])+1);
			}
		}
		
		int[] digits = new int[map.size()];
		int[] upbounds = new int[map.size()];
		int[] changingNumber= new int[upbounds.length];
		
		Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
		int i=0;
		while(it.hasNext())
		{
			Entry<Integer, Integer> pairs = it.next();
			digits[i] = pairs.getKey();
			upbounds[i] = pairs.getValue();
			changingNumber[i]=0;
			i++;
		}
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		do
		{
			List<Integer> list = new ArrayList<Integer>();
			for(int k =0 ;k<digits.length; k++)
			{
				for(int j=0; j<changingNumber[k]; j++)
				{
					list.add(digits[k]);
				}
			}
			
			lists.add(list);
		}
		while(!Increment(upbounds, changingNumber));
		
		return lists;
        
    }
	// Overflow or not
	boolean Increment(int[] upbounds, int[] changingNumber)
	{
		int overflow = 1;
		int i=0;
		while(i< changingNumber.length)
		{
			if(overflow > 0)
			{
				int sum = changingNumber[i] + overflow;
				if(sum > upbounds[i])
				{
					overflow = 1;
					changingNumber[i] = 0;
					i++;
				}
				else
				{
					overflow = 0;
					changingNumber[i] = sum;
					break;
				}
			}
			
		}
		
		return overflow==1;
	}

}
