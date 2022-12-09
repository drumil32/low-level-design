package Decorator.Problem1;

public class Rectangle implements IShape {

    @Override
    public void simpleDraw() {
        System.out.println("simple Rectangle");
    }

    @Override
    public void drawIn3D() {
        System.out.println("Rectangle Draw in 3d");
    }

    @Override
    public void filledColorDraw() {
        System.out.println("Rectangle filled color");
    }

    @Override
    public void colorBorderDraw() {
        System.out.println("Rectangle with color border");
    }
    
}
