package classes;
import java.lang.*;

public class TextBook extends Book 
{
    private int standard;

    TextBook() 
	{
        System.out.println("+++++++++Text Book Details++++++++++");
    }
    TextBook(String isbn, String bookTitle, double price, int availableQuantity,int standard) 
	{
        super(isbn, bookTitle, price, availableQuantity);
		System.out.println("p-li");
        this.standard = standard;
    }

    public void setStandard(int standard)
	{
        this.standard = standard;
    }
    public int getStandard() 
	{
        return standard;
    }

    public void showDetails() 
	{
        System.out.println("ISBN\t: " + isbn);
		System.out.println("Book Title\t: " + bookTitle);
		System.out.println("Price\t: " + price);
		System.out.println("Available Quantity\t: " + availableQuantity);
        System.out.println("Standard:"+ standard );   
    }
}