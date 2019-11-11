/**
 * 
 */
package com.lloyd.comp830.hw1;

import com.lloydbriantech.common.MemoryUtilityCheck;

/**
 * @author lloydbriantech 2019
 *
 */
public class HW1 {

	MemoryUtilityCheck mem = new MemoryUtilityCheck();
	CountVowels cV = null;
	IsGrimString isGS = null;
	SumDigitsInString sumDig = null;

	private static String className = "";
	private static String pfixLog  = "";

	// Constructor
	public HW1() {
		cV = new CountVowels();
		isGS = new IsGrimString();
		sumDig = new SumDigitsInString();
		
		className = this.getClass().getName();
		pfixLog = "[" + className + "]: ";
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HW1 newHw1 = new HW1();
				
		System.out.println(pfixLog + newHw1.cV.doWork("Abc123asdabnsdfasfuiuo"));
		System.out.println(pfixLog + newHw1.isGS.doWorkReturnBoolean("grGRasdfasfa")); //true
		System.out.println(pfixLog + newHw1.isGS.doWorkReturnBoolean("grabcgRasdfasfa")); //false
		System.out.println(pfixLog + newHw1.sumDig.doWork("abc9asdf!@#!@102011"));

	}

}
