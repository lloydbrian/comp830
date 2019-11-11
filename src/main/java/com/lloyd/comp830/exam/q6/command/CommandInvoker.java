/**
 * 
 */
package com.lloyd.comp830.exam.q6.command;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public class CommandInvoker {
	
	private Player player;
	
	private static final int NORTH = 1;
	private static final int EAST = 2;
	private static final int SOUTH = 3;
	private static final int WEST = 4;
	
	private ArrayList<CommandInterface> moves;

	private static String className = "";
	private static String pfixLog  = "";

	
	public CommandInvoker(Player player) {
		this.player = player;
		moves = new ArrayList<>();
		className = this.getClass().getName();
		pfixLog = "[" + className + "]: ";

	}
	
	public void executeCommands() {
		for (CommandInterface move : moves) {
			move.execute();
		}
	}
	
	public void undoCommands() {
		for (CommandInterface move : moves) {
			move.undo();
		}
	}
	
	public void getRandomCommand (int range) {
		
		int command = ThreadLocalRandom.current().nextInt(1, range + 1);
		CommandInterface cIObj = null;
		
		switch(command) {
			case NORTH:
				cIObj = new MoveNorth(player);
				moves.add(cIObj);
				break;
			case EAST:
				cIObj = new MoveEast(player);
				moves.add(cIObj);
				break;
			case SOUTH:
				cIObj = new MoveSouth(player);
				moves.add(cIObj);
				break;
			case WEST:		
				cIObj = new MoveWest(player);
				moves.add(cIObj);
				break;
			default:
				break;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Player unhPlayer = new Player("COMP830");
		CommandInvoker cInvoker = new CommandInvoker(unhPlayer);
		System.out.println(pfixLog + "PLAYER : " + unhPlayer.getName() + " - " + "STARTING coordinate at (" + unhPlayer.getxCoord() + " , " + unhPlayer.getyCoord() + ")");

		
		// create random movements 50 times for smimulation purposes
		for(int i = 0; i <= 50; i++) {
			cInvoker.getRandomCommand(4);
		}
		
		cInvoker.executeCommands();
		cInvoker.undoCommands();
		System.out.println(pfixLog + "PLAYER : " + unhPlayer.getName() + " - " + "ENDING coordinate at (" + unhPlayer.getxCoord() + " , " + unhPlayer.getyCoord() + ")");
						
	}

}
