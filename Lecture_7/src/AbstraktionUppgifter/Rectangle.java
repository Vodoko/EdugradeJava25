package AbstraktionUppgifter;

public class Rectangle extends Shape {
    double side;

    public Rectangle(double side) {
        this.side = side;
    }
    @Override
    public void calculateArea(){
        System.out.println("Arean på denna cirkel är: " + (side*side) + " cm^2");
    }
}

