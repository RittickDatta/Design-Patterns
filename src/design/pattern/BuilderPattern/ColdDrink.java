package design.pattern.BuilderPattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
