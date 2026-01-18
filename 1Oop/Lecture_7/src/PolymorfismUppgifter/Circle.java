package PolymorfismUppgifter;

public class Circle extends Shape{
    double radie;
    double pi = 3.14;

    public Circle(double radie) {
        this.radie = radie;
    }

    @Override
    public void draw(){
        System.out.println("Omkretsen på denna cirkel är: " + (radie*2.0)*pi);
    }
}
