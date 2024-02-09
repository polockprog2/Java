public class TextBook extends Book 
{
    int standard;

    TextBook() 
	{
        System.out.println("________Text Book Details________\n");
    }
    TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
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

    void showDetails() {
        super.showDetails();
        System.out.println("Standard\t: " + standard );   
    }
}