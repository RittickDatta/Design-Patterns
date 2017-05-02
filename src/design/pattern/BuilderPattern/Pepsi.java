package design.pattern.BuilderPattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 12.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
