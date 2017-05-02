package design.pattern.PrototypePattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
