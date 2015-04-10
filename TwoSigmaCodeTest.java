import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;


public class TwoSigmaCodeTest {
	
	//problem one
	
	public static void main (String[] args) throws Exception{
		
		// problem #1
		/*
		System.out.println(sortByAlphaAndNum(""));
		System.out.println(sortByAlphaAndNum("car truck bus"));
		System.out.println(sortByAlphaAndNum("8 4 6 1 -2 9 5"));
		System.out.println(sortByAlphaAndNum("car truck 8 4 bus 6 1"));
		System.out.println(sortByAlphaAndNum(" "));
		*/
		
		//problem #2
		wrapper_syncDataCenter();
		
	}
	
	public static String sortByAlphaAndNum(String line){
		String[] list = line.split(" ");
		boolean[] isNum = new boolean[list.length];
		LinkedList<String> alpha = new LinkedList<String>();
		LinkedList<Integer> integer = new LinkedList<Integer>();
		for(int i =0; i<list.length; i++){
			if (checkIfNumber(list[i])){
				isNum[i] = true;
				integer.add(Integer.parseInt(list[i]));
			}else{
				isNum[i] = false;
				alpha.add(list[i]);
			}
		}
		Collections.sort(alpha);
		Collections.sort(integer);
		String result = "";
		for(int i =0; i<isNum.length; i++){
			if(isNum[i]){
				result+=integer.pollFirst()+" ";
			}else{
				result+=alpha.pollFirst()+" ";
			}
		}
		if("".equals(result)) return "";
		return result.substring(0,result.length()-1);
		
	}
	
	public static boolean checkIfNumber(String in) {
        
        try {

            Integer.parseInt(in);
        
        } catch (NumberFormatException ex) {
            return false;
        }
        
        return true;
    }
	
	
	
	
	
	//problem 2
	
	public static void wrapper_syncDataCenter() throws Exception{
		
		FileInputStream fstream = new FileInputStream("/Users/Terrence/Downloads/input.txt");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(in));
		 
		String number = bufferRead.readLine();
		if(Integer.parseInt(number) == 0) {
			bufferRead.close();
			return;
		}
		String line1 = bufferRead.readLine();
		HashMap<String, String> map = new HashMap<String, String>();
		String[] list1 = line1.split(" ");
		for(int i =0; i<list1.length; i++){
			map.put(list1[i], ""+1);
		}
		int cur =1;
		while(cur<Integer.parseInt(number)){
			cur++;
			String line = bufferRead.readLine();
			syncDataCenter(cur, line, map);
		}
		bufferRead.close();
		
	}
	
	
	public static void syncDataCenter(int center_id, String sets, HashMap<String, String> map){
		String[] list = sets.split(" ");
		HashSet<String> local_set=  new HashSet<String>();
		for(int i =0; i<list.length; i++){
			if(!map.containsKey(list[i])){
				map.put(list[i], ""+center_id);
				for(int j =1; j<center_id; j++){
					System.out.println(list[i]+" "+center_id+" "+j);
				}
			}
			local_set.add(list[i]);
			
		}
		for(String str : map.keySet()){
			if(!local_set.contains(str)){
				System.out.println(str + " "+ map.get(str)+" "+center_id);
			}
		}
		
		
	}
	
	
	
	

}
