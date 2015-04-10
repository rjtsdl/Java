
public class CommonInTreeArray {
	
	public static void main(String[] args){
		int[] A = {1,3,4,6,7,8,12,65};
		int[] B = {2,4,7,8,9,21,35};
		int[] C = {4,23,54};
		FindCommon(A,B,C);
	}
	
	public static void FindCommon(int[] A, int[] B, int[] C){
		int i=0;
		int j=0;
		int k=0;
		while(i<A.length&&j<B.length&&k<C.length){
			if(A[i] ==B[j]&&B[j]==C[k]){
				System.out.print(A[i]);
				return;
			}
			int min = Math.min(A[i], Math.min(B[j], C[k]));
			
			if(min==A[i]) i++;
			if(min==B[j]) j++;
			if(min==C[k]) k++;
			
		}
		
		System.out.print("No Such Number!!!!");
	}

}
