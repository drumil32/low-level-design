package Decorator.Problem2;

public class Circle extends Shape {

    Circle(String shapeName) {
        super(shapeName);
    }

    @Override
    public void simpleDraw() {
        System.out.println("simple Circle");
    }

}
