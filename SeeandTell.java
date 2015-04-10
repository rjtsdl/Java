
public class SeeandTell {
	
	public static void main(String[] args){
		String seed = "1";
		for(int i = 0; i<15; i++){
			seed = SeeandTell(seed);
			System.out.println(seed);
		}
		
	}
	
	public static String SeeandTell(String seed){
		
		if(seed == null) return null;
		if(seed.length()==1) return 1+seed;
		
		char[] sarr = seed.toCharArray();
		char pre = sarr[0];
		int prenum = 1;
		String result="";
		for(int i =1; i<sarr.length; i++){
			if(sarr[i]==pre){
				prenum++;
			}else{
				result+= prenum+""+pre;
				pre = sarr[i];
				prenum = 1;
			}
			if(i== sarr.length-1){
				result+=prenum+""+pre;
			}
			
		}
		return result;
	}

}
