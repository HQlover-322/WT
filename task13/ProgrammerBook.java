package task13;
import task12.Book;

public class ProgrammerBook extends Book {
	private String language;
	private int level;
	public ProgrammerBook(String title, String author, int price, int edition, String language, int level)
	{
		super(title, author, price, edition);
		this.language=language;
		this.level=level;
	}
	@Override
	public String toString()
	{
		return super.toString()+" Language "+language+" Level "+level;
	}
	@Override 
	public boolean equals(Object o)
	{
		if (!(o instanceof Book)) return false;		 
		ProgrammerBook p = (ProgrammerBook)o;
		if(super.equals(o)&& this.language.equals(p.language)&&this.level==p.level)
			return true;
		else return false;
	}
	 @Override
	 public int hashCode()
	 {	 
	 return super.hashCode()+language.hashCode()+level ;
	 }
	 
}
