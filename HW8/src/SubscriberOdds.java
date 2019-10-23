
public class SubscriberOdds implements PublisherInterface{

	@Override
	public void registerobserver(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeobserver(Observer o) {
		subscribers.remove(o);
		
	}

	@Override
	public void notifyobserver(Observer o) {
		// TODO Auto-generated method stub
		
	}

}
