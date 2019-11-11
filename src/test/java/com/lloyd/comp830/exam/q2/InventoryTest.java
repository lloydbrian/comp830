/**
 * 
 */
package com.lloyd.comp830.exam.q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author lloydbriantech 2019
 * UNH MS 2019
 *
 */
class InventoryTest {

	private Inventory invTest;
	private InventoryItem item1;
	private InventoryItem item2;
	private InventoryItem item3;
	private InventoryItem item4;
	private InventoryItem item5;
	private InventoryItem item6;
	private InventoryItem item7;

	
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
		invTest = new Inventory();
		
		item1 = new InventoryItem("Laptops", 5, "HP", 10);
		item2 = new InventoryItem("Laptops", 10, "Apple", 20);
		item3 = new InventoryItem("Monitor", 15, "Samsung", 4);
		item4 = new InventoryItem("Mobile Phones", 20, "Apple", 100);
		item5 = new InventoryItem("Monitor", 30, "LG", 5);

		item6 = new InventoryItem("Monitor", 300, "Insignia", 200);
		item7 = new InventoryItem("Laptop", 100, "Lenovo", 300);

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		invTest = null;
		item1 = null;
		item2 = null;
		item3 = null;
		item4 = null;
		item5 = null;
		item6 = null;
		item7 = null;
	}

	@Test
	@DisplayName("Test Case01: Entry point testing for adding item to inventory")
	void testAddItemToInventory() {
		invTest.addItemToInventory(item1);
		invTest.addItemToInventory(item2);
		invTest.addItemToInventory(item3);
		invTest.addItemToInventory(item4);
		invTest.addItemToInventory(item5);
		assertEquals(invTest.getWeight(), 
				item1.getWeight() + item2.getWeight() +
				item3.getWeight() + item4.getWeight() +
				item5.getWeight());
	}

	@Test
	@DisplayName("Test Case02: Test count verification")
	void testCountItemToInventory() {
		invTest.addItemToInventory(item1);
		invTest.addItemToInventory(item2);
		invTest.addItemToInventory(item3);
		invTest.addItemToInventory(item4);
		invTest.addItemToInventory(item5);
		//Should return total number of items in the inventory
		assertEquals(invTest.getCount(), 
				item1.getCount() + item2.getCount() +
				item3.getCount() + item4.getCount() +
				item5.getCount());
	}

	@Test
	@DisplayName("Test Case03: Test drop inventory functionality")
	void testDropFromInventory() {
		
		
		invTest.addItemToInventory(item1);
		invTest.addItemToInventory(item2);
		invTest.addItemToInventory(item3);
		invTest.addItemToInventory(item4);
		invTest.addItemToInventory(item5);
		
		invTest.dropInventoryItem(item2);
		invTest.dropInventoryItem(item4);
		
		// removing something that is not there
		invTest.dropInventoryItem(item6);

		assertEquals(invTest.getCount(), 
				item1.getCount() + 
				item3.getCount() + 
				item5.getCount());

		assertEquals(invTest.getWeight(), 
				item1.getWeight() + 
				item3.getWeight() + 
				item5.getWeight());		
		
	}

	@Test
	@DisplayName("Test Case04: Test case for total weight > 250")
	void testWeightFromInventory() {
		
	
		invTest.addItemToInventory(item1);
		invTest.addItemToInventory(item2);
		invTest.addItemToInventory(item3);
		invTest.addItemToInventory(item4);
		invTest.addItemToInventory(item5);
		invTest.addItemToInventory(item6);
		invTest.addItemToInventory(item7);
		
		invTest.dropInventoryItem(item2);
		invTest.dropInventoryItem(item4);


		assertEquals(invTest.getCount(), 
				item1.getCount() + 
				item3.getCount() + 
				item5.getCount() +
				item6.getCount());
		assertEquals(invTest.getWeight(), 
				item1.getWeight() + 
				item3.getWeight() + 
				item5.getWeight() +
				item6.getWeight());
		assertTrue(invTest.toString() != null);
	}

	@Test
	@DisplayName("Test Case05: Test Type")
	void testTestType() {
		//item1 = new InventoryItem("Laptops", 5, "HP", 10);

		assertEquals(item1.getType(), "Laptops");
	}

	
}
