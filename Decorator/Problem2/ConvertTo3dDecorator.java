package Decorator.Problem2;

public class ConvertTo3dDecorator extends ShapeDecorator{

    ConvertTo3dDecorator(Shape shape){super(shape);}

    @Override
    public void draw() {
        System.out.println("draw " + this.shape.shapeName + " in 3d ");
    }
    
}
