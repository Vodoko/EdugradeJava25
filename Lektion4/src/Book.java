public class Book {
    String title;
    String author;
    int pages;
    String genre;

    //Instansiera constructorn
    public Book() {
    }
//Constructor
    public Book(String title, String author, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;

    }

    void info() {
        System.out.println("Book title: " + title + ", and author: " + author);
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
}
