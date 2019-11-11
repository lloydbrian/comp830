package com.lloyd.comp830.exam.q2;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	List<InventoryItem> items;
	int weight;
	
	public Inventory() {
		weight = 0;
		items = new ArrayList<InventoryItem>();
	}
	
	/**
	 * Updated as
	 * DefectID 05 identified through TestCase04
	 * from InventoryTest class
	 * Original behavior does not return the correct weight
	 * 
	 */
	public boolean addItemToInventory(InventoryItem i) {

		if(weight <= 250) {
			weight += i.getWeight();
			items.add(i);
			return true;
		}
		return false;	
	}
	
	/**
	 * Updated through 
	 * DefectID 03 identified through TestCase03
	 * from InventoryTest class
	 * Original behavior does not correct the total weight
	 * New behavior returns total weight of those in the inventory
	 */
	public boolean dropInventoryItem(InventoryItem i) {
		if (items.contains(i)) {
			weight -= i.getWeight();
			items.remove(i);
			return true;
		}
		return false;
	}
	
	public int getWeight() {return weight; }
	
	/**
	 * Updated through 
	 * DefectID 02 identified through TestCase02
	 * from InventoryTest class
	 * Original behavior returns the size of the array
	 * New behavior returns total count of items for
	 * all inventory items
	 */
	public int getCount() {
		int totalCount = 0;
		for (InventoryItem item : items) {
			totalCount += item.getCount();
		}
		return totalCount;
	}

	/**
	 * Updated through 
	 * DefectID 01 identified through TestCase01
	 * from InventoryTest class
	 * Original behavior returns the last element only
	 * Made concatenation worked.
	 */
	public String toString() {
		StringBuilder ret = new StringBuilder("Your inventory has:\n");
		
		for (InventoryItem i : items) {
			ret.append(i.toString()).append("\n");
		}
		return ret.toString();
	}
}
