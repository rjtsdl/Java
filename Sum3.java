import java.util.ArrayList;
import java.util.Arrays;


public class Sum3 {
	
	public static void main(String[] args){
		
		int[] num = {0,0,0};
		ArrayList<ArrayList<Integer>> hehe = threeSum(num);
		
		for (int i =0; i<hehe.size();i++){
			System.out.println(hehe.get(i).toString());
		}
		
		
	}
	
	public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		
		ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
		if (num.length < 3)
			return all;
	   
		Arrays.sort(num);
		int first = 0;
		int last = num.length - 1;
		while(first < last){
			int middle = first + 1;
			while(middle < last){
				
				
				int sum = num[first]+num[middle]+num[last];
				if(sum == 0){
					ArrayList<Integer> sub = new ArrayList<Integer>();
					sub.add(new Integer(num[first]));
					sub.add(new Integer(num[middle]));
					sub.add(new Integer(num[last]));
					all.add(sub);
					

					
					
				}
				
				if (sum > 0){
					last = last -1;
					while (last>first&&num[last] == num[last+1]){
						last = last -1;
					}
				}
				
				if (sum <= 0){
					middle = middle +1;
					while(middle<last&&num[middle]==num[middle-1]){
						middle ++;
					}
				}
			}
			first++;
			while(first<last&&num[first] == num[first-1]){
				first++;
			}
			last =num.length - 1;
			
			
		}
		
		return all;
		
	}

}
