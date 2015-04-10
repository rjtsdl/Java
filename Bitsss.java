
public class Bitsss {
	
	public static void main(String[] args){
		
		int[] income = {5,6,7};
		int max  = 8;
		int[] check ={1,2,4};
		for(int i =0; i<max; i++){
			for(int j=0; j<check.length; j++){
				if((check[j]&i)!=0){
					System.out.print(income[j]);
					
				}
			}
			System.out.print("\n");
		}
	}

}
