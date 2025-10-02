public class Book {
    String title;
    String author;
    int pages;
    String genre;

    public Book(String title, String author, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                '}';
    }

    void info () {
        System.out.println("Boken heter " + title + " och är skriven av " + author + " och har följande antal sidor: " + pages);
    }
}
