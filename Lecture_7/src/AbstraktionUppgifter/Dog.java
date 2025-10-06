package AbstraktionUppgifter;

public class Dog extends Animal implements Pet{

    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " goes 'Woof'!");
    }

    @Override
    public void play(){
        System.out.println(name + " is playing! How fun!");
    }
}
