package ArvUppgifter;

public class Motorcycle extends Vehicle{

    public Motorcycle(String name, String model, int year) {
        super(name, model, year);
    }

    public void popWheelie(){
        System.out.println(name + " is doing a wheelie! Is that even legal?");
    }
}
