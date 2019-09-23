/**
 * 
 */
package com.lloyd.comp830.hw4;

import java.util.Hashtable;
import java.util.ArrayList;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public class HW4 {

	public DiceRoller DICE_ROLLER = DiceRoller.getInstance();
	
	private static String className = "";
	private static String pfixLog  = "";
	
	private int playDices = 0;
	private int playSides = 0;
	private int totalRollTimes = 0;
	private Hashtable<Integer, Integer> diceRollResult = null;
	private ArrayList<Dice> diceList = null;
	
	/**
	 * Constructor
	 */
	public HW4() {
		className = this.getClass().getName();
		pfixLog = "[" + className + "]: ";		
		diceRollResult = new Hashtable<Integer, Integer>();
		diceList = new ArrayList<Dice>();
	}

	public HW4(int totalDices, int totalSides) {
		// ensure the main overloaded constructor is called
		this();
		this.playDices = totalDices;
		this.playSides = totalSides;
	}

	public void initializeListOfDices() {
		// clear the list everytime initialize is called
		if(!diceList.isEmpty()) {
			diceList.clear();
		}
		
		// create new dice objects with total sides and store in ArrayList
		for(int i = 0; i < playDices; i++) {
			diceList.add(new Dice(playSides));
		}
	}
	
	public void gameTime() {
		if(playDices == 0 || playSides == 0) {
			// no game time
			System.out.println(pfixLog + "Resetting Game - DICES: " + getPlayDicesCount() + " SIDES: " + getPlaySides() + " ROLLTIMES: " + getGameRollTimes());
		} else {
			for(int t = 0; t < totalRollTimes; t++) {
				// call singleton class to roll dice with arg of arraylist
				// result is the total number of all rolled dices in the list
				int rolledTotal = (DICE_ROLLER.rollDice(diceList));
				addToHashTable(rolledTotal);
			}
		}
	}

	private void addToHashTable(int topSide) {
		if(diceRollResult.containsKey(topSide)) {
			System.out.println(pfixLog + "Hashtable has the key: " + topSide + " with FOUND count: " + diceRollResult.get(topSide));
			int count = (int) diceRollResult.get(topSide) + 1;
			diceRollResult.put(topSide, count);
			System.out.println(pfixLog + "Hashtable has the key: " + topSide + " with UPDATED count: " + diceRollResult.get(topSide));
		} else {
			diceRollResult.put(topSide, 1);
			System.out.println(pfixLog + "Hashtable does not have the key: " + topSide + ". NEW entry added with count of: " + diceRollResult.get(topSide));
		}
	}
		
	public void printGameStats() {
		for (int key: diceRollResult.keySet()) {
			System.out.println(pfixLog + key + ": " + formatHistogramView((int) diceRollResult.get(key)));
		}		
	}
	
	public String formatHistogramView(int count) {
		StringBuffer astConstruct = new StringBuffer();
		for(int i = 0; i < count; i++) {
			astConstruct.append("* ");
		}		
		return astConstruct.toString().trim();
	}
	
	public void setPlayDicesCount(int totalDices) {
		
		this.playDices = totalDices;
		this.initializeListOfDices();
	}
	
	public int getPlayDicesCount() {
		return this.playDices;
	}
	
	public int getPlaySides() {
		return playSides;
	}

	public void setPlaySides(int playSides) {
		this.playSides = playSides;
		this.initializeListOfDices();
	}

	public void setGameRollTimes(int rollTimes) {
		this.totalRollTimes = rollTimes;
	}

	public int getGameRollTimes() {
		return this.totalRollTimes;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// initialize HW4 object with 2 dices per homework requirement
		HW4 myHWPlay = new HW4(2,6);
		myHWPlay.setPlaySides(6);
		myHWPlay.setGameRollTimes(36);
		myHWPlay.initializeListOfDices();

		System.out.println(pfixLog + "DICES: " + myHWPlay.getPlayDicesCount() + " SIDES: " + myHWPlay.getPlaySides() + " ROLLTIMES: " + myHWPlay.getGameRollTimes());

		myHWPlay.gameTime();
		myHWPlay.printGameStats();

	}

}
