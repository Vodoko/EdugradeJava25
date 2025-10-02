public class Car {
    private String brand;
    private String model;
    private int year;

    public Car() {}

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displaysCarInfo () {
        System.out.println("Denna bil är en " + brand + " av modellen " + model + " från året " + year);
    }
}
