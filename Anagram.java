import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Anagram {
	
	public static void main(String[] args){
		String[] strs = {"","b","ab","ba"};
		ArrayList<String> a = anagrams(strs);
		System.out.println(a);
		
		String b = "sa";
		if(b.matches("s.")){
			System.out.println("regex here!");
		}
		
	}
	 public static ArrayList<String> anagrams(String[] strs) {
		 List<String> strslist = new LinkedList<String>(Arrays.asList(strs)); 
		 ArrayList<String> all = new ArrayList<String>();
		 while(strslist.size()>1){
			 boolean hasanagram = false;
			 int i =1;
			 while(i< strslist.size()){
				 if(isanagram(strslist.get(0), strslist.get(i))){
					 if(!hasanagram){
						 all.add(strslist.remove(i));
						 hasanagram = true;
						 continue;
						 
					 }
					 else{
						 
						 all.add(strslist.remove(i));
						 continue;
					 }
				 }
				 i++;
			 }
			 if(hasanagram){
				 all.add(strslist.remove(0));
			 }else{
				 strslist.remove(0);
			 }
		 }
	        
		 return all;
		 
	        
	 }
	 
	 public static boolean isanagram(String str1, String str2){
		 char[] str1arr = str1.toCharArray();
		 char[] str2arr = str2.toCharArray();
		 Arrays.sort(str1arr);
		 Arrays.sort(str2arr);
		 
		 
		 String str1new = new String(str1arr);
		 String str2new = new String(str2arr);
		 
		 return str1new.equals(str2new);
	 }

}
