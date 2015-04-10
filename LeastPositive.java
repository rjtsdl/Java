
public class LeastPositive {
	
	public static int GetLeastPositive(int range){
		
		int res = 1;
		for(int i =1; i<= range; i++){
			int cur = res;
			while(res%i!=0){
				res+=cur;
			}
		}
		return res;
	}
	
	public static void main(String[] args){
		System.out.print(GetLeastPositive(20));
	}

}
