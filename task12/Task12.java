package task12;

import java.util.*;

public class Task12 {

	public static void main(String[] args)
	 {
Scanner scan = new Scanner(System.in);
System.out.println("Enter the title, author, price and adition of the book");
Book book = new Book(scan.next(),scan.next(),scan.nextInt(),scan.nextInt());
System.out.println("Enter the title, author, price and adition of the book");
Book book2 = new Book(scan.next(),scan.next(),scan.nextInt(),scan.nextInt());
System.out.println(book.toString());
System.out.println(book2.toString());
System.out.println(book.hashCode());
System.out.println(book2.hashCode());
System.out.println("Is book equals book 2 "+book.equals(book2));
System.out.println("Set isbn for book");
book.setIsbn(scan.nextInt());
System.out.println("Set isbn for book2");
book2.setIsbn(scan.nextInt());
System.out.println(book.compareTo(book2));

Comparator<Book> titleComp = new BookTitleComparator();
Comparator<Book> titleAuthorComp = new BookTitleComparator().thenComparing(new BookAuthorComparator());
Comparator<Book> authorTitleComp = new BookAuthorComparator().thenComparing(new BookTitleComparator());
Comparator<Book> authorTitlePriceComp = new BookAuthorComparator().thenComparing(new BookTitleComparator()).thenComparing(new BookPriceComparator());
	 }

}
