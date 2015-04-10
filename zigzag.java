
public class zigzag {
	
	public static void main(String[] args){
		String hehe = convert("PAYPALISHIRING",3);
		System.out.println(hehe);
		
	}
	
	// Leetcode Online Judge Accepted
	public static String convert(String s, int nRows) {
	
		if (nRows <=1) return s;
        
        char[] schar = s.toCharArray();
        String[] sstring = new String[nRows];
        for(int j =0; j<sstring.length; j++){
        	sstring[j] = "";
        }
        for(int i =0; i<schar.length; i++){
        	int rowno = i%(2*nRows - 2);
        	if(rowno >= nRows){
        		rowno  = 2*nRows - rowno-2;
        	
        	}
        	sstring[rowno] += schar[i];
        }
        String all ="";
        for(int t =0; t < sstring.length; t++){
        	all += sstring[t];
        }
        
        return all;
        
    }

}
