import java.util.ArrayList;
import java.util.HashMap;


public class Tongji {
	
	public static void main(String[] args){
		
		char[] input = "bbCca*".toCharArray();
		System.out.println(tongji(input, 6));
		
	}
	
	public static String tongji(char[] input, int len){
		
		ArrayList<String> al = new ArrayList<String>();
		/*
		HashMap m = new HashMap();
		m.put("first","second");
		System.out.println(m.get("second"));
		*/
		int arrlen = 0;
		for(int i = 0; i<len; i++){
			
			char alter =input[i];
			if(input[i]>='a'&&input[i]<='z'){
				alter = (char)(input[i] + 'A' - 'a');
			}
			else if(input[i]>='A'&&input[i]<='Z'){
				alter = (char)(input[i] + 'a' - 'A');
			}
			int j = 0;
			for(j =0; j< arrlen; j=j+2){
				if(al.get(j).equals(""+input[i])||al.get(j).equals(""+alter)){
					al.set(j+1, String.valueOf(Integer.parseInt(al.get(j+1))+1));
					break;
				}
			}
			if (j==arrlen){
				al.add(""+input[i]);
				al.add(""+1);
				arrlen += 2;
			}
			
		}
		
		String result = "";
		for(int k = 0; k<al.size(); k=k+2){
			result += al.get(k)+": "+al.get(k+1)+" ";
		}
		System.out.println(al.toString());
		
	
	return result;
	}

}
