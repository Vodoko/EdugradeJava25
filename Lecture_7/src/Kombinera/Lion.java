package Kombinera;

public class Lion extends Animal implements Feedable{

    public Lion(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " roars!");
    }

    @Override
    public void feed(){
        System.out.println(name + " eats beef.");
    }
}
