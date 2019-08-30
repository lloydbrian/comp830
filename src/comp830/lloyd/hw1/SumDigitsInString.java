/**
 * 
 */
package comp830.lloyd.hw1;

/**
 * @author lloydbrian
 *
 */
public class SumDigitsInString {
	
	/**
	 * Scan each character of a a string and return the sum of all digits in 
	 * the string.  If there are no digits in the string, then the method 
	 * returns  zero.  Use Character.isDigit() to determine if a character 
	 * is a digit. Ignore non-digits in the string.
	 * 
	 * @param theString
	 * @return int sum of digits in the String
	 */
	public int doWork(String theString) {
		int sum = 0;
		if (theString == null || theString.length() <= 0) return sum;
		
		char sChar[] = theString.toCharArray();				
		for (char sC: sChar) {
			if (Character.isDigit(sC)) {
				sum  += Integer.parseInt(String.valueOf(sC));
			}
		}	
		return sum;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumDigitsInString sumDig = new SumDigitsInString();
		System.out.println(sumDig.doWork("102011"));

	}

}
