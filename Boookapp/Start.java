public class Start
 {
    public static void main(String[] args)
	{
        StoryBook book1 = new StoryBook();
        book1 = new StoryBook("45447532699", "one piece", "ODA", 420.75, 40, "Anime");
        book1.addQuantity(12);
        book1.sellQuantity(35);
        book1.showDetails();

        StoryBook book2 = new StoryBook();
        book2.setIsbn("9780747538493");
        book2.setBookTitle("new Dawn");
        book2.setAuthorName("Jowling");
        book2.setPrice(520.25);
        book2.setCategory("Fiction");
        book2.setAvailableQuantity(45);
        book2.addQuantity(3);
        book2.sellQuantity(10);
        System.out.println("ISBN\t\t: " + book2.getIsbn());
		System.out.println("Book Title\t: " + book2.getBookTitle());
		System.out.println("Author Name\t: " + book2.getAuthorName());
		System.out.println("Price\t\t: " + book2.getPrice());
        System.out.println("Category\t: " + book2.getCategory());
		System.out.println("Available Quantity : " + book2.getAvailableQuantity() + '\n');

        TextBook book3 = new TextBook();
        book3 = new TextBook("4423456789", "book", "alam", 100.50, 30, 2);
        book3.addQuantity(11);
        book3.sellQuantity(25);
        book3.showDetails();
        
        TextBook book4 = new TextBook();
        book4.setIsbn("1234654321");
        book4.setBookTitle("Book");
        book4.setAuthorName("arim");
        book4.setPrice(150.00);
        book4.setAvailableQuantity(35);
        book4.setStandard(5);
        book4.addQuantity(8);
        book4.sellQuantity(19);
        System.out.println("ISBN\t: " + book4.getIsbn());
		System.out.println("Book Title\t: " + book4.getBookTitle());
		System.out.println("Author Name\t: " + book4.getAuthorName());
		System.out.println("Price\t: " + book4.getPrice());
        System.out.println("Standard\t: " + book4.getStandard());
		System.out.println("Available Quantity:\t " + book4.getAvailableQuantity());
    }
}
