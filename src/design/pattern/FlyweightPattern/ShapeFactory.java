package design.pattern.FlyweightPattern;

import java.util.HashMap;

/**
 * Created by Rittick on 4/29/2017.
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);

        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: "+ color);
        }

        return circle;
    }
}
