
public class NextPermutation {
	
	public static void main(String[] args){
		String start = "1234";
		do{
			start = getNext(start);
			System.out.println(start);
		}
		while(!start.equals("1234"));
	}

	
	public static String getNext(String str){
		char[] perm = str.toCharArray();
		int j= perm.length-1;
		while(j-1>=0&&perm[j]<perm[j-1]){
			j--;
		}
		if(j!=0){
			int i;
			for(i=j;i<perm.length&&perm[i]>perm[j-1];i++);
			char temp = perm[j-1];
			perm[j-1] = perm[i-1];
			perm[i-1] = temp;
		}
		//reverse j - final
		int s = j;
		int e = perm.length-1;
		while(s<e){
			char temp = perm[s];
			perm[s] = perm[e];
			perm[e] = temp;
			s++;
			e--;
		}
		
		return new String(perm);
	}
}
