package Kombinera;

public abstract class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    abstract void makeSound();

    public String getName() {
        return name;
    }
}
