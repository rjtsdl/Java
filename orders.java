import java.util.Arrays;



public class orders {
	
	public static void main(String[] args){
		char [] str =new char[]{'a','A','B','c'};
		proc(str);
		
		System.out.println(Arrays.toString(str));
	}
	
	public static void proc(char[] str){
		
		Arrays.sort(str);
		int i = 0, j = str.length-1 ; 
		while(i < j)
		{
			char a = str[i];
			str[i] = str[j];
			str[j] = a;
		    i++;
		    j--;
		}
	}
	
	

}
