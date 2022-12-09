package Decorator.Problem1;

public class Square implements IShape {

    @Override
    public void simpleDraw() {
        System.out.println("simple square");
    }

    @Override
    public void drawIn3D() {
        System.out.println("square Draw in 3d");
    }

    @Override
    public void filledColorDraw() {
        System.out.println("Square filled color");
    }

    @Override
    public void colorBorderDraw() {
        System.out.println("Square with color border");
        
    }
    
}
