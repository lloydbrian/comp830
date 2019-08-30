/**
 * 
 */
package comp830.lloyd.hw1;

import java.util.Arrays;
import java.util.List;

import comp830.lloyd.util.MemoryUtilityCheck;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 */
public class CountVowels {

	MemoryUtilityCheck mem = new MemoryUtilityCheck();

	private final String[] VOWELS = {"a", "e", "i", "o", "u"};
	
	/**
	 * Returns the number of vowels in a string.
	 * Vowels are the letters a,e,i,o,u.  
	 * If there are no vowels, return 0.
	 * 
	 * @param inputString
	 * @return int count of vowels
	 */
	public int doWork(String inputString) {
		int vCount = 0;
		if (inputString == null || inputString.length() <= 0) return vCount;
		
		char[] iS = inputString.toCharArray();

		System.out.println("Total App Memory: " + mem.getTotalMemory() + " MB");
		List<String> cList = Arrays.asList(VOWELS);
		for (char i: iS) {
			if(cList.contains(String.valueOf(i))) { vCount++; }
		}
		System.out.println("Total App Free Mem: " + mem.getFreeMemory() + " MB");
		
		return vCount;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CountVowels cV = new CountVowels();
		System.out.println(cV.doWork("abc123asdabnsdfasfuiuo"));

	}

}
