public class StoryBook extends Book
 {
    String category;

    StoryBook()
	{
        System.out.println("++++++++++Story Book Details++++++++\n");
    }
    StoryBook(String isbn,double price, String bookTitle,int availableQuantity, String category)
	{
        super(isbn, bookTitle, price, availableQuantity);
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
    void showDetails() 
	{
        super.showDetails();
        System.out.println("Category: " + category );
    }
}
