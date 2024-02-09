package classes;
import java.lang.*;
import interfaces.BookShopOperations;

public class BookShop implements BookShopOperations
{
	private String name;
	private Book listOfBooks[];
	
	public BookShop()
	{
		System.out.println("E-BookShop");
		listOfBooks = new Book[100];
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
		for(int i=0; i<listOfBooks.length; i++)
		{
			if(listOfBooks[i] == null)
			{
				listOfBooks[i] = b;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeBook(Book b)
	{
		boolean flag = false;
		for(int i=0; i<listOfBooks.length; i++)
		{
			if(listOfBooks[i] == b)
			{
				listOfBooks[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public Book searchBook(String isbn)
	{
		Book flag = null;
		for(int i=0; i<listOfBooks.length; i++)
		{
			if(listOfBooks[i] != null)
			{
				if(listOfBooks[i].getIsbn() == isbn)
				{
					flag = listOfBooks[i];
					break;
				}
			}
		}
		return flag;
	}
	public void showAllBooks()
	{
		for(int i=0; i<listOfBooks.length; i++)
		{
			if(listOfBooks[i] != null)
			{
				listOfBooks[i].showDetails();
				System.out.println();
			}
		}
	}
}