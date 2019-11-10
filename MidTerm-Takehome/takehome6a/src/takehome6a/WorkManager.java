package takehome6a;

import java.util.ArrayList;

public class WorkManager {
	ArrayList<Worker> subscriber = new ArrayList<Worker>(4);
	
	public void subscribe(Worker w) {
		subscriber.add(w);
	}
	public void unsubscribe(Worker w) {
		subscriber.remove(w);
	}
	
	public void notify(WorkItem i) {
		for(Worker w: subscriber) {
			if(w.getWorkerID()<=4) {
				String  result = w.notify(i);
				if(result != null){
				System.out.print(w.getWorkerID() + ": Completed work on" + i + "\n");
				}
			}
		}
		
	}

}
