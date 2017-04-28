package design.pattern.AbstracFactoryPattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
