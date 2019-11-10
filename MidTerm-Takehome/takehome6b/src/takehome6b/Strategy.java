package takehome6b;

public class Strategy {

	public static void main(String[] args) {
		BookLibrarian l =new BookLibrarian ();
		l.addbook(new BookInformation("Tolkien", "The Lord of the Rings", 1954, "good" ));
		l.addbook(new BookInformation("Paulo Coelho", "The Alchemist ", 1988, "great" ));
		l.addbook(new BookInformation("Antoine de Saint-Exupéry", "The Little Prince ", 1943, "good" ));
		l.addbook(new BookInformation("Jacob ", "Grimms' Fairy Tales", 1812, "good" ));
		l.addbook(new BookInformation("J. K. Rowling", "Harry Potter and the Philosopher's Stone", 1997, "good" ));
		l.addbook(new BookInformation("J. R. R. Tolkien", "The Hobbit", 1937, "good" ));
		l.addbook(new BookInformation("Agatha Christie", "And Then There Were None", 1979, "good" ));
		l.addbook(new BookInformation("Cao Xueqin", "Dream of the Red Chamber", 1791, "good" ));
		l.addbook(new BookInformation("Napoleon Hill", "Think and Grow Rich", 1937, "good" ));
		l.addbook(new BookInformation("Dan Brown", "The Da Vinci Code", 2003, "good" ));
		l.addbook(new BookInformation("Vladimir Nabokov", "Lolita", 1955, "good" ));
		l.addbook(new BookInformation("Johanna Spyri", "Heidi", 1880, "good" ));
		l.addbook(new BookInformation("Anna Sewell", "Black Beauty", 1877, "good" ));
		l.addbook(new BookInformation("Jack Higgins", "The Eagle Has Landed", 	1975, "good" ));
		l.addbook(new BookInformation("	Richard Adams", "Watership Down	", 1972, "good" ));
		l.addbook(new BookInformation("Shere Hite", "The Hite Report", 1976, "good" ));
		l.addbook(new BookInformation("E.B. White", "Charlotte's Web", 1952, "good" ));
		l.addbook(new BookInformation("J. P. Donleavy", "The Ginger Man", 1959, "good" ));
		l.addbook(new BookInformation("Jeffrey Archer", "Kane and Abel	", 1979, "good" ));
		l.addbook(new BookInformation("	V. C. Andrews", "Flowers in the Attic", 1978, "good" ));
		
		System.out.println("unsorted:");
		l.printList();
		System.out.println("sort by title:");
		l.setSortMethods(new sortbook("title"));
		l.printList();
		System.out.println("sort by author:");
		l.setSortMethods(new sortbook("author"));
		l.printList();
		System.out.println("sort by yearpublished:");
		l.setSortMethods(new sortbook("yearpublished"));
		l.printList();
	}

}
