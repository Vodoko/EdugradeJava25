package Kombinera;

public class FullTimeEmployee extends Employee implements Payable{
    int ratePerHour;
    int hoursWorked = 40;

    public FullTimeEmployee(String name, int ratePerHour){
        super(name);
        this.ratePerHour = ratePerHour;
    }

    @Override
    public int calculateSalary (){
        return ratePerHour*hoursWorked;
    }
    @Override
    public void pay(){
        //int salary = calculateSalary();
        System.out.println(name + " har en lön på " + calculateSalary());
    }
}
