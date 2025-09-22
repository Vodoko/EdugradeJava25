//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Book lotr = new Book();
        lotr.author = "JRR Tolkien";
        lotr.titel = "Lord of the Rings";
        lotr.pages = 1200;

        System.out.println("Hur många sidor har Lotr: " + lotr.pages);


    }
}