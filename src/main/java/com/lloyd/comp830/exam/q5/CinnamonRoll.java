/**
 * 
 */
package com.lloyd.comp830.exam.q5;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public class CinnamonRoll implements BakedGoods {

	private int cinnamonPrice = 0;
	private String cinnamonDescription = "";
	private String cinnamonGetBySellDate = "";
	
	public CinnamonRoll(int price, String desc, String sellBy) {
		this.cinnamonPrice = price;
		this.cinnamonDescription = desc;
		this.cinnamonGetBySellDate = sellBy;
	}
	
	@Override
	public int getPrice() {
		return cinnamonPrice;
	}

	@Override
	public String getDescription() {
		return cinnamonDescription;
	}

	@Override
	public String getSellByDate() {
		return cinnamonGetBySellDate;
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("CinnamonRoll: ").append(getDescription()).append(" : ").append("$").append(getPrice()).append(" : ").append(getSellByDate());
		return str.toString();
	}
}
