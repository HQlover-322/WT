package task13;

import java.util.Scanner;



public class Task13 {
	public static void main(String[] args)
	 {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the title, author, price, adition, language and level of the book");
	ProgrammerBook book = new ProgrammerBook(scan.next(),scan.next(),scan.nextInt(),scan.nextInt(),scan.next(),scan.nextInt());
	System.out.println("Enter the title, author, price, adition, language and level of the book");
	ProgrammerBook book2 = new ProgrammerBook(scan.next(),scan.next(),scan.nextInt(),scan.nextInt(),scan.next(),scan.nextInt());
	System.out.println(book.toString());
	System.out.println(book2.toString());
	System.out.println(book.hashCode());
	System.out.println(book2.hashCode());
	System.out.println("Is book equals book 2 "+book.equals(book2));
	 }
}
