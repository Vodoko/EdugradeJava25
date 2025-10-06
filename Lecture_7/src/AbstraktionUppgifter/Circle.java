package AbstraktionUppgifter;

import java.sql.SQLOutput;

public class Circle extends Shape {
    double radie;
    double pi = 3.1415;

    public Circle(double radie) {
        this.radie = radie;
    }

    @Override
    public void calculateArea(){
        System.out.println("Arean på denna cirkel är: " + (pi*radie*radie) + " cm^2");
    }
}
