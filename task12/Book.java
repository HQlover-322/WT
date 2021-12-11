package task12;

public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private int price;
	private static int edition;
	private int isbn;
	
	@Override
	public String toString()
	{
		return "Title "+title+" Author "+author+" Price "+price+" Eddition "+edition;
	}
	@Override 
	public boolean equals(Object o)
	{
		if (!(o instanceof Book)) return false;
		 
		Book p = (Book)o;
        if(this.title.equals(p.title)&&this.author.equals(p.author)&&this.price==(p.price)&&this.edition==(p.edition))
        return true;
        else return false;
	}
	 @Override
	 public int hashCode()
	 {	 
	 return title.hashCode() + author.hashCode()+price+edition ;
	 }
	 @Override
	 public Object clone()
	 {
		return new Book(title,author,price,edition);
		 
	 }
	 public void setIsbn(int value)
	 {
		this.isbn=value; 
	 }
	 public String getTitle()
	 {
		 return this.title;
	 }
	 public String getAuthor()
	 {
		 return this.author;
	 }
	 public int getPrice()
	 {
		 return this.price;
	 }
	 public int compareTo(Book book)
	 {
		 if(this.isbn> book.isbn)
	            return 1;
	        else if(this.isbn> book.isbn)
	            return -1;
	        else
	            return 0;
	 }
	 
	 public Book(String title, String author, int price, int edition)
	 {
		 this.title=title;
		 this.author=author;
		 this.price=price;
		 this.edition=edition;
	 }

}
