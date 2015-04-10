
public class CAVB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(getMaxmiumB(20, 1, 1)+1);

	}
	
	public static int getMaxmiumB(int n, int step, int credit)
	{
		
		if(n==1)
		{
			return step;
		}
		
		if(n==2)
		{
			return 2*step;
		}
		if(n==3)
		{
			return 3*step;
		}
		
		if(n>3)
		{
			return Math.max(step + getMaxmiumB(n-1, step, credit + step), getMaxmiumB(n-3, credit, credit));
		}
		
		return 0;
		
	}

}
