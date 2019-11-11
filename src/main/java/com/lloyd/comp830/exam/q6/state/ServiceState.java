/**
 * 
 */
package com.lloyd.comp830.exam.q6.state;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public interface ServiceState {
	int STATE = 0;
	
	public void alertState(StateContextLoadBalancer ctx);
}
