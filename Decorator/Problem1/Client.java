package Decorator.Problem1;

// PROBLEM : here we can see that any instance of rectangle never required filledColorDraw functionality but still Ranctangle class needs to implements that functionality because it is part of IShape

public class Client {
    public static void main(String[] args) {

        IShape rectangle = new Rectangle();
        rectangle.simpleDraw();
        rectangle.drawIn3D();
        rectangle.colorBorderDraw();

        IShape circle = new Circle();
        circle.simpleDraw();
        circle.colorBorderDraw();
        circle.drawIn3D();
        circle.filledColorDraw();

    }
}
