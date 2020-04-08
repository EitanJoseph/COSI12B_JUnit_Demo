package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

import main.*;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class GrocerListAddTest extends GIOConstructorTest{

	public GroceryList reinitGroceryList(){
		GroceryList l = new GroceryList();
		GroceryItemOrder[] list = GIOConstructorTest.reinitializeGIOs();
		for (int i = 0; i < list.length; i++) {
			l.add(list[i]);
		}
		return l;
	}
	
	@Test
	void A() {
		GroceryList l = reinitGroceryList();
		assertEquals(l.toString(), "[1 a1, 1 a2, 1 null, 4 null, 0 null, null, null, null, null, null]");
	}
	@Test
	void B() {
		GroceryList l = reinitGroceryList();
		GroceryItemOrder g = new GroceryItemOrder();
		l.add(g);
		assertEquals(l.toString(), "[1 a1, 1 a2, 1 null, 4 null, 0 null, null, null, null, null, null]");
	}
	@Test
	void C() {
		GroceryList l = reinitGroceryList();
		assertEquals(l.toString(), "[1 a1, 1 a2, 1 null, 4 null, 0 null, null, null, null, null, null]");
	}
	@Test
	void D() {
		GroceryList l = reinitGroceryList();
		assertEquals(l.toString(), "[1 a1, 1 a2, 1 null, 4 null, 0 null, null, null, null, null, null]");
	}
	
	@Test
	void AA() {
		GroceryList l = reinitGroceryList();
		assertEquals(l.toString(), "[1 a1, 1 a2, 1 null, 4 null, 0 null, null, null, null, null, null]");
	}
	
	// add tests here for: add 1, add 2, add invalid, add null, add beyond capacity

}
