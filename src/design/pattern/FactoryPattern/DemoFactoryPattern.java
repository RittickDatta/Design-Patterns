package design.pattern.FactoryPattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public class DemoFactoryPattern {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = factory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = factory.getShape("SQUARE");
        shape3.draw();

    }
}
