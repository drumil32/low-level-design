package Decorator.Problem2;

public abstract class Shape {
    String shapeName;
    Shape(String shapeName) {this.shapeName = shapeName;}
    public abstract void simpleDraw();
}
