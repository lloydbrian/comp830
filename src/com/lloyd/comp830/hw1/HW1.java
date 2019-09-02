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
	private static String className = "";
	private static String pfixLog  = "";

	// Constructor
	public HW1() {
		className = this.getClass().getName();
		pfixLog = "[" + className + "]: ";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HW1 newHw1 = new HW1();
		
		CountVowels cV = new CountVowels();
		IsGrimString isGS = new IsGrimString();
		SumDigitsInString sumDig = new SumDigitsInString();
		
		System.out.println(pfixLog + cV.doWork("Abc123asdabnsdfasfuiuo"));
		System.out.println(pfixLog + isGS.doWorkReturnBoolean("grGRasdfasfa")); //true
		System.out.println(pfixLog + isGS.doWorkReturnBoolean("grabcgRasdfasfa")); //false
		System.out.println(pfixLog + sumDig.doWork("abc9asdf!@#!@102011"));


	}

}
