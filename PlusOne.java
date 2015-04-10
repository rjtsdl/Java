
public class PlusOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] plusOne(int[] digits) {
		int moreDigit = 1;
		for(int i: digits)
		{
			if(i!= 9 ) {
				moreDigit = 0;
				break;
			}
		}
		int[] ret = new int[digits.length + moreDigit];
		ret[ret.length-1] = 1;
		for(int i=digits.length-1; i>=0; i--)
		{
			int temp = ret[i+moreDigit] + digits[i];
			ret[i+moreDigit] = temp%10;
			if(i + moreDigit >= 1){
				ret[i+moreDigit-1] = temp/10;
			}
		}
		
		return ret;
    }

}
