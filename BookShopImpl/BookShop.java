import java.lang.*;

public class BookShop
{
	private String name;
	private Book books[];
	
	public BookShop()
	{
		System.out.println("E-BookShop");
		books = new Book[100];
	}
	public BookShop(String name)
	{
		this();
		System.out.println("P-BookShop");
		this.name = name;
	    
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public void showDetails()
	{
	
		System.out.println("BookShop Name: "+name);
		
	}
	public boolean insertBook(Book b)
	{
		boolean flag = false;
		for(int i=0; i<books.length; i++)
		{
			if(books[i] == null)
			{
				books[i] = b;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeBook(Book b)
	{
		boolean flag = false;
		for(int i=0; i<books.length; i++)
		{
			if(books[i] == b)
			{
				books[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public Book searchBook(String isbn)
	{
		Book flag = null;
		for(int i=0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				if(books[i].getIsbn() == isbn)
				{
					flag = books[i];
					break;
				}
			}
		}
		return flag;
	}
	public void showAllBooks()
	{
		for(int i=0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				books[i].showDetails();
				System.out.println();
			}
		}
	}
}