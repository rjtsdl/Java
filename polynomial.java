
public class polynomial {
	
	public static void main(String[] args){
		
		double [] A = {1.0, 2.0, 3.0};
		
		System.out.println(eval(0.1, A));
	}
	
	public static double eval(double x, double [] A){
			
		double sum = 0;
		for(int i = A.length-1; i>0; i--){
			sum = (sum + A[i])*x;
		}
		
		sum = sum + A[0];
		return sum;
		
	}

}
