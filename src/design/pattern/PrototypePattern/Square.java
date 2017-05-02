package design.pattern.PrototypePattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
