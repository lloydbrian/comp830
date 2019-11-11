/**
 * 
 */
package com.lloyd.comp830.exam.q5;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public class Cookie implements BakedGoods {

	private int cookiePrice = 0;
	private String cookieDescription = "";
	private String cookieGetBySellDate = "";
	
	public Cookie(int price, String desc, String sellBy) {
		this.cookiePrice = price;
		this.cookieDescription = desc;
		this.cookieGetBySellDate = sellBy;
	}
	
	@Override
	public int getPrice() {
		return cookiePrice;
	}

	@Override
	public String getDescription() {
		return cookieDescription;
	}

	@Override
	public String getSellByDate() {
		return cookieGetBySellDate;
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Cookie: ").append(getDescription()).append(" : ").append("$").append(getPrice()).append(" : ").append(getSellByDate());
		return str.toString();
	}
}
