import java.util.Arrays;


public class FirstN {
	
	public static void generate(int a, int b, int N, int[] Q){
		
		int number = 0;
		int aprevious = 0;
		int bprevious = 0;
		while (number<N){
			
			if(a+aprevious > b+bprevious){
				Q[number] = b+bprevious;
				bprevious = b+bprevious;
				number++;
			}
			else{
				Q[number] = a+aprevious;
				aprevious = a+aprevious;
				number++;
			}
		}
	}
	
	public static void main(String[] args){
		
		int [] Q = new int[10];
		generate(3,5,10,Q);
		System.out.println(Arrays.toString(Q));
		
		
	}

}
