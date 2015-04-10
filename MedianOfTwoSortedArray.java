
public class MedianOfTwoSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Accepted first shot, good job
	public double findMedianSortedArrays(int A[], int B[]) {
		
		int size = A.length + B.length;
		
		if(size == 0) return 0.0;
		
		if(size%2==1)
		{
			return (double)findKthValueInSortedArray(A, B, 0, A.length-1, 0, B.length-1, size/2+1);
		}
		else
		{
			return (double)findKthValueInSortedArray(A, B, 0, A.length-1, 0, B.length-1, size/2)/2 +
					(double)findKthValueInSortedArray(A, B, 0, A.length-1, 0, B.length-1, size/2+1)/2;
		}
		
        
    }
	
	int findKthValueInSortedArray(int A[], int B[], int startA, int endA, int startB, int endB, int k)
	{
		int min = 0;
		int max = Integer.MAX_VALUE;
		int order = k;
		while(startA<=endA || startB<=endB)
		{
			int pivot = min + (max-min)/2;
			int[] a = partition(A, startA, endA, pivot);
			int[] b = partition(B, startB, endB, pivot);
			
			int lessNumber = a[0] - startA + b[0] - startB + 2;
			//int largerNumber = endA-a[1]+1 + endB-b[1]+1;
			int equalNumber = a[1] - a[0] -1 + b[1] - b[0] - 1;
			
			if(lessNumber >= order)
			{
				endA = a[0];
				endB = b[0];
				max = pivot-1;
			}
			else if (lessNumber + equalNumber >= order )
			{
				return pivot;
			}else 
			{
				startA = a[1];
				startB = b[1];
				order = order - lessNumber - equalNumber;
				min = pivot + 1;
			}
			
		}
		
		return min;
		
	}
	
	// return index means in the array, index < ret, the value < pivot, so pivot could be end + 1
	int[] partition(int[] arr, int start, int end, int pivot)
	{
		int[] ret = new int[2];
		ret[0] = end;
		ret[1] = start;
		int i = start;
		int j = end;
		
		
		while(i<=j)
		{
			while(i<=end && arr[i] <= pivot)
			{
				i++;
			}
			while(j>=start && arr[j] >= pivot)
			{
				j--;
			}
			if(i<j&&i<=end&&j>=start)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			else 
			{
				ret[0] = j;
				ret[1] = i;
			}
		}
		return ret;
	}

}
