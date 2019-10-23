import java.util.*;
public class PublisherImplementation implements PublisherInterface {
	

	private List<Observer> subscribers = new ArrayList<Observer>();
	private List<Observer> unsubscribers = new ArrayList<Observer>();
 	

	public void notifyObserver(Event e) {
		
	}
	
	private Event generateEvent() {
		Event e = new Event(1, 1);
	}
	
	public void runSimulation() {
		
	}

	public void registerObserver(Observer o) {
		
		if (unsubscribers.contains(o) {
			unsubscribers.remove(o);
		}
		
		subscribers.add(o);
	}

	public void removeObserver(Observer o) {
	
		if (subscribers.contains(o) {
			subscribers.remove(o);
		}
		
		subscribers.remove(o);

	}


}
