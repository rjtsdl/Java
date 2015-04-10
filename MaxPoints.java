import java.util.*;

public class MaxPoints {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxPoints(Point[] points) {
		
		if(points.length <= 2)
		{
			return points.length;
		}
		
		
		int max = 2;
		
		for(int i = 0; i<points.length; i++)
		{
			//Choose different start point
			Map<Double, Integer> map = new HashMap<Double, Integer>();
			int offset = 0;
			for(int j = 0; j<points.length;j++)
			{
				if(j == i)
				{
					continue;
				}
				
				
				if(points[j].x ==  points[i].x && points[j].y == points[i].y)
				{
					offset++;
					continue;
				}
				double slope = (points[j].y - points[i].y)*1.0/(points[j].x - points[i].x);
				if(!map.containsKey(slope))
				{
					map.put(slope, 2);
				}
				else
				{
					map.put(slope, map.get(slope)+1);
				}
				
			}
			
			for(Double d: map.keySet())
			{
				max = Math.max(max, offset + map.get(d));
			}
			max = Math.max(max, offset+1);
		}
		return max;
        
    }
	
	class Point {
	    int x;
        int y;
        Point() { x = 0; y = 0; }
        Point(int a, int b) { x = a; y = b; }
	 }

}
