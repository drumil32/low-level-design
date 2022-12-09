package Decorator.Problem2;

public class Square extends Shape {

    Square(String shapeName){super(shapeName);}

    @Override
    public void simpleDraw() {
        System.out.println("simple square");
    }
}
