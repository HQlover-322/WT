package task12;

import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {

	
	public int compare(Book o1, Book o2) {
	 return	o1.getAuthor().compareTo(o2.getAuthor());

	}
}