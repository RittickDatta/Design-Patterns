package design.pattern.DecoratorPattern;

/**
 * Created by Rittick on 4/29/2017.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setborder(decoratedShape);
    }

    private void setborder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
