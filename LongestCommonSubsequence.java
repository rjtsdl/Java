import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LongestCommonSubsequence {
	
	
	public static void main(String[] args) {
		try {
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String[] lineArray = line.split("\\s");
                if (lineArray.length > 0) {
                    // Process line of input Here
                	String[] input = lineArray[0].split(";");
                    System.out.println(getSubsequence(input[0],input[1]));
                } 
            }
            System.exit(0);
        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
        }    

	}

	
	
	public static String getSubsequence(String str1, String str2){
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		String[][] ret = new String[len1+1][len2+1];
		
		ret[0][0] = "";
		for(int i=1; i<=len1; i++){
			ret[i][0] = "";
		}
		for(int i=1; i<=len2; i++){
			ret[0][i] = "";
			
		}
		
		for(int i=1; i<=len1; i++){
			for(int j=1; j<=len2; j++){
				if(arr1[i-1] == arr2[j-1]){
					if(ret[i-1][j].length()>ret[i][j-1].length()){
						ret[i][j] = ret[i-1][j]+arr1[i-1];
					}else{
						ret[i][j] = ret[i][j-1]+arr1[i-1];
					}
				}else{
					if(ret[i-1][j].length()>ret[i][j-1].length()){
						ret[i][j] = ret[i-1][j];
					}else{
						ret[i][j] = ret[i][j-1];
					}
				}
			}
		}
		
		return ret[len1][len2];
	}

}
