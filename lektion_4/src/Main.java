//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("---");
        Book bookOne = new Book("lotr", "JRR Tolkien", 999, "Fantasy");
        // System.out.println(bookOne.toString());
        bookOne.info();
        Book bookTwo = new Book("Stora Boken om Lagar", "Svergies Regering", 1500, "Juridik");
        Book bookThree = new Book ("Kartatlas", "Vägverket", 500, "Kartor");


    }
}