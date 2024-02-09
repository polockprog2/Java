public class Start
 {
    public static void main(String[] args)
	{
        StoryBook book1 = new StoryBook();
        StoryBook.setDiscountRate(15.00);
        book1 = new StoryBook("97804555532699", "One piece", "ODA", 620.85, 40, "Anime");
        book1.addQuantity(22);
        book1.sellQuantity(45);
        book1.showDetails();

        StoryBook book2 = new StoryBook();
        book2.setIsbn("9780767648493");
        book2.setBookTitle("One Piece");
        book2.setAuthorName("ODA");
        book2.setPrice(620.86);
        book2.setCategory("Anime");
        book2.setAvailableQuantity(45);
        book2.addQuantity(3);
        book2.sellQuantity(10);
        System.out.println("ISBN\t\t: " + book2.getIsbn());
		System.out.println("Book Title\t: " + book2.getBookTitle());
		System.out.println("Author Name\t: " + book2.getAuthorName());
		System.out.println("Price\t\t: " + book2.getPrice());
        System.out.println("Category\t: " + book2.getCategory());
        // System.out.println("Discount Rate\t: " + book2.getDiscountRate() +"%");    // with get method
        System.out.println("Discount Rate\t: " + StoryBook.discountRate +"%");    // static way
		System.out.println("Available Quantity : " + book2.getAvailableQuantity() + '\n');

        TextBook book3 = new TextBook();
        TextBook.discountRate = 20.00;
        book3 = new TextBook("103450789", "English", "monu", 300.50, 40, 3);
        book3.addQuantity(16);
        book3.sellQuantity(30);
        book3.showDetails();
        TextBook book4 = new TextBook();
        book4.setIsbn("987654321");
        book4.setBookTitle("Math");
        book4.setAuthorName("Chonu");
        book4.setPrice(150.00);
        book4.setAvailableQuantity(35);
        book4.setStandard(3);
        book4.addQuantity(5);
        book4.sellQuantity(25);
        System.out.println("ISBN\t\t: " + book4.getIsbn());
		System.out.println("Book Title\t: " + book4.getBookTitle());
		System.out.println("Author Name\t: " + book4.getAuthorName());
		System.out.println("Price\t\t: " + book4.getPrice());
        System.out.println("Standard\t: " + book4.getStandard());
        // System.out.println("Discount Rate\t: " + book4.getDiscountRate() +"%");    // with get method
        System.out.println("Discount Rate\t: " + TextBook.discountRate + " %");    // static way
		System.out.println("Available Quantity : " + book4.getAvailableQuantity() + '\n');
    }
}
