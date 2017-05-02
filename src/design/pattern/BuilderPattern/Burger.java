package design.pattern.BuilderPattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
