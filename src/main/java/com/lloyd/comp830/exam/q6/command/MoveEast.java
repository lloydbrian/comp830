/**
 * 
 */
package com.lloyd.comp830.exam.q6.command;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public class MoveEast implements CommandInterface {

	private Player player;
	
	private static String className = "";
	private static String pfixLog  = "";

	public MoveEast(Player player) {
		className = this.getClass().getName();
		pfixLog = "[" + className + "]: ";
		
		this.player = player;
	}
	
	@Override
	public void execute() {
		System.out.println(pfixLog + "PLAYER : " + player.getName() + " - " + "Moving EAST by 1 unit.");
		player.addToXCoord(1);
		System.out.println(pfixLog + "PLAYER : " + player.getName() + " - " + "Latest coordinate at (" + player.getxCoord() + " , " + player.getyCoord() + ")");
	}

	@Override
	public boolean undo() {
		System.out.println(pfixLog + "PLAYER : " + player.getName() + " - " + "Undoing move from EAST by 1 unit.");
		player.addToXCoord(-1);
		System.out.println(pfixLog + "PLAYER : " + player.getName() + " - " + "Latest coordinate at (" + player.getxCoord() + " , " + player.getyCoord() + ")");
		return true;
	}

}
