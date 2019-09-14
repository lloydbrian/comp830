/**
 * 
 */
package com.lloyd.comp830.hw3;

import com.lloydbriantech.common.MemoryUtilityCheck;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 */
public class IsGrimString implements Comp730830StringUtils {

	MemoryUtilityCheck mem = new MemoryUtilityCheck();
	
	private static final String GRGRSTRING = "grgr";
	private static final String GRSTRING = "gr";
	private static String className = "";
	private static String pfixLog  = "";
	
	// Constructor
	IsGrimString(){
		className = this.getClass().getName();
		pfixLog = "[" + className + "]: ";
	}

	/**
	 * return true if a string is grim
	 * 'grim' if every occurrence of 'gr' is followed by another 'gr'.  
	 * Some examples:  "great!" returns false, "hello grgr bbbb gr" returns 
	 * false (last 'gr' by itself), "randomgrgrnoisegrgrhappy" returns true.
	 * 
	 * @param theString
	 * @return bool
	 */
	@Override
	public Object doWork(String theString) {

		boolean bool = false;
		if (theString == null || theString.length() <= 0) return bool;

		System.out.println( pfixLog + "Total App Memory: " + mem.getTotalMemory() + " MB");

		theString = theString.toLowerCase();
		if(theString.contains(GRGRSTRING)) {
			String[] grSplit = theString.split(GRGRSTRING);
			String filtered = String.join("", grSplit);			
			bool = filtered.contains(GRSTRING) ? false : true;
		} 
		System.out.println(pfixLog + "Total App Free Mem: " + mem.getFreeMemory() + " MB");

		return bool;
	}

	/**
	 * getMyName() method from interface to show class name
	 */
	@Override
	public String getMyName() {
		return "IsGrimString() Class";
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		Comp730830StringUtils isGS = new IsGrimString();
		System.out.println(pfixLog + isGS.doWork("grGRasdfasfa")); //true
		System.out.println(pfixLog + isGS.doWork("grabcgRasdfasfa")); //false
		System.out.println(pfixLog + isGS.doWork("hello grgr bbbb gr")); //false
		System.out.println(pfixLog + isGS.doWork("randomgrgrnoisegrgrhappy")); //true
		System.out.println(pfixLog + isGS.doWork("random")); //false
		*/
	}


}
