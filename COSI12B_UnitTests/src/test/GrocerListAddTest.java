package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

import main.*;

/**
 * This class will serve as the second class in our unit test hierarchy
 * This is the highest level of unit testing that we can perform on the GroceryList class system.
 * As such, we want to ideally separate every method or all related methods in their own unit test classes.
 * 
 * This class is an example of testing the "add" method
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // We can fix the method order of our unit tests if desired
class GrocerListAddTest extends GIOConstructorTest{

	/**
	 * @return a GroceryList
	 * 
	 * This method will reinitialize our GorceryList
	 * 
	 * The benefit of this method is that we don't have to constantly run a for loop to add Grocery Items to
	 * our GroceryList. This method will add all the necessary elements into our GroceryItem for us so we
	 * dont have to do this in every method.
	 */
	public GroceryList reinitGroceryList(){
		GroceryList l = new GroceryList();
		// the reason that reinitializeGIOs is static is so that we can call
		// it in this method.
		// 
		// we later altered this test class to inherit from GIOConstructorTest so making it static
		// is not strictly necessary
		GroceryItemOrder[] list = GIOConstructorTest.reinitializeGIOs();
		for (int i = 0; i < list.length; i++) {
			l.add(list[i]);
		}
		return l;
	}
	
	
	/**
	 * This method is named to show how @FixMethodOrder(MethodSorters.NAME_ASCENDING) works
	 */
	@Test
	void A() {
		GroceryList l = reinitGroceryList();
		assertEquals(l.toString(), "[1 a1, 1 a2, 1 null, 4 null, 0 null, null, null, null, null, null]");
	}
	
	/**
	 * This method is named to show how @FixMethodOrder(MethodSorters.NAME_ASCENDING) works
	 */
	@Test
	void B() {
		GroceryList l = reinitGroceryList();
		GroceryItemOrder g = new GroceryItemOrder();
		l.add(g);
		assertEquals(l.toString(), "[1 a1, 1 a2, 1 null, 4 null, 0 null, null, null, null, null, null]");
	}
	
	/**
	 * This method is named to show how @FixMethodOrder(MethodSorters.NAME_ASCENDING) works
	 */
	@Test
	void C() {
		GroceryList l = reinitGroceryList();
		GroceryItemOrder g = new GroceryItemOrder();
		l.add(g);
		l.add(g);
		assertEquals(l.toString(), "[1 a1, 1 a2, 1 null, 4 null, 0 null, null, null, null, null, null]");
	}
	
	/**
	 * This method is named to show how @FixMethodOrder(MethodSorters.NAME_ASCENDING) works
	 */
	@Test
	void D() {
		GroceryList l = reinitGroceryList();
		GroceryItemOrder g = new GroceryItemOrder();
		l.add(g);
		l.add(g);
		l.add(g);
		assertEquals(l.toString(), "[1 a1, 1 a2, 1 null, 4 null, 0 null, null, null, null, null, null]");
	}
	
	/**
	 * This method is named to show how @FixMethodOrder(MethodSorters.NAME_ASCENDING) works
	 */
	@Test
	void AA() {
		GroceryList l = reinitGroceryList();
		GroceryItemOrder g = new GroceryItemOrder();
		l.add(g);
		l.add(g);
		l.add(g);
		l.add(g);
		assertEquals(l.toString(), "[1 a1, 1 a2, 1 null, 4 null, 0 null, null, null, null, null, null]");
	}
	
	// We may add tests here for: add 1, add 2, add invalid, add null, add beyond capacity

}
