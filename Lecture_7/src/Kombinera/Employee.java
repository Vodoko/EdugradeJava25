package Kombinera;

public abstract class Employee {
    String name;

    public Employee(String name){
        this.name = name;
    }

    abstract int calculateSalary();
}
