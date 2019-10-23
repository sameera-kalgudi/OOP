import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class PublisherImplementation {
	
	List<Observer>subscribers = new ArrayList<>();
	
	public void notifyObserver(Event e) {
		System.out.println("Event Added: " + e.getEventNumber());
	}
	
	public Event generateEvent() {
		int count = 0;
		int eventData = ThreadLocalRandom.current().nextInt(1, 5000); 
		int eventNumber = count;
		count++;
		return new Event(eventNumber, eventData);
	}
	
	public void runSimulation() {
		
	}
}
