package takehome3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class arraylistTest {
	
	arraylist instance;

	@BeforeEach
	void setUp() throws Exception {
		instance = new arraylist();
	}

	@AfterEach
	void tearDown() throws Exception {
		instance = null;
	}

	@Test
	void testRandom() {
		assertNotNull(instance.random());
	}

	@Test
	void testArray() {
		int size = 10;
		int count = (instance.array()).size();
		assertEquals(size,count);
	}

}
