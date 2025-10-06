package Kombinera;

public class PartTimeEmployee extends Employee implements Payable{
    int ratePerHour;
    //döp om till hoursEmployed eller sätt bara till (40) och låt ta bort från konstruktorn
    int hoursWorked;

    //ta vort hoursWorked
    public PartTimeEmployee(String name, int ratePerHour, int hoursWorked){
        super(name);
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public int calculateSalary (){
        return ratePerHour*hoursWorked;
    }
    @Override
    public void pay(){
        //int salary = calculateSalary();
        System.out.println(name + "har en lön på " + calculateSalary());
    }
}
