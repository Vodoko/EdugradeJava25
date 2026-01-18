public class Book {
    private String title;
    private String author;
    private double price;

    public Book (String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void infoBook() {
        System.out.println("Boken " + title + ", av " + author + " kostar " + price);
    }

    public void discountDeduction (double rabatt) {
        price = rabatt * price;
    }
}
