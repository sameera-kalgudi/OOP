package takehome6a;

public class WorkItem {
	String itemID;
	String message;
	long workerID;
	
	public WorkItem(String a,String b) {
		this.itemID = a;
		this.message = b;		
	}
	public void setItemID(String itemID) { 
		this.itemID = itemID;
	}
	public String getItemID() {
		return(itemID); 
	}
	public String getmessage() {
		return(message);
	}
	public long getworkerID() {
		return(workerID);
	}
}
