/**
 * 
 */
package com.lloyd.comp830.exam.q3;


import java.util.concurrent.ThreadLocalRandom;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
public class RandomSummer {

	private static volatile RandomSummer randomSummerInstance = null;
	private int[] randomNums;
	private int totalSum = 0;
	
	
	private RandomSummer() {}

	public static RandomSummer getInstance() {
		if(randomSummerInstance == null) {
			synchronized(RandomSummer.class) {
				if(randomSummerInstance == null) {
					randomSummerInstance = new RandomSummer();
				}
			}
		}
		return randomSummerInstance;
	}

	public void generateRandomNumbers(int size, int range) {
		randomNums = new int[size];
		
		for(int i =0; i < size; i++) {
			int ranNumber = ThreadLocalRandom.current().nextInt(1, range + 1);
			randomNums[i] = ranNumber;
			totalSum += ranNumber;
		}
	}
	
	public int getCountRandomNumbers() {
		return randomNums.length;
	}
	
	public String showRandomNumbers() {
		StringBuilder strB = new StringBuilder();
	
		for (int j = 0; j < randomNums.length; j++) {
			strB.append(j + ": " +randomNums[j]).append("\n");
		}
		
		return strB.toString();	
	}
	
	/**
	 * @return the totalSum
	 */
	public int getTotalSum() {
		return totalSum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RandomSummer ranObj = RandomSummer.getInstance();
		ranObj.generateRandomNumbers(10, 1000);
		System.out.println(ranObj.showRandomNumbers());
		System.out.println(ranObj.getTotalSum());

	}

}
