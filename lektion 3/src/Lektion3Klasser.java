class Person {
    String name;
    int age;
    String occupation;

    public Person(String name, int age, String occupation) {
        this.name = "Unknown";
        this.age = 0;
        this.occupation = "Unknown";
    }

    Person() {}

    void introduce() {
        System.out.println("Hej, jag heter " + name + " och jag är en " + age + " aerig " + occupation);
    }
}


public class Lektion3Klasser {
    public static void main(String[] args) {

        System.out.println("Uppgift 1.1");
        Person person = new Person();
        person.name = "Haukan";
        person.age = 18;
        person.occupation = "Snickare";

        System.out.println("Name:" + person.name);
        System.out.println("Age:" + person.age);
        System.out.println("Occupation:" + person.occupation);

        person.introduce();
        Person defaultPerson = new Person();
        System.out.println("Namn: "+defaultPerson.name);
        System.out.println("Ålder: "+defaultPerson.age);
        System.out.println("Yrke: "+defaultPerson.occupation);
        defaultPerson.introduce();
    }
}
