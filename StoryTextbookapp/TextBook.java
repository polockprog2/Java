public class TextBook {
    String isbn, bookTitle, authorName;
    double price;
    int availableQuantity, standard;
    static double discountRate;

    TextBook() {
        System.out.println(">---------Text Book Details---------<\n");
    }
    TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
        this.standard = standard;
    }

    public static void setDiscountRate(double discountRate) {
        TextBook.discountRate = discountRate;
    }
    public static double getDiscountRate() {
        return discountRate;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
    public void setStandard(int standard) {
        this.standard = standard;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public String getAuthorName() {
        return authorName;
    }
    public double getPrice() {
        return price;
    }
    public int getAvailableQuantity() {
        return availableQuantity;
    }
    public int getStandard() {
        return standard;
    }
    void addQuantity(int amount) {
        if(amount>0) {
            availableQuantity += amount;
        }
        else {
            System.out.println("Invalid");
        }
    }
    void sellQuantity(int amount) {
        if(amount>0 && amount<=availableQuantity) {
            availableQuantity -= amount;
        }
        else {
            System.out.println("Invalid");
        }
    }
    void showDetails() {
        System.out.println("ISBN\t\t: " + isbn);
		System.out.println("Book Title\t: " + bookTitle);
		System.out.println("Author Name\t: " + authorName);
		System.out.println("Price\t\t: " + price);
        System.out.println("Standard\t: " + standard);
        System.out.println("Discount Rate\t: " + discountRate + " %");
		System.out.println("Available Quantity : " + availableQuantity + "\n");
    }
}
