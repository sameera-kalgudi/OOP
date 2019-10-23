
public interface PublisherInterface extends Observer {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver(Observer o);

}
