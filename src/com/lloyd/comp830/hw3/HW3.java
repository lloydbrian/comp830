/**
 * 
 */
package com.lloyd.comp830.hw3;

import com.lloydbriantech.common.MemoryUtilityCheck;

/**
 * @author lloydbriantech 2019
 *
 */
public class HW3 {

	MemoryUtilityCheck mem = new MemoryUtilityCheck();
	private static String className = "";
	private static String pfixLog  = "";

	/**
	 * Constructor
	 */
	public HW3() {
		className = this.getClass().getName();
		pfixLog = "[" + className + "]: ";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UsesStrategyPattern usP = new UsesStrategyPattern();
		Comp730830StringUtils cV = new CountVowels();
		Comp730830StringUtils isGS = new IsGrimString(); 
		Comp730830StringUtils sumDig = new SumDigitsInString();;
		
		usP.invokeStringOperations("Abc123asdabnsdfasfuiuo");
		usP.addStringOperation(cV);
		usP.addStringOperation(isGS);
		usP.addStringOperation(sumDig);
		usP.invokeStringOperations("Abc123asdabnsdfasfuiuo");
		usP.invokeStringOperations("grGRasdfasfa");
		usP.invokeStringOperations("abc9asdf!@#!@102011");
		usP.clearStringOperations();
		usP.invokeStringOperations("grGRasdfasfa");		
		
	}

}
