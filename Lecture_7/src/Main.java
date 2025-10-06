import AbstraktionUppgifter.Dog;
import AbstraktionUppgifter.Guitar;
import AbstraktionUppgifter.Piano;
import ArvUppgifter.Car;
import ArvUppgifter.Motorcycle;
import ArvUppgifter.Truck;
import Kombinera.FullTimeEmployee;
import Kombinera.PartTimeEmployee;
import PolymorfismUppgifter.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" --- Lektion 7! --- ");
//        exampleEnheritance();
//        exampleMethodOverloading();
//examplePolymorfism1();
//        examplePrinting();
//exampleAbstract();
//interfaceExample();
//kombineraAbstraktOchInterface();
        excerciseFour();

    }

    static public void excerciseFour(){
        FullTimeEmployee employee1 = new FullTimeEmployee("Valleboi", 300);
        PartTimeEmployee employee2 = new PartTimeEmployee("Vallegirl", 200,30);
        employee1.pay();
        employee2.pay();
    }

    static public void kombineraAbstraktOchInterface(){
        Dog dog = new Dog("Fido");
        dog.makeSound();
        dog.sleep();
        dog.play();
    }

    static public void interfaceExample(){
        Guitar guitar = new Guitar();
        guitar.play();
        Piano piano = new Piano();
        piano.play();
    }

    static public void exampleAbstract(){
        AbstraktionUppgifter.Circle circle = new AbstraktionUppgifter.Circle(2.5);
        circle.calculateArea();
        AbstraktionUppgifter.Rectangle rectangle = new AbstraktionUppgifter.Rectangle(5);
        rectangle.calculateArea();
    }

    static public void examplePrinting(){
        Printer printer = new Printer();
        printer.print("Exterminate!");
        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.print("Exterminate!");
    }

    static public void examplePolymorfism1() {
        Circle circle = new Circle(5.0);
        circle.draw();
        Rectangle rectangle = new Rectangle(5.);
        rectangle.draw();
    }

    static public void exampleEnheritance() {
        Car car = new Car("Rymdskeppet", "Previa", 2006);
        Motorcycle motorcycle = new Motorcycle("Äventyrarn", "Toyota", 1752);
        car.status();
        motorcycle.status();
        car.startEngine();
        motorcycle.startEngine();
        car.playRadio();
        motorcycle.popWheelie();
        Truck truck = new Truck("Van Dam Tucker", "Big honkin' truck", 2025);
        truck.status();
        truck.startEngine();
        truck.stopEngine();
        truck.loadCargo();
    }

    static public void exampleMethodOverloading() {
        Calculator calculator = new Calculator();
        System.out.println("Test int multi: " + calculator.multiply(6, 7));
        System.out.println("Test double multi: " + calculator.multiply(6.5, 7.5));
    }

}