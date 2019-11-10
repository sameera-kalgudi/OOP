package takehome6b;

public class BookInformation {
	String author;
	String title;
	int yearpublished;
	String summary;
	
	public BookInformation(String a, String b, int c, String d) {
		this.author = a;
		this.title = b;
		this.yearpublished =c;
		this.summary = d;
	}
	
	public String getauthor() {
		return(author);
	}
	public String gettitle() {
		return(title);
	}
	public int getyearpublished() {
		return(yearpublished);
	}
	public String getsummary() {
		return(summary);
	}

}
