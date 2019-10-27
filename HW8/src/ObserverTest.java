import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ObserverTest {


	@Test
	void testNotifyObserver() {
		PublisherImplementation i = new PublisherImplementation();
		Event e = i.generateEvent();
		assertTrue(i.notifyObserver(e));
	}

}
