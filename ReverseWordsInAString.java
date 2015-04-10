public class ReverseWordsInAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public String reverseWords(String s) {
		 char[] schar = s.toCharArray();
		 reverseWord(schar, 0, schar.length-1);
		 StringBuilder ret = new StringBuilder();
		 int i=0, j=0;
		 while(j<=schar.length)
		 {
			 if(j== schar.length||schar[j] == ' ')
			 {
				 while(i<j)
				 {
					 if(schar[i]!=' ') break;
					 i++;
				 }
				 if(i<j)
				 {
					 reverseWord(schar, i, j-1);
					 for(int k = i; k<j;k++)
					 {
						 ret.append(schar[k]);
					 }
					 ret.append(' ');
				 }
				 i = j;
				 j++;
			 }
			 else
			 {
				 j++;
			 }
		 }
		 
		 if(ret.length()>0) ret.deleteCharAt(ret.length()-1);
		 return ret.toString();
	        
	 }
	 
	 public void reverseWord(char[] schar, int i, int j)
	 {
		 for(int k = i, r = j; k<r; k++, r--)
		 {
			 char temp = schar[k];
			 schar[k] = schar[r];
			 schar[r] = temp;
		 }
	 }

}
