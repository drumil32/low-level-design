package Decorator.Solution;

public class Client {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle("Rectangle");
        rectangle.simpleDraw();

        Shape circle = new Circle("Circle");
        circle.simpleDraw();

        ShapeDecorator threeD_Rectangle = new ConvertTo3dDecorator(rectangle);

        threeD_Rectangle.draw();

        ShapeDecorator rectangle_ThreeD_WithBorder = new BorderDrawDecorator(threeD_Rectangle);

        rectangle_ThreeD_WithBorder.draw();

    }
}
