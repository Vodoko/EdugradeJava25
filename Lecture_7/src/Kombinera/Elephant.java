package Kombinera;

public class Elephant extends Animal implements Feedable{

    public Elephant(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " trumpets!");
    }

    @Override
    public void feed(){
        System.out.println(name + " eats fruits.");
    }
}

