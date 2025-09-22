//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

//        Book lotr = new Book();
//        lotr.author = "JRR Tolkien";
//        lotr.title = "Lord of the Rings";
//        lotr.pages = 1200;

        Book book1 = new Book("Lord of the rings", "JRR Tolkien", 1200);

        System.out.println("Hur många sidor har Lotr: " + book1.pages);

        System.out.println("Info om book1: " + book1.toString());

     book1.info();
    }
}