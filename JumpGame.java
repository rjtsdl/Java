import java.util.ArrayList;


public class JumpGame {
	
	
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(new Integer(1));
		System.out.println(getMinStep(al,0,21));
	}
	
	public static int getMinStep(ArrayList<Integer> al, int cur, int end){
		
		if (cur==end){
			return al.size()-1;
		}
		if (cur>end){
			return end;
		}
		
		int steps = al.size()-1;
		int presteps = al.get(steps).intValue();
		
		int plus1 = end;
		int equal = end;
		int minus1 = end;
		
		
		
		al.add(new Integer(presteps+1));
		plus1 = getMinStep(al,cur+presteps+1,end);
		al.remove(steps+1);
		
		if (plus1<end) return plus1;
		
		if(presteps<=0)  equal= end;
		else{
			al.add(new Integer(presteps));
			equal = getMinStep(al,cur+presteps,end);
			al.remove(steps+1);
		}
		
		if(equal<end) return equal;
		if(presteps<=1) minus1 =  end;
		else{
			al.add(new Integer(presteps-1));
			minus1 = getMinStep(al,cur+presteps-1,end);
			al.remove(steps+1);
		}
		if(minus1<end) return minus1;
		return Math.min(plus1, Math.min(equal, minus1));
		
		
		
		
	}

}
