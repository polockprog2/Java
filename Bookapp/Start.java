public class Start {
    public static void main(String[] args) {
        Book book1 = new Book("9780747532699", "hawa me urta jaye ", "pinikmama", 520.75, 50);
        book1.sellQuantity(24);
        book1.addQuantity(30);

        Book book2 = new Book();
        book2.setIsbn("9780747538493");
        book2.setBookTitle("ter lal dupatta ");
        book2.setAuthorName("pinikmama");
        book2.setPrice(620.25);
        book2.setAvailableQuantity(45);
        book2.addQuantity(3);
        book2.sellQuantity(10);

        Book[] books = new Book[5];
        books[0] = book1;
        books[1] = book2;
        books[2] = new Book("9780747532765", "ur ur ur ", "pinikmama", 700, 150);
        books[3] = new Book("9780747532232", "ure ure", "pinikmama", 425, 100);
        books[4] = new Book("9780747532546", "urta jah caliya jah", "pinikmama", 720, 92);

        for(int i=0; i<books.length; i++) {
            new Book();
            books[i].showDetails();
        }
    }
}