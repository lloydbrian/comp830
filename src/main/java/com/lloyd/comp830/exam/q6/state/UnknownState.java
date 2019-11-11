/**
 * 
 */
package com.lloyd.comp830.exam.q6.state;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public class UnknownState implements ServiceState {

	private static String className = "";
	private static String pfixLog  = "";
	private static final int STATE = -1;

	public UnknownState() {
		className = this.getClass().getName();
		pfixLog = "[" + className + "]: ";

	}
	
	
	@Override
	public void alertState(StateContextLoadBalancer ctx) {
		System.out.println(pfixLog + "STATE has been alerted. UNKNOWN. " + STATE + " " + ctx.toString());

	}

}
