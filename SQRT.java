
public class SQRT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int sqrt(int x) {
		
		if(x<=0) return 0;
		int root = 1;
		while((root+1)*(root+1) <= x || root*root > x)
		{
			root = (x/root + root)/2;
		}
		
		return root;
        
    }

}
