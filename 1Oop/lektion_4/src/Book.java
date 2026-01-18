import java.sql.SQLOutput;

public class Book {
    String title;
    String author;
    double pages;
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

    void readingTime () {
        double timeToRead = (pages / 75);
        System.out.println("Det tar " + timeToRead + " dagar att läsa " + title);
    }

    void isItFantasy () {
        boolean checkFantasy = (genre == "Fantasy");
        if (checkFantasy) {
            System.out.println("Boken är av Genren Fantasy!");
        } else System.out.println("Boken är inte fantasy. Den är av Genren " + genre);
    }
}
