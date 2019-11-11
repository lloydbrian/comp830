/**
 * 
 */
package com.lloyd.comp830.exam.q5;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public abstract class SpaceShip {
	protected int tonnage;
	protected String name;
	protected String franchise;
	
	public int getTonnage() { return tonnage;}
	public String getName() { return name;}
	public String getFranchise() {return franchise;}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(getName()).append(" : ").append(getTonnage()).append(" : ").append(getFranchise());
		return str.toString();
	}

}
