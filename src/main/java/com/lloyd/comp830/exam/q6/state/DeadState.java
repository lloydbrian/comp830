/**
 * 
 */
package com.lloyd.comp830.exam.q6.state;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public class DeadState implements ServiceState {

	private static String className = "";
	private static String pfixLog  = "";
	private static final int STATE = 0;


	public DeadState() {
		className = this.getClass().getName();
		pfixLog = "[" + className + "]: ";

	}
	
	@Override
	public void alertState(StateContextLoadBalancer ctx) {
		System.out.println(pfixLog + "STATE has been alerted. DEAD. " + STATE + " " + ctx.toString());

	}

}
