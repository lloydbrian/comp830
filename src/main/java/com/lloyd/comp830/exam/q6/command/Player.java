/**
 * 
 */
package com.lloyd.comp830.exam.q6.command;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public class Player {

	private static String className = "";
	private static String pfixLog  = "";
	private int xCoord = 0;
	private int yCoord = 0;

	private String name = "";
	
	public Player (String name) {
		className = this.getClass().getName();
		pfixLog = "[" + className + "]: ";
		
		this.name = name;
	}
	
	/**
	 * @return the xCoord
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * @return the xCoord
	 */
	public int getxCoord() {
		return xCoord;
	}


	/**
	 * @param xCoord the xCoord to set
	 */
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}


	/**
	 * @return the yCoord
	 */
	public int getyCoord() {
		return yCoord;
	}


	/**
	 * @param yCoord the yCoord to set
	 */
	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}


	/**
	 * @param xCoord the xCoord to set
	 */
	public void addToXCoord(int units) {
		xCoord += units;
	}


	/**
	 * @param yCoord the yCoord to set
	 */
	public void addToYCoord(int units) {
		yCoord += units;
	}

}
