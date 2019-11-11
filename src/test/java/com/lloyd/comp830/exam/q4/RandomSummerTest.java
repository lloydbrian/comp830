package com.lloyd.comp830.exam.q4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lloyd.comp830.exam.q3.RandomSummer;

/**
 * 
 * @author lloydbriantech 2019
 * UNH MS 2019
 */
class RandomSummerTest {

	RandomSummer ranObj;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ranObj = RandomSummer.getInstance();

	}

	@AfterEach
	void tearDown() throws Exception {
		ranObj = null;
	}

	@Test
	void testGenerateRandomNumbers() {
		ranObj.generateRandomNumbers(10, 100);
		assertEquals(ranObj.getCountRandomNumbers(), 10);
	}

	@Test
	void testShowRandomNumbers() {
		ranObj.generateRandomNumbers(10, 100);
		assertTrue(ranObj.showRandomNumbers() !=  null);
	}

	@Test
	void testGetTotalSum() {
		int sumT = 0;
		for(int i = 0; i < 10; i++ ) {
			int ranNumber = ThreadLocalRandom.current().nextInt(1, 100 +1);
			sumT += ranNumber;
		}

		ranObj.generateRandomNumbers(10, 100);
		assertNotEquals(ranObj.getTotalSum(), sumT);
	}

}
