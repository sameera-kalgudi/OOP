package takehome3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class sumofTest {

	sumof instance;
	@BeforeEach
	void setUp() throws Exception {
		instance = new sumof();
	}

	@AfterEach
	void tearDown() throws Exception {
		instance = null;
	}

	@Test
	void testAdd() {
		assertNotNull(instance.add());
	}

}
