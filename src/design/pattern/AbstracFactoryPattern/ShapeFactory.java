package design.pattern.AbstracFactoryPattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {

        if(shape == null){
            return null;
        }

        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }

        if(shape.equalsIgnoreCase(("RECTANGLE"))){
            return new Rectangle();
        }

        if (shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }


        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
