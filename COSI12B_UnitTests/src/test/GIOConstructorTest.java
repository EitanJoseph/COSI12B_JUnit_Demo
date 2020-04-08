/**
 * @author: CS12B
 * Unit Tests DEMO for COSI 12B Students
 * April 8, 2020
 */
package test;

import main.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * This class will serve as the base class for our unit test hierarchy.
 * This is the lowest level of unit testing that we can perform on the GroceryList class system.
 * As such, we want to unit test very specific attributes of the GroceryItemOrder.
 * 
 * This includes:
 * - Constructors
 * - Getters
 * - Setters
 * - toString
 */
class GIOConstructorTest {

	
	/**
	 * @return an array of GroceryItemOrders
	 * 
	 * This method will reinitialize our list of GIOs.
	 * We modify this method with the keywords "public" and "static" in order
	 * to allow other test runners to use this method.
	 * 
	 * The benefit of this method is that we don't have to constantly reinitialize our GIOs when
	 * making lists of them, or when testing multiple of them at once. This allows for significant
	 * code reuse.
	 */
	public static GroceryItemOrder[] reinitializeGIOs() {
		// INTEGER GIO
		GroceryItemOrder g1 = new GroceryItemOrder("a1", 1, 1);
		// DOUBLE GIO
		GroceryItemOrder g2 = new GroceryItemOrder("a2", 1, 1.5);
		// NULL GIO
		GroceryItemOrder g3 = new GroceryItemOrder(null, 1, 1.5);
		// COST NOT TRIVIAL
		GroceryItemOrder g4 = new GroceryItemOrder(null, 4, 4);
		// DEFAULT
		GroceryItemOrder g5 = new GroceryItemOrder();
		GroceryItemOrder[] list = {g1, g2, g3, g4, g5};
		return list;
	}
	
	/**
	 * In this method we will test that the GIO behaves normally when being passed an
	 * int in the price parameter
	 */
	@Test
	void testIntegerConstructor() {
		// reinit the GIO list
		GroceryItemOrder[] GIOs = reinitializeGIOs();
		// test the quantity and toString
		assertEquals(GIOs[0].getQuantity(), 1);
		assertEquals(GIOs[0].toString(), "1 a1");
		
		// alter the quantity (this should probably be in its own method)
		GIOs[0].setQuantity(4);
		// test the quanity and toString accordingly
		assertEquals(GIOs[0].getQuantity(), 4);
		assertEquals(GIOs[0].toString(), "4 a1");
	}
	
	/**
	 * In this method we will test that the GIO behaves normally when being passed an
	 * double in the price parameter
	 */
	@Test
	void testDoubleConstructor() {
		GroceryItemOrder[] GIOs = reinitializeGIOs();
		assertEquals(GIOs[1].toString(), "1 a2");
	}
	
	/**
	 * This method tests the cost of the GIO at index 2
	 */
	@Test
	void testGetCost() {
		GroceryItemOrder[] GIOs = reinitializeGIOs();
		assertEquals(GIOs[2].getCost(), 1.5);
	}

}
