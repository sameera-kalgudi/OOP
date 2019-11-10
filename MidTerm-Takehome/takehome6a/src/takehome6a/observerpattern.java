package takehome6a;

public class observerpattern {

	public static void main(String[] args) {
		
		WorkManager manager = new WorkManager();
		Worker w1 = new Worker(1);
		Worker w2 = new Worker(2);
		Worker w3 = new Worker(3);
		Worker w4 = new Worker(4);
		
		manager.subscribe(w1);
		manager.subscribe(w2);
		manager.subscribe(w3);
		manager.subscribe(w4);
		
		WorkItem i1 = new WorkItem("1","run");
		manager.notify(i1);
		WorkItem i2 = new WorkItem("3","sleep");
		manager.notify(i2);
		WorkItem i3 = new WorkItem("5","code");
		manager.notify(i3);
		
	}

}
