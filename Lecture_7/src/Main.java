import ArvUppgifter.Car;
import ArvUppgifter.Motorcycle;
import ArvUppgifter.Truck;
import PolymorfismUppgifter.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" --- Lektion 7! --- ");
//        exampleEnheritance();
//        exampleMethodOverloading();
//examplePolymorfism1();
        examplePrinting();

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