package Decorator.Solution;

public class FilledColorDecorator extends ShapeDecorator {

    FilledColorDecorator(Shape shape){super(shape);}

    @Override
    public void draw() {
        System.out.println("fill color in " + this.shape.shapeName);
    }
    
}
