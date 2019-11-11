/**
 * 
 */
package com.lloyd.comp830.hw2;

import com.lloydbriantech.common.MemoryUtilityCheck;
import java.util.ArrayList;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public class HW2 {

	MemoryUtilityCheck mem = new MemoryUtilityCheck();
	Comp730830StringUtils cV, isGS, sumDig = null;

	private static String className = "";
	private static String pfixLog  = "";

	// Constructor
	public HW2() {
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
		HW2 newHw2 = new HW2();
				
		System.out.println(pfixLog + newHw2.cV.doWork("Abc123asdabnsdfasfuiuo"));
		System.out.println(pfixLog + newHw2.isGS.doWork("grGRasdfasfa")); //true
		System.out.println(pfixLog + newHw2.isGS.doWork("grabcgRasdfasfa")); //false
		System.out.println(pfixLog + newHw2.sumDig.doWork("abc9asdf!@#!@102011"));

		/**
		 * Challenge:
		 * create object from each class, and store the object in an array.  
		 * Store 3 test strings in a string array.  
		 * Then loop through the arrays, 
		 * invoking objArray[i].doWork(testData[i]), 
		 * until you reach the end of the array.
		 */
		CountVowels cVBonus = new CountVowels(); 
		IsGrimString isGSBonus = new IsGrimString(); 
		SumDigitsInString sumDigBonus = new SumDigitsInString();;
				
		ArrayList<Comp730830StringUtils> stUtilsObjArray = new ArrayList<Comp730830StringUtils>();
		stUtilsObjArray.add(cVBonus);
		stUtilsObjArray.add(isGSBonus);
		stUtilsObjArray.add(sumDigBonus);
		
		ArrayList<String> testData = new ArrayList<String>();
		testData.add("Abc123asdabnsdfasfuiuo");
		testData.add("grGRasdfasfa");
		testData.add("abc9asdf!@#!@102011");
		
		System.out.println(pfixLog + "Start of Challenge...");
		for (Comp730830StringUtils stUtilsIns : stUtilsObjArray) {
			String tD = testData.get(stUtilsObjArray.indexOf(stUtilsIns));
			String printMe = String.valueOf(stUtilsIns.doWork(tD));
			System.out.println(pfixLog + "TEST DATA = " + tD + " TEST RESULT = " + printMe);
		}
		System.out.println(pfixLog + "...End of Challenge");
		
	}

}
