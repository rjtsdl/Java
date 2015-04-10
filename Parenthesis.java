import java.util.ArrayList;


public class Parenthesis {
	

	public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        char[] sc = s.toCharArray();
        if(sc.length<=1) return false; 
        ArrayList al = new ArrayList();
        for(int i=0; i<sc.length; i++){
            if(al.size()==0){
                al.add(""+sc[i]);
            }else if((sc[i]==')' &&al.get(al.size()-1).equals("("))||
            		(sc[i]==']' &&al.get(al.size()-1).equals("["))||
            		(sc[i]=='}' &&al.get(al.size()-1).equals("{"))
            		){
            	al.remove(al.size()-1);
            }else {
            	al.add(""+sc[i]);
            }
            
        }
        
        return al.size() == 0;
        
    }
}
