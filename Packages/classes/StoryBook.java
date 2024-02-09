package classes;
import java.lang.*;

public class StoryBook extends Book
 {
    private String category;

    StoryBook()
	{
        System.out.println("++++++++++Story Book Details++++++++\n");
    }
    StoryBook(String isbn, String bookTitle, double price, int availableQuantity, String category)
	{
        super(isbn, bookTitle, price, availableQuantity);
		System.out.println("P-Pi");
        this.category = category;
    }

    public void setCategory(String category)
	{
        this.category = category;
    }
    public String getCategory()
	{
        return category;
    }
   public void showDetails() 
	{
        System.out.println("ISBN\t: " + isbn);
		System.out.println("Book Title\t: " + bookTitle);
		System.out.println("Price\t: " + price);
		System.out.println("Available Quantity\t: " + availableQuantity);
        System.out.println("Category: " + category );
    }
}
