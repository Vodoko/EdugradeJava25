//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("---");
        Book bookOne = new Book("Lord of the rings", "JRR Tolkien", 999, "Fantasy");
        // System.out.println(bookOne.toString());
        bookOne.info();
        Book bookTwo = new Book("Stora Boken om Lagar", "Svergies Regering", 1500, "Juridik");
        Book bookThree = new Book("Kart-Atlas", "Vägverket", 500, "Kartor");
        bookOne.readingTime();
        bookTwo.readingTime();
        bookThree.readingTime();
        bookOne.isItFantasy();
        bookTwo.isItFantasy();
        compareBooks(bookOne.pages, bookTwo.pages);
    }

    static void compareBooks(double a, double b) {
        if (a == b) {
            System.out.println("Böckerna är lika långa!");
        } else if (a > b) {
            System.out.println("Den första boken är längre!");
        } else System.out.println("Den andra boken är längre!");

    }
}
