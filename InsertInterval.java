import java.util.*;

public class InsertInterval {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> list = new ArrayList<Interval>();
		
		Interval thisInterval = newInterval;
		boolean considerNewInterval = true;
		for(int i =0; i<intervals.size(); i++)
		{
			Interval from = intervals.get(i);
			if(considerNewInterval)
			{
			if(from.start > thisInterval.end || from.end < thisInterval.start)
			{
				if(thisInterval.start < from.start)
				{
					list.add(thisInterval);
					considerNewInterval = false;
				}
				list.add(from);
			}
			else
			{
				thisInterval.start = Math.min(thisInterval.start, from.start);
				thisInterval.end = Math.max(thisInterval.end, from.end);
			}
			}
			else
			{
				list.add(from);
			}
		}
		
		if(list.size() == 0 ||list.get(list.size()-1).start< thisInterval.start)
		{
			list.add(thisInterval);
		}
		return list;
        
    }
	
	public class Interval {
		 int start;
	     int end;
	     Interval() { start = 0; end = 0; }
	     Interval(int s, int e) { start = s; end = e; }
	}

}
