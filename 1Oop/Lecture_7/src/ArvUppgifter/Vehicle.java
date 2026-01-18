package ArvUppgifter;

public class Vehicle {
    String name;
    String model;
    int year;

    public Vehicle(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println(name + " has started! Wrrom!");
    }

    public void stopEngine(){
        System.out.println(name + "'s engine has stopped. Aww.");
    }

    public void status() {
        System.out.println(name + " är en: " + year + " " + model);
    }


}
