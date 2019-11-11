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
public class ExamQ3Interface {

	private ArrayList<BakedGoods> bGoods;
	
	public ExamQ3Interface () {
		bGoods = new ArrayList<BakedGoods>();
	}
	
	public boolean addToBakedList(BakedGoods bG) {
		return bGoods.add(bG);
	}
	
	public String showAllBakedGoods() {
		StringBuilder strB = new StringBuilder();
		for(BakedGoods bG : bGoods) {
			strB.append(bG.toString()).append("\n");
		}
		
		return strB.toString();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ExamQ3Interface e3I = new ExamQ3Interface();
		BakedGoods cookie1 = new Cookie(20, "Chocolate", "11/10/2019");
		BakedGoods cookie2 = new Cookie(20, "Cookies and Cream", "11/11/2019");
		BakedGoods cookie3 = new Cookie(100, "Special Recipe", "12/25/2019");
		
		e3I.addToBakedList(cookie1);
		e3I.addToBakedList(cookie2);
		e3I.addToBakedList(cookie3);

		BakedGoods cinnamonRoll1 = new CinnamonRoll(10, "Coffee Flavored", "11/20/2019");
		BakedGoods cinnamonRoll2 = new CinnamonRoll(20, "Large Versions", "12/11/2019");
		BakedGoods cinnamonRoll3 = new CinnamonRoll(500, "Gainer Type", "11/25/2019");

		e3I.addToBakedList(cinnamonRoll1);
		e3I.addToBakedList(cinnamonRoll2);
		e3I.addToBakedList(cinnamonRoll3);

		BakedGoods brownie1 = new CinnamonRoll(4, "Coffee Flavored", "1/1/2020");
		BakedGoods brownie2 = new CinnamonRoll(3, "Large Versions", "12/11/2020");
		BakedGoods brownie3 = new CinnamonRoll(8, "Gainer Type", "11/25/2020");

		e3I.addToBakedList(brownie1);
		e3I.addToBakedList(brownie2);
		e3I.addToBakedList(brownie3);

		System.out.println(e3I.showAllBakedGoods());
		
	}

}
