package design.pattern.FactoryPattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }

        if(shapeType.equalsIgnoreCase(("RECTANGLE"))){
            return new Rectangle();
        }

        if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

}
