//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int a = 12;
//        int b = 4;
//        SimpleCalculator newTry = new SimpleCalculator();
//        personifier1();
//        personifier2();
//        carifier();
//        bookifier1();
//        bookifier2();


    }

    static void bookifier1() {
        Book book1 = new Book("Eragon", "Chris Paulini", 300);
        book1.infoBook();
        book1.discountDeduction(0.8);
        book1.infoBook();

    }

    static void bookifier2() {
        Book book2 = new Book("Argonauter", "Valdvald", 500);
        book2.infoBook();
        book2.discountDeduction(0.33);
        book2.infoBook();
    }

    static void carifier() {
        Car car1 = new Car();
        Car car2 = new Car("Volvo", "V70");
        Car car3 = new Car("Firehawk", "Blazer", 1999);
        car1.displaysCarInfo();
        car2.displaysCarInfo();
        car3.displaysCarInfo();
    }

    static void personifier1() {
        Person person1 = new Person("Valle", 31, "Umea");
        System.out.println(person1.infoName());
        System.out.println(person1.infoAge());
        System.out.println(person1.infoHometown());
        person1.changeAge(32);
        //person1.changeName(32);
        System.out.println("Valdemar är nu: " + person1.infoAge());
        person1.changeName("Voldemort");
        System.out.println("Valdemars namn är nu: " + person1.infoName());
    }

    static void personifier2() {
        Person person2 = new Person("Per", 50, "Skellefteå");
        System.out.println(person2.infoName());
        System.out.println(person2.infoAge());
        System.out.println(person2.infoHometown());
    }
//    public void mathStuff(int a, int b){
//
//    }
}
