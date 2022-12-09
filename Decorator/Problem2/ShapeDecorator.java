package Decorator.Problem2;

public abstract class ShapeDecorator {
    Shape shape;

    ShapeDecorator(Shape shape) {this.shape = shape;}

    public abstract void draw();
}
