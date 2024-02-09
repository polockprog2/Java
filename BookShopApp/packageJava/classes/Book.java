public class Book 
{
    private String isbn, bookTitle;
    private double price;
    private int availableQuantity;

    Book()
	{
        System.out.println("++++++empty+++++++\n");
    }
    Book(String isbn,String bookTitle, double price, int availableQuantity)
	{
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public void setIsbn(String isbn) 
	{
        this.isbn = isbn;
    }
    public void setBookTitle(String bookTitle)
	{
        this.bookTitle = bookTitle;
    }
 
    public void setPrice(double price)
	{
        this.price = price;
    }
   public void setAvailableQuantity(int availableQuantity) 
	{
        this.availableQuantity = availableQuantity;
    }

    public String getIsbn() 
	{
        return isbn;
    }
    public String getBookTitle() 
	{
        return bookTitle;
    }
  
    public double getPrice()
	{
        return price;
    }
   public int getAvailableQuantity()
	{
        return availableQuantity;
    }
    void addQuantity(int amount)
	   {
          if(amount>0) 
		    {
            availableQuantity += amount;
            }
          else
			{
            System.out.println("Invalid");
            }
       }
    void sellQuantity(int amount)
	     {
         if(amount>0 && amount<=availableQuantity)
			 {
                 availableQuantity -= amount;
             }
        else 
		     {
                 System.out.println("Invalid");
             }
         }
    void showDetails()
	{
        System.out.println("ISBN\t: " + isbn);
		System.out.println("Book Title\t: " + bookTitle);
		System.out.println("Price\t: " + price);
		System.out.println("Available Quantity : " + availableQuantity);
    }
}
