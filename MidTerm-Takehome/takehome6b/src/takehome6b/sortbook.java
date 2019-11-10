package takehome6b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortbook {
	List<BookInformation> bl = null;
	String sortby;
	
	public sortbook(String s) {
		this.sortby =s;
	}
	
	public List<BookInformation> sort(List<BookInformation> b){
		List<BookInformation> sorted;
		switch(sortby)
		{
			case "author":
				sorted = sortauthor(b);
				return sorted;
			case "title":
				sorted = sorttitle(b);
				return sorted;
			case "yearpublished":
				sorted = sortyearpublished(b);
				return sorted;
			default :
				return null;
		}
	}
	
	
	public List<BookInformation> sortauthor(List<BookInformation> b) { 
		Collections.sort(b, new Comparator<BookInformation>() 
		{
			public int compare(BookInformation b1, BookInformation b2) {
				return String.valueOf(b1.getauthor()).compareTo(b2.getauthor());
			}
		});
		
		return b;
	}
	
	public List<BookInformation> sorttitle(List<BookInformation> b) {
		Collections.sort(b, new Comparator<BookInformation>() 
		{
			public int compare(BookInformation b1, BookInformation b2) {
				return String.valueOf(b1.gettitle()).compareTo(b2.gettitle());
			}
		});
		
		return b;
	}
	
	public List<BookInformation> sortyearpublished(List<BookInformation> b) {
		Collections.sort(b, new Comparator<BookInformation>() 
		{
			public int compare(BookInformation b1, BookInformation b2) {
				return Integer.valueOf(b1.getyearpublished()).compareTo(b2.getyearpublished());
			}
		});
		
		return b;
		
	}

}
