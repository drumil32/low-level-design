package Decorator.Problem1;

public class Circle implements IShape{

    @Override
    public void simpleDraw() {
        System.out.println("simple Circle");
    }

    @Override
    public void drawIn3D() {
        System.out.println("Circle Draw in 3d");
    }

    @Override
    public void filledColorDraw() {
        System.out.println("Circle filled color");
    }

    @Override
    public void colorBorderDraw() {
        System.out.println("Circle with color border");
    }
    
}
