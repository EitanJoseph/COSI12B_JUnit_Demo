package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.GroceryItemOrder;
import main.GroceryList;

class GLExceptionsTest extends GrocerListAddTest{

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
	
	@Test
	void testExceptionWasThrownWithFail() {
		GroceryList l = reinitGroceryList();
		try {
			l.exceptionThrower();
			fail("No exception generated");
		} catch (Exception e) {
		}
	}
	
	@Test
	void testExceptionWasThrownUsingExpressions() {
		GroceryList l = reinitGroceryList();
		assertThrows(IndexOutOfBoundsException.class, () -> {
			l.exceptionThrower();
		});	
	}
	
	
	
}
