import java.util.Arrays;


public class Permuation {
	
	public static void main(String[] args){
		
		QuickPerm("1234");
	}
	
	public static void QuickPerm(String str){
		char[] cstr = str.toCharArray();
		int len = cstr.length;
		int[] p = new int[len];
		for(int i =0; i<len; i++) p[i] = 0;
		int i=1;
		
		System.out.println(cstr);
		System.out.println(Arrays.toString(p));
		
		while(i<len){
			if(p[i]<i){
				int j = (i%2==0)?0:p[i];
				cstr[i] += cstr[j];
				cstr[j] = (char)(cstr[i]-cstr[j]);
				cstr[i] = (char)(cstr[i]-cstr[j]);
				System.out.println("swap "+i+" "+j);
				System.out.println(cstr);
				
				p[i]++;
				i=1;
				System.out.println(Arrays.toString(p));
				
			}else{
				p[i]=0;
				i++;
			}
		}
		
	}
	
	
}
