package ArvUppgifter;

public class Truck extends Vehicle{

    public Truck(String name, String model, int year) {
        super(name, model, year);
    }

    public void loadCargo() {
        System.out.println(name + " is loading cargo! Reloading!");
    }
}
