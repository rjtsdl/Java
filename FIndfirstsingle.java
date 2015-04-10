import java.util.HashMap;


public class FIndfirstsingle {
	
	public static void main(String[] args){
		String str = new String("lsjjflsjflja");
		System.out.println(findfirstsingle(str));
	}
	
	public static char findfirstsingle(String str){
		
		char [] strchar = str.toCharArray();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (char c: strchar){
			
			if (map.containsKey(String.valueOf(c))==true){
				int value = map.get(String.valueOf(c)).intValue();
				map.put(String.valueOf(c), new Integer(value + 1));
			}
			else{
				map.put(String.valueOf(c), new Integer(1));
			}
		}
		
		for (char c : strchar){
			
			if (map.get(String.valueOf(c)).intValue() == 1){
				return c;
			}
		}
		return '\n';
		
	}

}
