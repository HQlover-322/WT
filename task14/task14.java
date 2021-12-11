package task14;
import task12.Book;


public class task14 {
	public static void main(String[] args)
	 {
		Book book = new Book("Titel main","Author main",1,3);
		Book book2= (Book)book.clone();
		System.out.println(book2.toString());
	 }

}
