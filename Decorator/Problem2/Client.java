package Decorator.Problem2;

// NOTE : simpleDraw is basic functionality which is generally required by every shape so we put it inside Shape interface

// WHAT IS PROBLEM HERE??

// if we want BorderDraw and ConvertTo3D simulteneously on one Shape then it is not possible to do

// LIKE here, first we drew the rectangle in 3d and then we draw rectangle border

// MEANS HERE, we are not able to draw the border of the 3d rectangle here we are just able to draw border of the simple rectangle

// like if you saw problem1 then 

// we are doing some thing like this

// IShape circle = new Circle();
//  circle.simpleDraw();
//  circle.colorBorderDraw();
//  circle.drawIn3D();
//  circle.filledColorDraw();

// here first we draw the circle then we color the border of that circle then we draw that colored border circle in 3d then we fill that(circle with color border and in 3d shapre) circle with color

// this is not possible here

public class Client {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle("Rectangle");
        rectangle.simpleDraw();

        Shape circle = new Circle("Circle");
        circle.simpleDraw();

        ShapeDecorator shapeDecorator = new ConvertTo3dDecorator(rectangle);

        shapeDecorator.draw();

        shapeDecorator = new BorderDrawDecorator(rectangle);

        shapeDecorator.draw();

    }
}
