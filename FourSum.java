import java.util.ArrayList;
import java.util.Arrays;


public class FourSum {
	
	public static void main(String[] args){
		
		
		
		int[] num ={-497,-488,-488,-484,-463,-463,-442,-402,-397,-394,-384,-380,-361,-358,-355,-350,-344,-338,-333,-330,-328,-325,-305,-301,-292,-290,-272,-262,-220,-202,-189,-172,-166,-162,-137,-133,-121,-90,-69,-68,-55,-51,-50,-44,-44,-38,-36,-14,-4,15,22,38,75,91,110,148,155,157,160,166,170,191,205,215,219,223,223,235,255,267,277,280,282,300,314,315,330,361,393,412,419,461,478,497};
		ArrayList<ArrayList<Integer>> all = fourSum(num, -2057);
		
		System.out.println(all.size());
		
		for(int i =0; i<all.size(); i++){
			System.out.println(all.get(i).toString());
		}
	}
	
public static ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
	ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
	
		if (num.length<4) return all;
    	
		Arrays.sort(num);
		
		int length = num.length;
		
		int a =0;
		while(a<length){
			System.out.println("a" + a);
			int b= a+1;
			while(b< length){
				System.out.println("b" + b);
				int c = b+1;
				int d = length -1;
				while(c<d){
					System.out.println("c" + c);
					System.out.println("d" + d);
					int sum = num[a]+num[b]+num[c]+num[d];
					if(sum == target){
						
						ArrayList<Integer> sub = new ArrayList<Integer>();
						sub.add(new Integer(num[a]));
						sub.add(new Integer(num[b]));
						sub.add(new Integer(num[c]));
						sub.add(new Integer(num[d]));
						all.add(sub);
						
						c = getNextFrom(num, c);
						d = getPrevFrom(num, d);
						
						
						
					}
					else if(sum<target){
						c = getNextFrom(num, c);
						
					}else{
						
						d = getPrevFrom(num, d);
					}
					
				}
				
				b = getNextFrom(num, b);
			}
			
			a = getNextFrom(num, a);
		}
		
		System.out.println("here");
		return all;
        
    }
	
	public static int getNextFrom(int[] num, int from){
		
		int dest = from;
		dest ++;
		while(dest<num.length){
			if(num[dest] == num[from]) dest++;
			else break;
		}
		return dest;
		
	}
	
	public static int getPrevFrom(int[] num, int from){
		int dest = from;
		dest--;
		while(dest>=0){
			if(num[dest] == num[from]) dest--;
			else break;
		}
		return dest;
		
	}
}
