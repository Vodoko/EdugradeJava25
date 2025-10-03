public class Person {
    private String name;
    private int age;
    private String homeTown;

    public Person(String name, int age, String hometown) {
        this.name = name;
        this.age = age;
        this.homeTown = hometown;
    }

    public String infoName () {
        return name;
    }
    public int infoAge () {
        return age;
    }
    public String infoHometown () {
        return homeTown;
    }

public void changeName (String name){
        this.name = name;
}

    public void changeAge (int newAge){
        if (newAge < 0) {
            System.out.println("Du kan inte vara yngre än 0.");
        } else if (newAge > 126) {
            System.out.println("Du är troligen inte så gammal.");
        } else age = newAge;
    }
    public void changeTown (String newTown){
        name = newTown;
    }
}
