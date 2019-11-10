package takehome6b;

import java.util.ArrayList;
import java.util.List;

public class BookLibrarian {
	List<BookInformation> book = new ArrayList<BookInformation>();
	sortbook stbk;
	
	public void addbook(BookInformation b) {
		book.add(b);
	}
	
	public void printList() {
		List<BookInformation> booklist;
		if(stbk != null) {
			booklist = stbk.sort(book);
			System.out.print("running");
		}
		else {
			booklist = book;
		}
		for (BookInformation b : booklist) {
			System.out.println("Author: " + b.getauthor() + "\tTitle: " + b.gettitle() + "\tYear Published: " + b.getyearpublished() + "\tSummary: " + b.getsummary());
		}
	}
	
	
	public void setSortMethods(sortbook sortMethod) {
		this.stbk = sortMethod;
	}

}
