import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;


public class Translate {
	
	public static void main(String[] args){
		String ss = "AAAAAAAAAAAAAAAAAAAAAAAABCCCC";
		char[] dest = new char[10];
		encode(ss.toCharArray(), dest);
		System.out.println(Arrays.toString(dest));
		
		
	}
	public static void encode(char[] text, char[] dest){
		
		char a = text[0];
		int sa = 1;
		LinkedList<Character> records = new LinkedList<Character>();
		for(int i = 1; i<text.length; i++){
			if (text[i] != a){
				records.add(new Character(a));
				records.add(new Character((char)sa));
				a = text[i];
				sa = 1;
			}
			else{
				
				sa ++;
			}
		}
		records.add(new Character(a));
		records.add(new Character((char)sa));
		
		Iterator<Character> I = records.iterator();
		
		int in = 0;
		String str = new String();
		while(I.hasNext()){
			String aa = ""+ I.next().charValue();
			int saa = (int)I.next().charValue();
			if (aa.equals("1")){
				aa = "1" + aa;
			}
			
			if(saa == 1){
				if (in == 0){
					str = str + '1'+ aa;
					in = 1;
				}else if (in == 1){
					str = str + aa;
				}
			}
			else if(saa>=2&&saa<=9){
				if (in == 0){
					str = str + saa + aa;
					
				}else if (in == 1){
					str = str + '1' + saa + aa;
					in = 0;
				}
			}
			else if(saa > 9){
				if (in == 0){
					while(saa > 9){
						str = str + "9" + aa;
						saa = saa - 9;
					}
					str = str + saa + aa;
					
				}else if (in == 1){
					str = str + '1';
					in = 0;
					while(saa > 9){
						str = str + "9" + aa;
						saa = saa - 9;
					}
					str = str + saa + aa;
					
					
				}
				
			}
			
			
		}
		if (in == 1){
			str = str + '1';
		}
		
		System.out.print(str);
		dest =  str.toCharArray();
		
	}
}
