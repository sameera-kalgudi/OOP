import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

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
		Event e = i.generateEvent();
		SubscriberEvens SubEven = new SubscriberEvens();
		Boolean evenResponse = SubEven.notifyObserver(e);
		assertEquals(false,evenResponse);
		
		
	}

	@Test
	void testRunSimulation1() {
		Event e = i.generateEvent();
		SubscriberOdds SubOdd = new SubscriberOdds();
		Boolean oddResponse = SubOdd.notifyObserver(e);
		assertEquals(true,oddResponse);
		
		
	}
	
	@Test
	void testRunSimulation2() {
		Event e = i.generateEvent();
		SubscriberThrees SubThree = new SubscriberThrees();
		Boolean threeResponse = SubThree.notifyObserver(e);
		assertEquals(true,threeResponse);
		
		
	}

}
