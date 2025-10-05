package education;

public class Student {
    private String name;

    // konstruktor!
    // Inbygd i konstruktorn för att förhindra ogiltiga namn
    public Student(String name) {
        int minLength = 3;
        if (name.length() < minLength)
            System.out.println("Namnet du valt är för kort!");
        else {
            this.name = name;
        }
    }

    public void setName(String name) {
        int minLenght = 3;
        if (name.length() < minLenght)
            System.out.println("Namnet du ändrar till är för kort!");
        else
            this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}
