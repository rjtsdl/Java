import java.util.Arrays;


public class KMPSample {
	
	
	public static void main(String[] args){
		String word = "rjtsdlrjtsdlrlllll";
		int[] table = new int[word.length()];
		partial_table(word.toCharArray(), table, word.length());
		System.out.println(Arrays.toString(table));
	}
	
	
	public static void partial_table(char[] word, int[] table, int size)
    {
        if (0 == size)
            return;
        
        if (1 == size)
        {
            table[0] = -1;
            return;
        }
        
        table[0] = -1;
        table[1] = 0;
        
        int pos = 2;
        int cnd = 0;
        while(pos < size)
        {
            if (word[pos - 1] == word[cnd])
                table[pos++] = ++cnd;
            else if (cnd > 0)
                cnd = table[cnd];
            else
                table[pos++] = 0;
        }
    }

}
