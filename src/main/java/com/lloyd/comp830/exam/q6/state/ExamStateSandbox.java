/**
 * 
 */
package com.lloyd.comp830.exam.q6.state;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public class ExamStateSandbox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final String UNKNOWN_STATE = "-1";
		final String ALIVE_STATE = "1";
		final String DEAD_STATE = "0";
		String optionChosen = "";

		
		StateContextLoadBalancer stateObject = new StateContextLoadBalancer();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println ("CURRENT STATE: " + stateObject.getCurrenStateVal());
		System.out.println ("Choose next STATE: ");
		System.out.println ("1 for Alive");
		System.out.println ("0 for Dead");
		System.out.println ("-1 for Unknown");

		while (!optionChosen.equalsIgnoreCase(DEAD_STATE)) {
			stateObject.alertState();
			
			try {
				optionChosen = reader.readLine();
			} catch (IOException iOE) {
				optionChosen = UNKNOWN_STATE;
			}
			
			switch(optionChosen) {
				case UNKNOWN_STATE:
					stateObject.setState(new UnknownState());
					break;
				case ALIVE_STATE:
					stateObject.setState(new AliveState());
					break;
				case DEAD_STATE:
					stateObject.setState(new DeadState());
					break;
				default:
					break;
			}
		}
		

	}

}
