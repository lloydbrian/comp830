/**
 * 
 */
package comp830.lloyd.hw1;

import comp830.lloyd.util.*;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 */
public class SumDigitsInString {
	
	MemoryUtilityCheck mem = new MemoryUtilityCheck();
	
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

		System.out.println("Total App Memory: " + mem.getTotalMemory() + " MB");
		for (char sC: sChar) {
			if (Character.isDigit(sC)) {
				sum  += Integer.parseInt(String.valueOf(sC));
			}
		}	
		System.out.println("Total App Free Mem: " + mem.getFreeMemory() + " MB");
		return sum;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SumDigitsInString sumDig = new SumDigitsInString();
		System.out.println(sumDig.doWork("abc9asdf!@#!@102011"));

	}

}
