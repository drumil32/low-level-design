package Decorator.Solution;

public abstract class ShapeDecorator extends Shape{
    Shape shape;

    public void simpleDraw(){
        System.out.println("what is this");
    }

    ShapeDecorator(Shape shape) {super(shape.shapeName);this.shape = shape;}

    public abstract void draw();
}
