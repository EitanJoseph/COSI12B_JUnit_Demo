/**
 * @author: CS12B
 * Unit Tests DEMO for COSI 12B Students
 * April 8, 2020
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.GroceryItemOrder;
import main.GroceryList;

/**
 * This class will serve as the third class in our unit test hierarchy
 * This class will test how our GroceryList throws exceptions
 * 
 * Note that since this unit test classes extends GrocerListAddTest which extends GIOConstructorTest
 * EVERY unit test in this suite gets executed when this class gets executed.
 */
class GLExceptionsTest extends GrocerListAddTest{

	/**
	 * This method will fail if an exception is thrown
	 */
	@Test
	void testAddingAboveCapacity() {
		GroceryList l = reinitGroceryList();
		GroceryItemOrder g = new GroceryItemOrder();
		try {
			l.add(g);
			l.add(g);
		} catch (Exception e) {
			fail("unexpected exception thrown: " + e.getMessage());
		}	
	}
	
	// Below are three ways of testing for whether exceptions were thrown or not
	
	/**
	 * This method will pass if an exception is thrown
	 */
	@Test
	void testExceptionWasThrownWithBool() {
		GroceryList l = reinitGroceryList();
		boolean thrown = false;
		try {
			l.exceptionThrower();
		} catch (Exception e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	/**
	 * This method will pass if an exception is thrown
	 */
	@Test
	void testExceptionWasThrownWithFail() {
		GroceryList l = reinitGroceryList();
		try {
			l.exceptionThrower();
			fail("No exception generated");
		} catch (Exception e) {
		}
	}
	
	/**
	 * This method will pass if an exception is thrown
	 */
	@Test
	void testExceptionWasThrownUsingExpressions() {
		GroceryList l = reinitGroceryList();
		assertThrows(IndexOutOfBoundsException.class, () -> {
			l.exceptionThrower();
		});	
	}
	
	
	
}
