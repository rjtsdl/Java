
public class MissingInteger {
	
	
	public static void main(String[] args){
		int[] arr = {2,3,5};
		System.out.println(getMissingOne(arr));
	}
	
	public static int getMissingOne(int[] arr){
		
		if (arr.length<=1) return -1;
		int head, tail;
		for(head=0, tail = arr.length-1;tail-head != 1; ){
			int mid = head+(tail-head)/2;
			if(arr[head]-arr[mid] == head-mid){
				head = mid;
			}else{
				tail = mid;
			}
		}
		
		return (arr[head]+arr[tail])/2;
	}

}
