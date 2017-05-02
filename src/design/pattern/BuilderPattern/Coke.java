package design.pattern.BuilderPattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 10.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
