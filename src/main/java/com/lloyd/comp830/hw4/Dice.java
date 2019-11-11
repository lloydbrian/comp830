/**
 * 
 */
package com.lloyd.comp830.hw4;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 * Representatation of the Dice object version 1
 */
public class Dice {

	private final int DEFAULT_TOTAL_SIDES = 6;	
	private int totalSides = 0;
	private int topSideNumber = 0;

	/**
	 * 
	 */
	public Dice() {
		this.totalSides = DEFAULT_TOTAL_SIDES;
	}

	public Dice(int totalSides) {
		this.totalSides = totalSides;
	}
	
	
	public void setTotalSides(int totalSides) {
		this.totalSides = totalSides;
	}
	
	public int getTotalSides() {
		return totalSides;
	}

	public void setTopSideNumber(int side) {
		this.topSideNumber = side;
	}
	
	public int getTopSideNumber( ) {
		return topSideNumber;
	}
	
}
