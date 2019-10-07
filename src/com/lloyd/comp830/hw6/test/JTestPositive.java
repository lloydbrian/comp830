/**
 * 
 */
package com.lloyd.comp830.hw6.test;

import static org.junit.jupiter.api.Assertions.*;
import com.lloyd.comp830.hw6.UnitTestHW;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @author lloydbriantech 2019
 *
 */
class JTestPositive {

	UnitTestHW testObj;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		testObj = new UnitTestHW();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		testObj = null;
	}

	/**
	 * This test scenario originally threw an
	 * ArithmenticException division by zero
	 * 
	 */
	@Test
	@DisplayName("1 Testing getAverage() through testGetAverage_DivisionZero() division by zero")
	void testGetAverage_DivisionZero() {
		int a = 0;
		int b = 0;
		testObj.MysteryMethod(a, b);
		assertEquals(testObj.getAverage(), 0);
	}

	/**
	 * This test scenario is to test a positive
	 * computation of getAverage()
	 * 
	 */
	@Test
	@DisplayName("2 Testing getAverage() through testGetAverage_Valid1(). 2 numbers")
	void testGetAverage_Valid1() {
		testObj.addNumberToList(6);
		testObj.addNumberToList(10);
		testObj.computeSum();
		testObj.computeNumberOfInts();
		assertEquals(testObj.getAverage(), 8);
	}

	/**
	 * This test scenario is to test a positive
	 * computation of getAverage() after removing an entry
	 * 
	 */
	@Test
	@DisplayName("3 Testing getAverage() through testGetAverage_Valid2(). Add then remove")
	void testGetAverage_Valid2() {
		testObj.addNumberToList(6);
		testObj.addNumberToList(10);
		testObj.addNumberToList(16);
		testObj.removeNumberFromList(16);
		testObj.computeSum();
		testObj.computeNumberOfInts();
		assertEquals(testObj.getAverage(), 8);
	}

	/**
	 * This test scenario is to test a negative
	 * scenario of getAverage()
	 * 
	 */
	@Test
	@DisplayName("4 Testing getAverage() through testGetAverage_InValid(). Negative scenario")
	void testGetAverage_InValid() {
		testObj.addNumberToList(6);
		testObj.addNumberToList(10);
		testObj.addNumberToList(16);
		testObj.removeNumberFromList(16);
		testObj.computeSum();
		testObj.computeNumberOfInts();

		assertAll("getAverage Fail",
				() -> assertNotEquals(testObj.getAverage(), -1),
				() -> assertNotEquals(testObj.getAverage(), 0)
				
		);
	}

	/**
	 * This test scenario is to test a positive and negative
	 * scenario of getAverage() using MysteryMethod
	 * 
	 */
	@Test
	@DisplayName("5 Testing getAverage() through testGetAverage_MysteryMethod(). With MysteryMethod")
	void testGetAverage_MysteryMethod() {
		testObj.addNumberToList(6);
		testObj.addNumberToList(10);
		testObj.addNumberToList(16);
		testObj.removeNumberFromList(16);
		testObj.computeSum();
		testObj.computeNumberOfInts();
		testObj.MysteryMethod(0, 0);
		
		assertAll("getAverage with MysteryMethod",
				() -> assertNotEquals(testObj.getAverage(),1),
				() -> assertEquals(testObj.getAverage(), 0)
		);
	}

	/**
	 * This test scenario is to test 
	 * computation of getAverage()
	 * with similar numbers added to the arraylist
	 */
	@Test
	@DisplayName("2 Testing getAverage() through testGetAverage_Valid3(). 3 numbers. 2 same")
	void testGetAverage_Valid3() {
		testObj.addNumberToList(6);
		testObj.addNumberToList(10);
		testObj.addNumberToList(6);
		testObj.computeSum();
		testObj.computeNumberOfInts();
		
		assertAll("getAverage with same numbers added to the list",
				() -> assertEquals(testObj.getAverage(), 7),
				() -> assertNotEquals(testObj.getAverage(),8)
		);
	}

	/**
	 * This test scenario is to test 
	 * computation of getAverage()
	 * with similar numbers added to the arraylist
	 */
	@Test
	@DisplayName("2 Testing getAverage() through testGetAverage_Valid4(). 3 numbers. 2 same")
	void testGetAverage_Valid4() {
		testObj.addNumberToList(6);
		testObj.addNumberToList(10);
		testObj.addNumberToList(6);
		testObj.removeNumberFromList(6);
		testObj.computeSum();
		testObj.computeNumberOfInts();
		
		assertAll("getAverage with same numbers added to the list",
				() -> assertEquals(testObj.getAverage(), 10),
				() -> assertNotEquals(testObj.getAverage(),7)
		);
	}

	
	
}
