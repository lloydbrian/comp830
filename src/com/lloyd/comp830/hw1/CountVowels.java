/**
 * 
 */
package com.lloyd.comp830.hw1;

import java.util.Arrays;
import java.util.List;

import com.lloydbriantech.common.MemoryUtilityCheck;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 */
public class CountVowels {

	MemoryUtilityCheck mem = new MemoryUtilityCheck();	
	private final String[] VOWELS = {"a", "e", "i", "o", "u"};
	private static String className = "";
	private static String pfixLog  = "";
	
	// Constructor
	CountVowels(){
		className = this.getClass().getName();
		pfixLog = "[" + className + "]: ";
	}
	
	
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

		System.out.println(pfixLog + "Total App Memory: " + mem.getTotalMemory() + " MB");
		List<String> cList = Arrays.asList(VOWELS);
		for (char i: iS) {
			if(cList.contains(String.valueOf(i).toLowerCase())) { vCount++; }
		}
		System.out.println(pfixLog + "Total App Free Mem: " + mem.getFreeMemory() + " MB");
		
		return vCount;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CountVowels cV = new CountVowels();
		System.out.println(pfixLog + cV.doWork("Abc123asdabnsdfasfuiuo"));

	}

}
