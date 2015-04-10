
public class Pow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public double pow(double x, int n) {
		if(n==0) return 1.0;
        if(x == 1.0) return 1.0;
        if(x == -1.0)
        {
            if(n%2==0)
            {
                return 1.0;
            }
            else
            {
                return -1.0;
            }
        
        }
		boolean isNegtaive = (n < 0);
		n = Math.abs(n);
		double x0 = x;
		double x1 = 1;
		while(n!=1)
		{
			if(n%2 == 0)
			{
				x0 *=x0;
			}
			else
			{
				x1 *=x0;
				x0 *=x0;
			}
			
			n = n/2;
		}
		if(isNegtaive)
		{
			return 1/x0/x1;
		}
		else{
			return x0*x1;
		}
        
    }

}
