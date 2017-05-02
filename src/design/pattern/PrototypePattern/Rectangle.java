package design.pattern.PrototypePattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
