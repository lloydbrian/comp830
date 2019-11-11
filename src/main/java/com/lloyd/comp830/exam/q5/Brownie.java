/**
 * 
 */
package com.lloyd.comp830.exam.q5;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public class Brownie implements BakedGoods {

	private int browniePrice = 0;
	private String brownieDescription = "";
	private String brownieGetBySellDate = "";
	
	public Brownie(int price, String desc, String sellBy) {
		this.browniePrice = price;
		this.brownieDescription = desc;
		this.brownieGetBySellDate = sellBy;
	}
	
	@Override
	public int getPrice() {
		return browniePrice;
	}

	@Override
	public String getDescription() {
		return brownieDescription;
	}

	@Override
	public String getSellByDate() {
		return brownieGetBySellDate;
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Brownie: ").append(getDescription()).append(" : ").append("$").append(getPrice()).append(" : ").append(getSellByDate());
		return str.toString();
	}
}
