/**
 * 
 */
package com.lloyd.comp830.hw3;

import java.util.ArrayList;

import com.lloydbriantech.common.MemoryUtilityCheck;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public class UsesStrategyPattern {
	
	MemoryUtilityCheck mem = new MemoryUtilityCheck();
	private static String className = "";
	private static String pfixLog  = "";
	private ArrayList<Comp730830StringUtils> strategyObjects = null;
	
	/**
	 * 
	 */
	public UsesStrategyPattern() {
		className = this.getClass().getName();
		pfixLog = "[" + className + "]: ";
		strategyObjects = new ArrayList<Comp730830StringUtils>();
	}

	/**
	 * Adds a Comp730830StringUtils object to the ArrayList
	 * 
	 * @param stratObject
	 */
	public void addStringOperation(Comp730830StringUtils stratObject) {
		if(stratObject == null) {
			System.out.println(pfixLog + "Comp730830StringUtils object is NULL. Nothing to add.");
		} else {
			strategyObjects.add(stratObject);
			System.out.println(pfixLog + "Comp730830StringUtils added " + stratObject.getMyName());	
		}		
	}
	
	/**
	 * 
	 */
	public void clearStringOperations() {
		if(!strategyObjects.isEmpty()) strategyObjects.clear();
		System.out.println(pfixLog + "Comp730830StringUtils ArrayList is empty. " + strategyObjects.size());	
	}
	
	/**
	 * 
	 * @param stringToOperateOn
	 */
	public void invokeStringOperations (String stringToOperateOn) {
		if (stringToOperateOn != null && stringToOperateOn.length() >= 0 && strategyObjects.size() > 0) {
			for(Comp730830StringUtils strObj : strategyObjects) {
				System.out.println(pfixLog + "Input: " + stringToOperateOn + " Sent to: " + strObj.getMyName() + " Returns: " + strObj.doWork(stringToOperateOn));
				
			}
		} else {
			System.out.println(pfixLog + "No available operation for: " + stringToOperateOn);			
		}
	}	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
