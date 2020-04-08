/*
 * Unit Tests DEMO for COSI 12B Student
 */

package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GIOConstructorTest {


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
	
	@Test
	void testIntegerConstructor() {
		GroceryItemOrder[] GIOs = reinitializeGIOs();
		assertEquals(GIOs[0].getQuantity(), 1);
		assertEquals(GIOs[0].toString(), "1 a1");
		
		GIOs[0].setQuantity(4);
	}
	
	@Test
	void testDoubleConstructor() {
		GroceryItemOrder[] GIOs = reinitializeGIOs();
		assertEquals(GIOs[1].toString(), "1 a2");
	}
	
	@Test
	void testGetCost() {
		GroceryItemOrder[] GIOs = reinitializeGIOs();
		assertEquals(GIOs[2].getCost(), 1.5);
	}

}
