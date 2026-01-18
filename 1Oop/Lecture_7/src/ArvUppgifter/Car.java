package ArvUppgifter;

public class Car extends Vehicle{

    public Car(String name, String model, int year) {
        super(name, model, year);
    }
    public void playRadio () {
        System.out.println(name + " is blasting the radio. Wieee!");
    }
}
