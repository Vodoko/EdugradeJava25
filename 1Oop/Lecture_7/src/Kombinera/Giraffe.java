package Kombinera;

public class Giraffe extends Animal implements Feedable{

    public Giraffe(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " sounds like a weird horse!");
    }

    @Override
    public void feed(){
        System.out.println(name + " eats leaves.");
    }
}

