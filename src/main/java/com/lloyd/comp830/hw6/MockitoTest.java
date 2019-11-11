/**
 * 
 */
package com.lloyd.comp830.hw6;

import static org.mockito.Mockito.*;
import java.util.List;

/**
 * @author lloydbriantech 2019
 *
 */
public class MockitoTest {

	/**
	 * 
	 */
	public MockitoTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Mock Creation
		List mockedList = mock(List.class);
		
		// using mock object
		mockedList.add("one");
		mockedList.clear();
		
		// verification
		System.out.println(verify(mockedList).add("one"));
		//System.out.println(verify(mockedList).clear());
	}

}
