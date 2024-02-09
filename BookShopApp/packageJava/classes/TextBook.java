public class TextBook extends Book 
{
    int standard;

    TextBook() 
	{
        System.out.println("+++++++++Text Book Details++++++++++");
    }
    TextBook(String isbn,int standard, String bookTitle, double price, int availableQuantity) {
        super(isbn, bookTitle, price, availableQuantity);
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

    void showDetails() 
	{
        super.showDetails();
        System.out.println("Standard:"+ standard );   
    }
}