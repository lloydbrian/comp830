/**
 * 
 */
package com.lloyd.comp830.exam.q2;

/**
 *
 */
public class InventoryItem {
	//updated instance variables to private
	private String type;
	private int weight;
	private String name;
	private int count; // 1 if a single item; more if multiple
	
	public InventoryItem(String t, int w, String n, int countOfItems) {
		type = t;
		weight = w;
		name = n;
		count = countOfItems;
	}
	
	public String getName() { return name;}
	public String getType() { return type;}
	public int getWeight() {return weight;}
	public int getCount() {return count;}
	
	/**
	 * Updated to use the accessor methods
	 * Updated as well 
	 * DefectID 04 identified through TestCase04
	 * from InventoryTest class
	 * Original behavior does not correct only the name
	 * New behavior returns the proper toString
	 * 
	 */
	@Override
	public String toString() {
		String ret  = getName() + " getType() (" + type + "), wt: " + getWeight();
		StringBuilder retMe = new StringBuilder(ret);
		if (getCount() > 1) {
			retMe.append(", there are " + getCount() + " left");
		}
		return retMe.toString();
		
	}


}
