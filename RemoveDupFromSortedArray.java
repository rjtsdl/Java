
public class RemoveDupFromSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		divide(-1010369383, -2147483648);
	}
	
    public static  int divide(int dividend, int divisor) {
        
        boolean neg = false;
        if((dividend < 0)^(divisor<0))
        {
            neg = true;
        }
        
        long dividendabs = (long)Math.abs((long)dividend);
        long divisorabs = (long)Math.abs((long)divisor);
        
        if(dividendabs < divisorabs) return 0;
        if(divisorabs == 1)
        {
            if(neg)
            {
                return -(int)dividendabs;
            }
            return (int)dividendabs;
        }
        
        
        long temp = divisorabs;
        long constant = 1;
        while(temp < dividendabs)
        {
        	temp = temp <<1;
        	constant = constant <<1;
        }
        long remain = dividendabs;
        int ret = 0;
        while(temp >= divisorabs)
        {
           if(remain >= temp)
           {
        	   ret += constant;
        	   remain -= temp;
 
           }
           temp = temp>>1;
           constant = constant>>1;
        }
        
        if(neg)
        {
            ret = -ret;
        }
        return ret;
        
    }

}
