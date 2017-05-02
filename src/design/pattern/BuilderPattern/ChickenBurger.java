package design.pattern.BuilderPattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
