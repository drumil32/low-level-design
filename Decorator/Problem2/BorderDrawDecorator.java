package Decorator.Problem2;

public class BorderDrawDecorator extends ShapeDecorator {

    BorderDrawDecorator(Shape shape){super(shape);}

    @Override
    public void draw() {
        System.out.println( "draw border in the shape " + this.shape.shapeName);
    }
    
}
