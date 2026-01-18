package AbstraktionUppgifter;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    public void sleep() {
        System.out.println("This " + name + " is fast asleep!");
    }
}
