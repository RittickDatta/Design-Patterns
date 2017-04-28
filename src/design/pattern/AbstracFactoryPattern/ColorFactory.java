package design.pattern.AbstracFactoryPattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null){
            return null;
        }

        if (color == "RED"){
            return new Red();
        }

        if(color == "BLUE"){
            return new Blue();
        }

        if(color == "GREEN"){
            return new Green();
        }

        return  null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
