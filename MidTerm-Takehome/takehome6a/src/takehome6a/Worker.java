package takehome6a;

public class Worker {
	long workerID;
	
	public Worker(long workerID) {
		this.workerID = workerID;
	}
	public long getWorkerID() { 
		return workerID; 
	}
	public String  notify(WorkItem i) {
		if(i.getItemID().equals(Long.toString(workerID))) {
			String s = ("worker:" + workerID + "\tprocessed WorkItem" + i.getItemID() + "\tmessage" + i.getmessage());
			int id = Integer.parseInt(i.itemID) + 1;
			i.setItemID(Integer.toString(id));
			return s;
			
		}
		else 
		return null;
		
	}
}
