/**
 * 
 */
package com.lloyd.comp830.exam.q6.state;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public class StateContextLoadBalancer {
	
	private ServiceState currentState;
	private int currentStateVal;
	
	
	public StateContextLoadBalancer() {
		this.currentState = new UnknownState();
		this.currentStateVal = -1;
	}

	public void setState(ServiceState state) {
		currentState = state;
		currentStateVal = state.STATE;
	}
	
	public void alertState() {
		currentState.alertState(this);
	}
	
	public int getCurrenStateVal() {
		return currentStateVal;
	}
	
}
