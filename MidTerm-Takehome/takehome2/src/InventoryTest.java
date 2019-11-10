import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventoryTest {
	
	Inventory instance;
	InventoryItem i;
	@BeforeEach
	void setUp() throws Exception {
		instance = new Inventory();
		i = new InventoryItem(null, 0, null, 0);
	}

	@AfterEach
	void tearDown() throws Exception {
		instance = null;
		i = null;
	}

	@Test
	void testAddItemToInventory() {
		boolean result = instance.addItemToInventory(i);
		assertTrue(result);
	}

	@Test
	void testDropInventoryItem() {
		boolean result = instance.dropInventoryItem(i);
		assertFalse(result);
		
	}

	@Test
	void testGetWeight() {
		int actual = 0;
		int result = instance.getWeight();
		assertEquals(actual, result);
		
	}

	@Test
	void testGetCount() {
		int actual = 0;
		int result = instance.getCount();
		assertEquals(actual, result);
	}


}
