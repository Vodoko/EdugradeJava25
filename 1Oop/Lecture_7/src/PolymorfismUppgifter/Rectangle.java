package PolymorfismUppgifter;

public class Rectangle extends Shape{
    double side;

    public Rectangle(double side) {
        this.side = side;
    }

    @Override
    public void draw(){
        System.out.println("Omkretsen på denna rektangel är: " + (side*4));
    }
}
