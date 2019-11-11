/**
 * 
 */
package com.lloyd.comp830.exam.q5;

import java.util.ArrayList;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public class ExamQ3Abstract {

	private ArrayList<SpaceShip> intergalaxyShips;
	
	public ExamQ3Abstract () {
		intergalaxyShips = new ArrayList<SpaceShip>();
	}
	
	public boolean addToSpaceShipList(SpaceShip igShips) {
		return intergalaxyShips.add(igShips);
	}

	public String showAllSpaceShips() {
		StringBuilder strB = new StringBuilder();
		for(SpaceShip ship : intergalaxyShips) {
			strB.append(ship).append("\n");
		}
		
		return strB.toString();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExamQ3Abstract e3A = new ExamQ3Abstract();
		SpaceShip sw1 = new StarWarsShips(64, "Millenium Falcon", "New Hope");
		SpaceShip sw2 = new StarWarsShips(1340000, "Death Star", "New Hope");
		SpaceShip sw3 = new StarWarsShips(5, "X-Wing", "New Hope");
		
		e3A.addToSpaceShipList(sw1);
		e3A.addToSpaceShipList(sw2);
		e3A.addToSpaceShipList(sw3);

		SpaceShip st1 = new StarTrekShips(4500000, "USS Enterprise", "Next Generation");
		SpaceShip st2 = new StarTrekShips(1340000, "Deep Space Nine", "Deep Space Nine");
		SpaceShip st3 = new StarTrekShips(4000000, "USS Voyager", "Star Trek Voyager");

		e3A.addToSpaceShipList(st1);
		e3A.addToSpaceShipList(st2);
		e3A.addToSpaceShipList(st3);
		
		SpaceShip ost1 = new OtherSciFiSpaceShips(3500000, "Prometheus", "Prometheus");
		SpaceShip ost2 = new OtherSciFiSpaceShips(2340000, "Icarus II", "Sunshine");
		SpaceShip ost3 = new OtherSciFiSpaceShips(9000000, "Endurance", "Interstellar");

		e3A.addToSpaceShipList(ost1);
		e3A.addToSpaceShipList(ost2);
		e3A.addToSpaceShipList(ost3);

		
		System.out.println(e3A.showAllSpaceShips());
	}

}
