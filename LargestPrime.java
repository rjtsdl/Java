
public class LargestPrime {

	public static long getLargestPrime(long number){
		long i;
		for(i=2; i<=number; i++){
			if(number%i==0){
				System.out.print(i+" ");
				number/=i;
				i--;
			}
		}
		return i;
	}
	
	public static void main(String[] args){
		
		System.out.print(getLargestPrime(600851475143L));
	}
}
