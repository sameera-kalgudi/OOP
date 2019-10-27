import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.*;

public class PublisherImplementationTest {
	PublisherImplementation i;

	@BeforeEach
	void setUp() throws Exception {
		i = new PublisherImplementation();
	}

	@AfterEach
	void tearDown() throws Exception {
		i = null;
	}

	@Test
	void testNotifyObserver() {
		fail("Not yet implemented");
		
	}

	@Test
	void testGenerateEvent() {
		Event e = i.generateEvent();
		assertNotNull(e);
	}

	@Test
	void testRunSimulation() {
		fail("Not yet implemented");
	}

	@Test
	void testRegisterObserver() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveObserver() {
		fail("Not yet implemented");
	}

}
