import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventoryItemTest {
	
	InventoryItem instance;
	
	@BeforeEach
	void setUp() throws Exception {
		instance = new InventoryItem("car", 2, "audi", 10);
	}

	@AfterEach
	void tearDown() throws Exception {
		instance = null;
	}

	@Test
	void testGetName() {
		String name = "audi";
		String s = instance.getName();
		assertEquals(name,s);
		
	}

	@Test
	void testGetType() {
		String type = "car";
		String t = instance.getType();
		assertEquals(type,t);
		
	}

	@Test
	void testGetWeight() {
		int weight = 2;
		int w = instance.getWeight();
		assertEquals(weight,w);
		
	}

	@Test
	void testGetCount() {
		int count = 10;
		int c = instance.getCount();
		assertEquals(count,c);
	}


}
