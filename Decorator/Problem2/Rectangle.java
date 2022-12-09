package Decorator.Problem2;

public class Rectangle extends Shape {

    Rectangle(String shapeName){super(shapeName);}

    @Override
    public void simpleDraw() {
        System.out.println("simple Rectangle");
    }
    
}
