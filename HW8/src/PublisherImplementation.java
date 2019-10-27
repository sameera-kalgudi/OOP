import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class PublisherImplementation implements Observer {
	
	private List<Observer>subscribers = new ArrayList<Observer>();
	private List<Observer> unsubscribers = new ArrayList<Observer>();
	int eventNumber = 0;
	
	public boolean notifyObserver(Event e) {
		System.out.println("Event " + e.getEventNumber() + e.getEventData());
		return true;
	}
	
	public Event generateEvent() {
		
		int eventData = ThreadLocalRandom.current().nextInt(1, 5000); 
		eventNumber++;
		return new Event(eventNumber, eventData);
	}
	
	public void runSimulation() {
		PublisherImplementation PubImp = new PublisherImplementation();
		SubscriberEvens SubEven = new SubscriberEvens();
		SubscriberOdds SubOdd = new SubscriberOdds();
		SubscriberThrees SubThree = new SubscriberThrees();
		int oddsCount = 0;
		int evensCount = 0;
		int threesCount = 0;
						
		
		for(var i = 0; i < 200; i++)
		{
			Event newEvent = generateEvent();

			Boolean evenResponse = SubEven.notifyObserver(newEvent);
			Boolean oddResponse = SubOdd.notifyObserver(newEvent);
			Boolean threeResponse = SubThree.notifyObserver(newEvent);
			
			if(evenResponse == true)
			{
				evensCount++;
			}
			if(oddResponse == true)
			{
				oddsCount++;
			}
			if(threeResponse == true)
			{
				threesCount++;
			}
			
			if(oddsCount > 20)
			{
				removeObserver(SubOdd);
			}
			if(threesCount > 6)
			{
				removeObserver(SubThree);
			}
			if(i == 40 || i == 80 || i == 120 || i == 160 || i == 160)
			{
				if(unsubscribers.contains(SubOdd))
				{
					registerObserver(SubOdd);
					System.out.println("removed subOdd");
				}
				if(unsubscribers.contains(SubThree))
				{
					registerObserver(SubThree);
					System.out.println("removed subThree");
				}
			}
				
		}
		
	}
	
	public void registerObserver(Observer o) {
		
		if (unsubscribers.contains(o)) {
			unsubscribers.remove(o);
		}

		subscribers.add(o);
	}

	public void removeObserver(Observer o) {
	
		if (subscribers.contains(o)) {
			subscribers.remove(o);
		}
		
		unsubscribers.add(o);

	}
}
