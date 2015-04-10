
public class Maxsub {
	
	public static void main(String[] args){
		
		int [] arr = new int[]{2,-1,4,5};
		System.out.println(maxsub(arr));
	}
	
	public static int maxsub(int[] arr){
		int max=0, tempsum=0;
		for(int i =0; i<arr.length; i++){
			tempsum+=arr[i];
			if(tempsum>max)
				max = tempsum;
			else if(tempsum<0)
				tempsum = 0;
			
		}
		return max;
	}

}
