import java.util.Arrays;


public class Minimal {
	
	public static void main(String[] args){
		int[] possible = new int[]{
				1,2,3,4
		};
		System.out.println(getminimal("1000",possible));
	}
	
	public static String getminimal(String threshold, int[] possible){
		threshold = String.valueOf(Integer.parseInt(threshold)+1);
		int len = threshold.length();
		Arrays.sort(possible);
		System.out.println(Arrays.toString(possible));
		char[] thres = threshold.toCharArray();
		
		for(int i = 0; i< len; i++){
			thres[i]--;
		}
		
		int i = 0;
		while(i<len){
			System.out.println(String.valueOf(thres));
			int the = getnolessthan(thres[i], possible);
			if (the == 10){
				thres[i] = '0';
				i--;
				if (i<0){
						String result ="";
						for(int j =0; j<len; j++){
							result +=possible[0];
						}
						return getfirstnonzero(possible) + result;
				}
				continue;
			}
			
			
			if (the > thres[i]+1 -'0'){
				thres[i] = (char)('0'+the);
				i++;
				String result="";
				for(int j = i;j<len;j++){
					result+= possible[0];
				}
				return String.valueOf(thres, 0, i)+result;
			}
			
			if(the == thres[i] +1 - '0'){
				thres[i] = (char)('0'+the);
				i++;
				
			}
			if (i== len){
				return String.valueOf(thres);
			}
			
		}
		return String.valueOf(thres);
		
		
		
		
		
	}
	
	public static int getnolessthan(char x, int[] possible){
		int len = possible.length;
		int xint = (int)(x-'0');
		for (int i =0; i< len; i++){
			if(possible[i]>xint){
				return possible[i];
			}
		}
		return 10;
	}
	
	public static int getfirstnonzero(int[] possible){
		if (possible[0]!=0){
			return possible[0];
		}
		if (possible.length>=2){
			return possible[1];
		}
		return 0;
	}

}
