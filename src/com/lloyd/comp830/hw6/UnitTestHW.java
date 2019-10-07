/**
 * 
 */
package com.lloyd.comp830.hw6;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to be unit tested
 * 
 * @author Prof. Nelson 2019
 *
 */
public class UnitTestHW {
	private int sum;
	private int average;
	List<Integer> numbersInData = null;
	private int a;
	private int countOfInts = 0;
	
	public UnitTestHW() {
		initialize();
	} 
	private void initialize() {
		numbersInData = new ArrayList<Integer>();
		sum = 0;
		average =0;
	}
	
	// This can be a overidden constructor method
	public void MysteryMethod(int a, int b) {
		sum = a;
		average = b;
		initialize();
	}
	public void addNumberToList(int a) {
		numbersInData.add(new Integer(a));
	}
	public void removeNumberFromList(int b) {
		// original line numbersInDate.remove(a)
		// updated because what it should remove is b
		// also remove() removes from an index and not the actual object
		
		numbersInData.remove(numbersInData.indexOf(b));
		while(numbersInData.contains(b)) {
			removeNumberFromList(b);
		}
	}
	public void computeSum() {
		// deleted line
		// original int sum = 0 overrides the class instance
		for (Integer n : numbersInData) {
			sum += n;
		}
	}
	public void computeNumberOfInts() {
		countOfInts = numbersInData.size();
	}
	public int getAverage() {
		a = sum;
		if (countOfInts <= 0) {
			return 0;
		} else {
			return sum / countOfInts;
		}
	}
}