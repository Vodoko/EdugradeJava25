import ArvUppgifter.Car;
import ArvUppgifter.Motorcycle;
import ArvUppgifter.Truck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" --- Lektion 7! --- ");
//        exampleEnheritance1();

    }
    static public void exampleEnheritance1() {
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
}