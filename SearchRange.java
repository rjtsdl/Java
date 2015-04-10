
public class SearchRange {
	    public int[] searchRange(int[] A, int target) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        
	        int[] pos = new int [2];
	        pos[1] = -1;
	        pos[0] = -1;
	        int start0 =0; 
	        int end0 = A.length-1;
	        int start1 = 0;
	        int end1 = A.length -1;
	        int mid = start0 +(end0-start0)/2;
	        do{
	            if(A[mid]==target){
	                end0=mid;
	            }
	            
	            else if(A[mid]< target){
	                start0 = mid+1;
	            }
	            else{
	                end0 = mid-1;
	                end1 = mid-1;
	            }
	            
	            mid = start0+(end0-start0)/2;
	        }
	        while(start0<end0-1);
	        
	        if(start0>A.length-1||end0<0) return pos;
	        
	        if(A[start0] == target){
	            pos[0] = start0;
	        }
	        else if(A[end0] == target){
	            pos[0] = end0;
	        }
	        else{
	            pos[0] = -1;
	            pos[1] = -1;
	            return pos;
	        }
	        
	        start1= pos[0];
	        mid = start1 + (end1-start1)/2;
	        
	        do{
	            if(A[mid]==target){
	                start1=mid;
	            }
	            else if(A[mid]>target){
	                end1= mid-1;
	            }
	            mid = start1+(end1-start1)/2;
	        }
	        while(start1<end1-1);
	        
	        if(A[end1] == target){
	            pos[1] = end1;
	        }else{
	            pos[1] = start1;
	        }
	        
	        return pos;
	        
	        
	        
	        
	        
	    }
	

}
