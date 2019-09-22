/**
 * 
 */
package com.lloyd.comp830.hw4;

import java.util.concurrent.ThreadLocalRandom;


/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 * Singleton class DiceRoller using Java ThreadLocalRandom generator
 */
public final class DiceRoller {

	private static volatile DiceRoller diceRollerInstance = null;
	
	/**
	 * Nothing to do here.
	 * Private constructor as it is Singleton
	 * This has Lazy Initialization
	 */
	private DiceRoller() {}

	public static DiceRoller getInstance() {
		if(diceRollerInstance == null) {
			synchronized(DiceRoller.class) {
				if(diceRollerInstance == null) {
					diceRollerInstance = new DiceRoller();
				}
			}
		}
		return diceRollerInstance;
	}
	
	public int rollDice(Dice diceToRoll) {
		// Returns a pseudorandom int value between the 
		// specified origin (inclusive) and the specified bound (exclusive)
		int randSide = ThreadLocalRandom.current().nextInt(1, diceToRoll.getTotalSides() + 1);
		return randSide;
	}
	
}
